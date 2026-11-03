package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OverflowException;
import java.util.Collection;

public abstract class d5 extends k8<d5> {
   public static final char[] EnumSeparatorCharArray = new char[]{','};
   private static final d5$l6 a = new d5$l6();

   public static void register(d5$n5 e) {
      synchronized (a) {
         a.put(e.getEnumClass(), e);
      }
   }

   private static d5$n5 a(Class<?> var0) {
      synchronized (a) {
         if (!a.containsKey(var0)) {
            try {
               Class.forName(var0.getName());
            } catch (Exception var4) {
            }

            if (!a.containsKey(var0)) {
               throw new IllegalStateException();
            }
         }

         return a.get(var0);
      }
   }

   private static d5$n5$n5 b(Class<?> var0) {
      d5$n5 var1 = a(var0);
      return var1.constants;
   }

   public static String getName(Class<?> enumType, long value) {
      return a(enumType).getName(value);
   }

   public static String getName(y8 enumType, Object value) {
      if (value == null) {
         throw new ArgumentNullException();
      }

      int var2 = y8.u3(j8.n5(value));
      long var3 = com.aspose.slides.internal.v6g.k5.u9(value, var2);
      return getName(enumType.z1(), var3);
   }

   public static long getValue(Class<?> enumType, String name) {
      return a(enumType).getValue(name, false);
   }

   public long get_Value() {
      throw new InvalidOperationException("should be overrided");
   }

   public String get_Caption() {
      throw new InvalidOperationException("should be overrided");
   }

   public static Collection<String> getNames(Class<?> enumType) {
      return b(enumType).keySet();
   }

   public static String[] getNames(y8 enumType) {
      return (String[])b(enumType.z1()).keySet().toArray(new String[0]);
   }

   public static u3 getValues(y8 enumType) {
      Collection var1 = b(enumType.z1()).values();
      return u3.n5((Object)(var1.toArray(new Long[0])));
   }

   @Deprecated
   public static boolean isDefined(Class<?> enumType, long value) {
      return b(enumType).containsValue(value);
   }

   public static boolean isDefined(y8 enumType, long value) {
      return isDefined(enumType.z1(), value);
   }

   public static boolean isDefined(y8 enumType, String value) {
      return b(enumType.z1()).containsKey(value);
   }

   public static boolean isDefined(y8 enumType, Object value) {
      if (value instanceof String) {
         return isDefined(enumType, (String)value);
      } else if (value instanceof Long) {
         return isDefined(enumType, ((Long)value).longValue());
      } else if (value instanceof Integer) {
         return isDefined(enumType, ((Integer)value).longValue());
      } else if (value instanceof Short) {
         return isDefined(enumType, ((Short)value).longValue());
      } else {
         return value instanceof Byte ? isDefined(enumType, ((Byte)value).longValue()) : false;
      }
   }

   public static String format(Class<?> enumType, long value, String format) {
      throw new NotImplementedException();
   }

