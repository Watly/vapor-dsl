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
package co.watly.converter;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class VaporValueConverter extends AbstractDeclarativeValueConverterService {
  private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  
  private final static List<Integer> SHORT_MONTHS = Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(9), Integer.valueOf(11)));
  
  @ValueConverter(rule = "DATE")
  public IValueConverter<Date> DATEValues() {
    return new IValueConverter<Date>() {
      @Override
      public String toString(final Date value) throws ValueConverterException {
        try {
          return VaporValueConverter.DATE_FORMAT.format(value);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            String _string = value.toString();
            String _plus = ("Error while converting to String the Date " + _string);
            throw new ValueConverterException(_plus, null, e);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      
      @Override
      public Date toValue(final String string, final INode node) throws ValueConverterException {
        try {
          String[] split = string.split("/");
          int day = Integer.parseInt(split[0]);
          if (((day < 1) || (day > 31))) {
            throw new IllegalArgumentException("day must be a number between 1 and 31");
          }
          int month = Integer.parseInt(split[1]);
          if (((month < 1) || (month > 12))) {
            throw new IllegalArgumentException("month must be a number between 1 and 12");
          }
          if (((day == 31) && VaporValueConverter.SHORT_MONTHS.contains(Integer.valueOf(month)))) {
            throw new IllegalArgumentException("day must be at least 30 for this month");
          }
          String hourString = split[2];
          int year = Integer.parseInt(hourString.substring(0, hourString.indexOf(" ")));
          int _indexOf = hourString.indexOf(" ");
          int _plus = (_indexOf + 1);
          hourString = hourString.substring(_plus);
          split = hourString.split(":");
          int hour = Integer.parseInt(split[0]);
          if (((hour < 0) || (hour > 23))) {
            throw new IllegalArgumentException("hour must be a number between 0 and 23");
          }
          int minute = Integer.parseInt(split[1]);
          if (((minute < 0) || (minute > 60))) {
            throw new IllegalArgumentException("minute must be a number between 0 and 60");
          }
          int second = Integer.parseInt(split[2]);
          if (((second < 0) || (second > 60))) {
            throw new IllegalArgumentException("second must be a number between 0 and 60");
          }
          Date date = VaporValueConverter.DATE_FORMAT.parse(string);
          GregorianCalendar calendar = new GregorianCalendar();
          calendar.setTime(date);
          if ((((month == 2) && (day > 28)) && (!calendar.isLeapYear(year)))) {
            throw new IllegalArgumentException("this month can have only 28 days in this year");
          }
          return date;
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            throw new ValueConverterException(("Error while converting to Date the string " + string), node, e);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    };
  }
}
