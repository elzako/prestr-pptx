package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.b8c.f2i;

public class f4 {
   private static u4 k5 = u4.n5().l6();
   public static char[] n5 = new char[]{'\n', '\r', '\t'};
   public static final char[] l6 = new char[]{' ', '\t', '\n', '\r'};

   public static byte[] n5(String var0, boolean var1) {
      if (var0 == null) {
         throw new ArgumentNullException("s");
      } else {
         return com.aspose.slides.ms.System.Xml.k5.n5(com.aspose.slides.ms.System.d1.c8(var0), var1);
      }
   }

   public static String n5(byte[] var0) {
      if (var0 == null) {
         throw new ArgumentNullException("inArray");
      } else {
         return u3.n5(var0, 0, var0.length);
      }
   }

   public static String n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("name");
      } else if (var0.length() == 0) {
         throw new ArgumentNullException("name", v3.n5("The empty string '' is not a valid name."));
      } else {
         int var1 = y5.k5(var0, 0);
         if (var1 != var0.length()) {
            throw k5(var0, var1, 1);
         } else {
            return var0;
         }
      }
   }

   public static Exception l6(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = y5.k5(var0, 0);
         return var1 != var0.length()
            ? new XmlException(
               var1 == 0
                  ? "Name cannot begin with the '{0}' character, hexadecimal value {1}."
                  : "The '{0}' character, hexadecimal value {1}, cannot be included in a name.",
               XmlException.buildCharExceptionArgs(var0, var1)
            )
            : null;
      } else {
         return new XmlException("The empty string '' is not a valid name.", com.aspose.slides.ms.System.d1.n5);
      }
   }

   public static String n5(String var0, int var1) {
      if (var0 != null && var0.length() != 0) {
         int var2 = -1;
         int[] var3 = new int[]{-1};
         int var4 = y5.n5(var0, 0, var3);
         var2 = var3[0];
         if (var4 != var0.length()) {
            throw n5(
               "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(var0, var4), var1, 0, var4 + 1
            );
         } else {
            return var0;
         }
      } else {
         throw new ArgumentNullException("name");
      }
   }

   public static String k5(String var0) {
      return l6(var0, 1);
   }

   public static String l6(String var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("name");
      } else if (var0.length() == 0) {
         throw new ArgumentNullException("name", v3.n5("The empty string '' is not a valid local name."));
      } else {
         int var2 = y5.u3(var0, 0);
         if (var2 != var0.length()) {
            throw k5(var0, var2, var1);
         } else {
            return var0;
         }
      }
   }

   public static Exception u3(String var0) {
      int var1 = y5.l6(var0);
      return var1 != 0 && var1 == var0.length() ? null : y5.l6(var0, 0, var1);
   }

   public static String a6(String var0) {
      if (var0 != null && var0.length() != 0) {
         if (var0.charAt(0) != ' '
            && var0.charAt(var0.length() - 1) != ' '
            && com.aspose.slides.ms.System.d1.n5(var0, n5) == -1
            && com.aspose.slides.ms.System.d1.u9(var0, "  ", (short)4) == -1) {
            return var0;
         } else {
            throw new XmlException(
               "line-feed (#xA) or tab (#x9) characters, leading or trailing spaces and sequences of one or more spaces (#x20) are not allowed in 'xs:token'.",
               var0
            );
         }
      } else {
         return var0;
      }
   }

   public static Exception u9(String var0) {
      if (var0 != null && var0.length() != 0) {
         return var0.charAt(0) != ' '
               && var0.charAt(var0.length() - 1) != ' '
               && com.aspose.slides.ms.System.d1.n5(var0, n5) == -1
               && com.aspose.slides.ms.System.d1.u9(var0, "  ", (short)4) == -1
            ? null
            : new XmlException(
               "line-feed (#xA) or tab (#x9) characters, leading or trailing spaces and sequences of one or more spaces (#x20) are not allowed in 'xs:token'.",
               var0
            );
      } else {
         return null;
      }
   }

   public static Exception h0(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = y5.l6(var0, 0);
         return var1 != var0.length()
            ? new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(var0, var1))
            : null;
      } else {
         return new XmlException("The empty string '' is not a valid name.", com.aspose.slides.ms.System.d1.n5);
      }
   }

   public static Exception c8(String var0) {
      return com.aspose.slides.ms.System.d1.n5(var0, n5) != -1
         ? new XmlSchemaException("Carriage return (#xD), line feed (#xA), and tab (#x9) characters are not allowed in xs:normalizedString.", var0)
         : null;
   }

   public static String n5(boolean var0) {
      return var0 ? "true" : "false";
   }

   public static String n5(char var0) {
      return com.aspose.slides.ms.System.t9.n5(var0, (com.aspose.slides.ms.System.h2)null);
   }

   public static String n5(com.aspose.slides.ms.System.c4 var0) {
      return var0.n5(null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String n5(byte var0) {
      return com.aspose.slides.ms.System.f5.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String n5(short var0) {
      return com.aspose.slides.ms.System.f0.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String n5(int var0) {
      return com.aspose.slides.ms.System.a3.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String n5(long var0) {
      return com.aspose.slides.ms.System.p3.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String l6(byte var0) {
      return com.aspose.slides.ms.System.e2.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String l6(int var0) {
      return com.aspose.slides.ms.System.c3.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String l6(long var0) {
      return com.aspose.slides.ms.System.l4.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String k5(long var0) {
      return com.aspose.slides.ms.System.a7.n5(var0, null, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String n5(float var0) {
      if (com.aspose.slides.ms.System.n1.u3(var0)) {
         return "-INF";
      } else if (com.aspose.slides.ms.System.n1.a6(var0)) {
         return "INF";
      } else {
         return k5(var0) ? "-0" : com.aspose.slides.ms.System.n1.n5(var0, "R", com.aspose.slides.internal.x7n.l6.k5());
      }
   }

   public static String n5(double var0) {
      if (com.aspose.slides.ms.System.d2.u3(var0)) {
         return "-INF";
      } else if (com.aspose.slides.ms.System.d2.a6(var0)) {
         return "INF";
      } else {
         return k5(var0) ? "-0" : com.aspose.slides.ms.System.d2.n5(var0, "R", com.aspose.slides.internal.x7n.l6.k5());
      }
   }

   @Deprecated
   public static String n5(com.aspose.slides.ms.System.j5 var0) {
      return n5(var0.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffzzzzzz");
   }

   public static String n5(com.aspose.slides.ms.System.j5 var0, String var1) {
      return var0.n5(var1, com.aspose.slides.internal.x7n.u3.w1());
   }

   public static String n5(com.aspose.slides.ms.System.o0 var0) {
      return var0.toString();
   }

   public static boolean t2(String var0) {
      var0 = j5(var0);
      if ("1".equals(var0) || "true".equals(var0)) {
         return true;
      } else if (!"0".equals(var0) && !"false".equals(var0)) {
         throw new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Boolean"));
      } else {
         return false;
      }
   }

   public static Exception n5(String var0, boolean[] var1) {
      var0 = j5(var0);
      if ("0".equals(var0) || "false".equals(var0)) {
         var1[0] = false;
         return null;
      } else if (!"1".equals(var0) && !"true".equals(var0)) {
         var1[0] = false;
         return new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Boolean"));
      } else {
         var1[0] = true;
         return null;
      }
   }

   public static char s7(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("s");
      } else if (var0.length() != 1) {
         throw new FormatException(v3.n5("String must be exactly one character long."));
      } else {
         return var0.charAt(0);
      }
   }

   public static Exception n5(String var0, char[] var1) {
      return !com.aspose.slides.ms.System.t9.n5(var0, var1) ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Char")) : null;
   }

   public static com.aspose.slides.ms.System.c4 x8(String var0) {
      return com.aspose.slides.ms.System.c4.n5(var0, 39, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception n5(String var0, com.aspose.slides.ms.System.c4[] var1) {
      return !com.aspose.slides.ms.System.c4.n5(var0, 39, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Decimal"))
         : null;
   }

   public static com.aspose.slides.ms.System.c4 n3(String var0) {
      return com.aspose.slides.ms.System.c4.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception l6(String var0, com.aspose.slides.ms.System.c4[] var1) {
      return !com.aspose.slides.ms.System.c4.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Integer"))
         : null;
   }

   public static byte y4(String var0) {
      return com.aspose.slides.ms.System.f5.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception n5(String var0, byte[] var1) {
      return !com.aspose.slides.ms.System.f5.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "SByte"))
         : null;
   }

   public static Exception n5(String var0, short[] var1) {
      return !com.aspose.slides.ms.System.f0.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Int16"))
         : null;
   }

   public static int e2(String var0) {
      return com.aspose.slides.ms.System.a3.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception n5(String var0, int[] var1) {
      return !com.aspose.slides.ms.System.a3.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Int32"))
         : null;
   }

   public static long t9(String var0) {
      return com.aspose.slides.ms.System.p3.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception n5(String var0, long[] var1) {
      return !com.aspose.slides.ms.System.p3.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Int64"))
         : null;
   }

   public static byte z1(String var0) {
      return com.aspose.slides.ms.System.e2.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception l6(String var0, byte[] var1) {
      return !com.aspose.slides.ms.System.e2.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Byte"))
         : null;
   }

   public static int t4(String var0) {
      return com.aspose.slides.ms.System.c3.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception l6(String var0, int[] var1) {
      return !com.aspose.slides.ms.System.c3.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "UInt16"))
         : null;
   }

   public static long q0(String var0) {
      return com.aspose.slides.ms.System.l4.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception l6(String var0, long[] var1) {
      return !com.aspose.slides.ms.System.l4.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "UInt32"))
         : null;
   }

   public static long z3(String var0) {
      return com.aspose.slides.ms.System.a7.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Exception k5(String var0, long[] var1) {
      return !com.aspose.slides.ms.System.a7.n5(var0, 3, com.aspose.slides.internal.x7n.l6.k5(), var1)
         ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "UInt64"))
         : null;
   }

   public static float m1(String var0) {
      var0 = j5(var0);
      if ("-INF".equals(var0)) {
         return Float.NEGATIVE_INFINITY;
      }

      if ("INF".equals(var0)) {
         return Float.POSITIVE_INFINITY;
      }

      float var1 = com.aspose.slides.ms.System.n1.n5(var0, 164, com.aspose.slides.internal.x7n.l6.k5());
      return var1 == 0.0F && var0.charAt(0) == '-' ? -0.0F : var1;
   }

   public static Exception n5(String var0, float[] var1) {
      var0 = j5(var0);
      if ("-INF".equals(var0)) {
         var1[0] = Float.NEGATIVE_INFINITY;
         return null;
      }

      if ("INF".equals(var0)) {
         var1[0] = Float.POSITIVE_INFINITY;
         return null;
      }

      if (!com.aspose.slides.ms.System.n1.n5(var0, 164, com.aspose.slides.internal.x7n.l6.k5(), var1)) {
         return new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Single"));
      }

      if (var1[0] == 0.0F && var0.charAt(0) == '-') {
         var1[0] = -0.0F;
      }

      return null;
   }

   public static double k7(String var0) {
      var0 = j5(var0);
      if ("-INF".equals(var0)) {
         return Double.NEGATIVE_INFINITY;
      }

      if ("INF".equals(var0)) {
         return Double.POSITIVE_INFINITY;
      }

      double var1 = com.aspose.slides.ms.System.d2.n5(var0, 167, com.aspose.slides.internal.x7n.l6.k5());
      return var1 == 0.0 && var0.charAt(0) == '-' ? -0.0 : var1;
   }

   public static Exception n5(String var0, double[] var1) {
      var0 = j5(var0);
      if ("-INF".equals(var0)) {
         var1[0] = Double.NEGATIVE_INFINITY;
         return null;
      }

      if ("INF".equals(var0)) {
         var1[0] = Double.POSITIVE_INFINITY;
         return null;
      }

      if (!com.aspose.slides.ms.System.d2.n5(var0, 164, com.aspose.slides.internal.x7n.l6.k5(), var1)) {
         return new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Double"));
      }

      if (var1[0] == 0.0 && var0.charAt(0) == '-') {
         var1[0] = -0.0;
      }

      return null;
   }

   public static double n5(Object var0) {
      String var1 = com.aspose.slides.internal.v6g.k5.n5(var0, String.class);
      if (var1 != null) {
         var1 = j5(var1);
         if (var1.length() != 0 && var1.charAt(0) != '+') {
            double var2 = 0.0;
            double[] var4 = new double[]{0.0};
            boolean var5 = com.aspose.slides.ms.System.d2.n5(var1, 38, com.aspose.slides.internal.x7n.l6.k5(), var4);
            var2 = var4[0];
            if (var5) {
               return var2;
            }
         }

         return Double.NaN;
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)) {
            return com.aspose.slides.internal.v6g.k5.u3(var0, double.class);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0, Boolean.class)) {
            return com.aspose.slides.internal.v6g.k5.u3(var0, boolean.class) ? 1.0 : 0.0;
         }

         try {
            return com.aspose.slides.ms.System.z3.n3(var0, com.aspose.slides.internal.x7n.l6.k5());
         } catch (FormatException var7) {
         } catch (OverflowException var8) {
         } catch (ArgumentNullException var9) {
         }

         return Double.NaN;
      }
   }

   public static String l6(Object var0) {
      String var1 = com.aspose.slides.internal.v6g.k5.n5(var0, String.class);
      if (var1 != null) {
         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)) {
         return com.aspose.slides.ms.System.d2.n5(com.aspose.slides.internal.v6g.k5.u3(var0, double.class), "R", com.aspose.slides.internal.x7n.l6.k5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Boolean.class)) {
         return com.aspose.slides.internal.v6g.k5.u3(var0, boolean.class) ? "true" : "false";
      } else {
         return com.aspose.slides.ms.System.z3.t9(var0, com.aspose.slides.internal.x7n.l6.k5());
      }
   }

   public static double l6(double var0) {
      double var2 = com.aspose.slides.ms.System.q1.u3(var0);
      return var0 - var2 == 0.5 ? var2 + 1.0 : var2;
   }

   public static RuntimeException n5(String var0, com.aspose.slides.ms.System.s4[] var1) {
      f2i var2 = new f2i();
      f2i[] var3 = new f2i[]{var2};
      RuntimeException var4 = f2i.n5(var0, var3);
      var3[0].n5(var2);
      if (var4 != null) {
         com.aspose.slides.ms.System.s4.l6.u3(var1[0]);
         return var4;
      } else {
         return var2.n5(var1);
      }
   }

   public static com.aspose.slides.ms.System.o0 m3(String var0) {
      return new com.aspose.slides.ms.System.o0(var0);
   }

   public static Exception n5(String var0, com.aspose.slides.ms.System.o0[] var1) {
      FormatException var2 = null;
      com.aspose.slides.ms.System.o0.n5.k5(var1[0]);

      try {
         var1[0] = new com.aspose.slides.ms.System.o0(var0);
      } catch (ArgumentException var4) {
         var2 = new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Guid"));
      } catch (FormatException var5) {
         var2 = new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Guid"));
      }

      return var2;
   }

   public static com.aspose.slides.ms.System.r8 z8(String var0) {
      if (var0 != null && var0.length() > 0) {
         var0 = j5(var0);
         if (var0.length() == 0 || com.aspose.slides.ms.System.d1.u9(var0, "##", (short)4) != -1) {
            throw new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Uri"));
         }
      }

      com.aspose.slides.ms.System.r8 var1 = null;
      com.aspose.slides.ms.System.r8[] var2 = new com.aspose.slides.ms.System.r8[]{var1};
      boolean var3 = !com.aspose.slides.ms.System.r8.n5(var0, 0, var2);
      var1 = var2[0];
      if (var3) {
         throw new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Uri"));
      } else {
         return var1;
      }
   }

   public static Exception n5(String var0, com.aspose.slides.ms.System.r8[] var1) {
      var1[0] = null;
      if (var0 != null && var0.length() > 0) {
         var0 = j5(var0);
         if (var0.length() == 0 || com.aspose.slides.ms.System.d1.u9(var0, "##", (short)4) != -1) {
            return new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Uri"));
         }
      }

      return !com.aspose.slides.ms.System.r8.n5(var0, 0, var1) ? new FormatException(v3.n5("The string '{0}' is not a valid {1} value.", var0, "Uri")) : null;
   }

   public static boolean n5(char[] var0, int var1, int var2, String var3) {
      if (var2 != var3.length()) {
         return false;
      }

      int var4 = 0;

      while (var4 < var2 && var0[var1 + var4] == var3.charAt(var4)) {
         var4++;
      }

      return var4 == var2;
   }

   public static String j5(String var0) {
      return com.aspose.slides.ms.System.d1.k5(var0, l6);
   }

   public static String w1(String var0) {
      return com.aspose.slides.ms.System.d1.u3(var0, l6);
   }

   public static String r4(String var0) {
      return com.aspose.slides.ms.System.d1.a6(var0, l6);
   }

   public static String[] c4(String var0) {
      return com.aspose.slides.ms.System.d1.n5(var0, l6, (short)1);
   }

   public static boolean k5(double var0) {
      return var0 == 0.0 && u3(var0) == u3(-0.0);
   }

   private static long u3(double var0) {
      return com.aspose.slides.ms.System.x8.l6(var0);
   }

   public static void n5(String var0, int var1, int var2) {
      if (var0 != null && var0.length() != 0) {
         int var3 = 0;
         int var4 = var0.length();

         while (true) {
            while (var3 >= var4 || (k5.n5[var0.charAt(var3)] & 255 & 16) == 0) {
               if (var3 == var4) {
                  return;
               }

               char var5 = var0.charAt(var3);
               if (!u4.n5((int)var5)) {
                  throw l6(var0, var3, var1);
               }

               if (var3 + 1 == var4) {
                  throw n5("The surrogate pair is invalid. Missing a low surrogate character.", var2, 0, var3 + 1);
               }

               var5 = var0.charAt(var3 + 1);
               if (!u4.l6((int)var5)) {
                  throw n5(var0.charAt(var3 + 1), var0.charAt(var3), var2, 0, var3 + 1);
               }

               var3 += 2;
            }

            var3++;
         }
      }
   }

   public static Exception n5(String var0, int var1, int var2, int var3) {
      switch (var1) {
         case 0:
            return new ArgumentException(v3.n5(var0));
         case 1:
         default:
            return new XmlException(var0, com.aspose.slides.ms.System.d1.n5, var2, var3);
      }
   }

   public static Exception n5(String var0, String var1, int var2, int var3, int var4) {
      switch (var2) {
         case 0:
            return new ArgumentException(v3.n5(var0, var1));
         case 1:
         default:
            return new XmlException(var0, var1, var3, var4);
      }
   }

   public static Exception n5(String var0, String[] var1, int var2) {
      return n5(var0, var1, var2, 0, 0);
   }

   public static Exception n5(String var0, String[] var1, int var2, int var3, int var4) {
      switch (var2) {
         case 0:
            return new ArgumentException(v3.n5(var0, var1));
         case 1:
         default:
            return new XmlException(var0, var1, var3, var4);
      }
   }

   public static Exception n5(char var0, char var1) {
      return n5(var0, var1, 0);
   }

   public static Exception n5(char var0, char var1, int var2) {
      return n5(var0, var1, var2, 0, 0);
   }

   public static Exception n5(char var0, char var1, int var2, int var3, int var4) {
      String[] var5 = new String[]{
         com.aspose.slides.ms.System.l4.n5(var1, "X", com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.l4.n5(var0, "X", com.aspose.slides.internal.x7n.l6.k5())
      };
      return n5(
         "The surrogate pair (0x{0}, 0x{1}) is invalid. A high surrogate character (0xD800 - 0xDBFF) must always be paired with a low surrogate character (0xDC00 - 0xDFFF).",
         var5,
         var2,
         var3,
         var4
      );
   }

   public static Exception l6(char var0) {
      return n5(var0, 0);
   }

   public static Exception n5(char var0, int var1) {
      return n5(var0, var1, 0, 0);
   }

   public static Exception n5(char var0, int var1, int var2, int var3) {
      return n5(
         "Invalid high surrogate character (0x{0}). A high surrogate character must have a value from range (0xD800 - 0xDBFF).",
         com.aspose.slides.ms.System.l4.n5(var0, "X", com.aspose.slides.internal.x7n.l6.k5()),
         var1,
         var2,
         var3
      );
   }

   public static Exception l6(String var0, int var1, int var2) {
      return n5("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var0, var1), var2, 0, var1 + 1);
   }

   public static Exception l6(char var0, char var1) {
      return l6(var0, var1, 0);
   }

   public static Exception l6(char var0, char var1, int var2) {
      return n5("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var0, var1), var2);
   }

   public static Exception k5(String var0, int var1, int var2) {
      return n5(
         var1 == 0
            ? "Name cannot begin with the '{0}' character, hexadecimal value {1}."
            : "The '{0}' character, hexadecimal value {1}, cannot be included in a name.",
         XmlException.buildCharExceptionArgs(var0, var1),
         var2,
         0,
         var1 + 1
      );
   }

   public static ArgumentException n5(String var0, String var1) {
      return var0 == null ? new ArgumentNullException(var1) : new ArgumentException(v3.n5("The empty string '' is not a valid name."), var1);
   }
}