   public static String format(y8 enumType, Object value, String format) {
      if (enumType == null) {
         throw new ArgumentNullException("enumType");
      }

      if (!enumType.d2()) {
         throw new ArgumentException("Type provided must be an Enum.", "enumType");
      }

      if (value == null) {
         throw new ArgumentNullException("value");
      }

      if (format == null) {
         throw new ArgumentNullException("format");
      }

      y8 var3 = com.aspose.slides.internal.v6g.k5.n5(value.getClass());
      y8 var4 = getUnderlyingType(enumType);
      long var5 = 0L;
      if (var3.d2()) {
         if (var3 != enumType) {
            throw new ArgumentException(
               d1.n5("Object must be the same type as the enum. The type passed in was '{0}'; the enum type was '{1}'.",new Object[]{ var3.toString(), enumType.toString()})
            );
         }

         if (var3.n5().k5(com.aspose.slides.internal.v6g.k5.n5(d5$u3.class))) {
            var5 = ((d5)value).get_Value();
         } else if (var3.k5(com.aspose.slides.internal.v6g.k5.n5(Long.class)) || var3.k5(com.aspose.slides.internal.v6g.k5.n5(long.class))) {
            var5 = (Long)value;
         } else if (var3.k5(com.aspose.slides.internal.v6g.k5.n5(String.class))) {
            var5 = getValue(enumType.z1(), (String)value);
         }
      } else {
         if (var3 != var4) {
            throw new ArgumentException(
               d1.n5(
                  "Enum underlying type and the object must be same type or object. Type passed in was '{0}'; the enum underlying type was '{1}'.",new Object[]{
                  var3.toString(),
                  var4.toString()
               })
            );
         }

         var5 = z3.t2(value);
      }

      if (format.length() != 1) {
         throw new FormatException("Format String can be only \"G\", \"g\", \"X\", \"x\", \"F\", \"f\", \"D\" or \"d\".");
      }

      char var7 = format.charAt(0);
      switch (var7) {
         case 'D':
         case 'd':
            return p3.l6(var5);
         case 'F':
         case 'f':
            return a(enumType.z1(), Long.valueOf(var5));
         case 'G':
         case 'g':
            return a(enumType.z1(), var5);
         case 'X':
         case 'x':
            return a(var5);
         default:
            throw new FormatException("Format String can be only \"G\", \"g\", \"X\", \"x\", \"F\", \"f\", \"D\" or \"d\".");
      }
   }

   private static String a(Class<?> var0, long var1) {
      return a(var0).internalFormat(var1);
   }

   private static String a(Class<?> var0, Long var1) {
      return a(var0).internalFlagsFormat(var1);
   }

   private static String a(Object var0) {
      switch (y8.u3(com.aspose.slides.internal.v6g.k5.n5(var0.getClass()))) {
         case 5:
            byte var7 = (Byte)var0;
            return f5.n5(var7, "X2", null);
         case 6:
            byte var6 = (Byte)var0;
            return e2.n5(var6, "X2", null);
         case 7:
            short var5 = (Short)var0;
            return f0.n5(var5, "X4", null);
         case 8:
            int var4 = (Integer)var0;
            return c3.n5(var4, "X4", null);
         case 9:
            int var1 = (Integer)var0;
            return a3.n5(var1, "X8", null);
         case 10:
            long var9 = (Long)var0;
            return l4.n5(var9, "X8", null);
         case 11:
            long var8 = (Long)var0;
            return p3.n5(var8, "X16", null);
         case 12:
            long var2 = (Long)var0;
            return a7.n5(var2, "X16", null);
         default:
            throw new InvalidOperationException("Unknown enum type.");
      }
   }

   public static String toString(Class<?> enumType, long value) {
      return a(enumType, value);
   }

   public static long parse(Class<?> enumType, String value) {
      return parse(enumType, value, false);
   }

   public static long parse(Class<?> enumType, String value, Boolean ignoreCase) {
      String[] var3 = d1.u9(value, EnumSeparatorCharArray);
      if (var3.length == 1) {
         long[] var4 = new long[1];
         if (p3.n5(value, 7, null, var4)) {
            if (var4[0] <= 2147483647L && var4[0] >= -2147483648L) {
               return var4[0];
            }

            throw new OverflowException();
         }
      }

      d5$n5 var11 = a(enumType);
      long var5 = 0L;

      for (String var10 : var3) {
         var5 |= var11.getValue(var10.trim(), ignoreCase);
      }

      return var5;
   }

   public static long parse(y8 enumType, String value) {
      return parse(enumType.z1(), value);
   }

   public static long parse(y8 enumType, String value, Boolean ignoreCase) {
      return parse(enumType.z1(), value, ignoreCase);
   }

   public static Class<? extends Number> getUnderlyingType(Class<?> enumType) {
      d5$n5 var1 = a(enumType);
      return var1.getUnderlineClass();
   }

   public static y8 getUnderlyingType(y8 enumType) {
      return com.aspose.slides.internal.v6g.k5.n5(getUnderlyingType(enumType.z1()));
   }

   public static Object toObject(y8 enumType, Object value) {
      throw new NotImplementedException();
   }

   public void CloneTo(d5 that) {
   }

   public d5 Clone() {
      return this;
   }
}
