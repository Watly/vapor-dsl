/**
 * This work is licensed under the 
 * Creative Commons Attribution-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/4.0/ 
 * or send a letter to 
 * Creative Commons, 
 * PO Box 1866, Mountain View, 
 * CA 94042, USA.
 */
package co.watly.converter

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService
import java.util.Date
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import java.text.SimpleDateFormat
import java.util.GregorianCalendar

class VaporValueConverter extends AbstractDeclarativeValueConverterService {
	
	private static final val DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static final val SHORT_MONTHS = #[4, 6, 9, 11];
	
	@ValueConverter(rule="DATE")
	def IValueConverter<Date> DATEValues() {
		return new IValueConverter<Date>() {
			override toString(Date value) throws ValueConverterException {
				try{ 
					return DATE_FORMAT.format(value);
				}
				catch(Exception e) {
					throw new ValueConverterException("Error while converting to String the Date " + value.toString, null, e);
				}
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				try {
					var split = string.split('/')
	
					var day = Integer.parseInt(split.get(0));
					if(day < 1 || day > 31) {
						throw new IllegalArgumentException("day must be a number between 1 and 31");
					}
	
					var month = Integer.parseInt(split.get(1))
					if(month < 1 || month > 12) {
						throw new IllegalArgumentException("month must be a number between 1 and 12");
					}
	
					if(day === 31 && SHORT_MONTHS.contains(month)) {
						throw new IllegalArgumentException("day must be at least 30 for this month");
					}
		
					var hourString = split.get(2)
					
					var year = Integer.parseInt(hourString.substring(0, hourString.indexOf(" ")))
					
					hourString = hourString.substring(hourString.indexOf(" ") + 1)
					split = hourString.split(":")
					
					var hour = Integer.parseInt(split.get(0));
					if(hour < 0 || hour > 23) {
						throw new IllegalArgumentException("hour must be a number between 0 and 23");
					}
					
					var minute = Integer.parseInt(split.get(1));
					if(minute < 0 || minute > 60) {
						throw new IllegalArgumentException("minute must be a number between 0 and 60");
					}
					
					var second = Integer.parseInt(split.get(2));
					if(second < 0 || second > 60) {
						throw new IllegalArgumentException("second must be a number between 0 and 60");
					}
					var date = DATE_FORMAT.parse(string);
					var calendar = new GregorianCalendar()
					calendar.setTime(date);
					if(month == 2 && day > 28 && !calendar.isLeapYear(year)) {
						throw new IllegalArgumentException("this month can have only 28 days in this year");
					}
					return date;
				}
				catch(Exception e) {
					throw new ValueConverterException("Error while converting to Date the string " + string, node, e);
				}
			}
		};
	}
}
