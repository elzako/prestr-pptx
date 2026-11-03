package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

public abstract class v5 {
   public abstract com.aspose.slides.ms.System.y8 s7();

   public abstract int t2();

   public abstract Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3);

   public int x8() {
      return 0;
   }

   public int n3() {
      return 0;
   }

   public boolean n5(v5 var1) {
      return false;
   }

   public abstract boolean e2();

   public abstract boolean t9();

   public abstract e3m c8();

   public abstract r5 y4();

   public abstract int l6(Object var1, Object var2);

   public abstract Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, boolean var4);

   public abstract RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4);

   public abstract RuntimeException n5(Object var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4);

   public abstract int z3();

   public abstract v5 n5(z4 var1, com.aspose.slides.ms.System.Xml.z9 var2, j9e var3);

   public abstract v5 n5(j9e var1);

   public abstract void n5(d0 var1, x4 var2);

   public abstract boolean n5(Object var1, Object var2);

   public abstract boolean l6(v5 var1);

   public final String j5() {
      String var1 = com.aspose.slides.ms.System.d1.n5;
      int var2 = this.n3();
      switch (this.x8()) {
         case 0:
            if (var2 == 10) {
               var1 = "anySimpleType";
            } else {
               var1 = this.a6(var2);
            }
            break;
         case 1:
            if (var2 == 10) {
               var1 = "List of Union";
            } else {
               var1 = com.aspose.slides.ms.System.d1.n5(new String[]{"List of ", this.a6(var2)});
            }
            break;
         case 2:
            var1 = "Union";
      }

      return var1;
   }

   public final String a6(int var1) {
      switch (var1) {
         case 0:
            return "None";
         case 1:
            return "AnyType";
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 11:
         default:
            return com.aspose.slides.ms.System.s3.n5(f1c.class, var1);
         case 10:
            return "AnyAtomicType";
         case 12:
            return "String";
         case 13:
            return "Boolean";
         case 14:
            return "Decimal";
         case 15:
            return "Float";
         case 16:
            return "Double";
         case 17:
            return "Duration";
         case 18:
            return "DateTime";
         case 19:
            return "Time";
         case 20:
            return "Date";
         case 21:
            return "GYearMonth";
         case 22:
            return "GYear";
         case 23:
            return "GMonthDay";
         case 24:
            return "GDay";
         case 25:
            return "GMonth";
         case 26:
            return "HexBinary";
         case 27:
            return "Base64Binary";
         case 28:
            return "AnyUri";
         case 29:
            return "QName";
         case 30:
            return "Notation";
         case 31:
            return "NormalizedString";
         case 32:
            return "Token";
         case 33:
            return "Language";
         case 34:
            return "NmToken";
         case 35:
            return "Name";
         case 36:
            return "NCName";
         case 37:
            return "Id";
         case 38:
            return "Idref";
         case 39:
            return "Entity";
         case 40:
            return "Integer";
         case 41:
            return "NonPositiveInteger";
         case 42:
            return "NegativeInteger";
         case 43:
            return "Long";
         case 44:
            return "Int";
         case 45:
            return "Short";
         case 46:
            return "Byte";
         case 47:
            return "NonNegativeInteger";
         case 48:
            return "UnsignedLong";
         case 49:
            return "UnsignedInt";
         case 50:
            return "UnsignedShort";
         case 51:
            return "UnsignedByte";
         case 52:
            return "PositiveInteger";
      }
   }

   public static String n5(Object var0) {
      com.aspose.slides.ms.System.y8 var1 = com.aspose.slides.ms.System.j8.n5(var0);
      String var2 = com.aspose.slides.ms.System.d1.n5;
      if (var1 == com.aspose.slides.internal.v6g.k5.n5(IEnumerable.class) && var1 != com.aspose.slides.internal.v6g.k5.n5(String.class)) {
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
         IEnumerator var4 = com.aspose.slides.internal.v6g.k5.n5(var0, IEnumerable.class).iterator();
         if (var4.hasNext()) {
            var3.n5("{");
            Object var5 = var4.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.ms.System.v0.class)) {
               var3.n5(((com.aspose.slides.ms.System.v0)var5).n5("", com.aspose.slides.internal.x7n.l6.k5()));
            } else {
               var3.n5(var5.toString());
            }

            while (var4.hasNext()) {
               var3.n5(" , ");
               var5 = var4.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.ms.System.v0.class)) {
                  var3.n5(((com.aspose.slides.ms.System.v0)var5).n5("", com.aspose.slides.internal.x7n.l6.k5()));
               } else {
                  var3.n5(var5.toString());
               }
            }

            var3.n5("}");
            var2 = var3.toString();
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.ms.System.v0.class)) {
         var2 = ((com.aspose.slides.ms.System.v0)var0).n5("", com.aspose.slides.internal.x7n.l6.k5());
      } else {
         var2 = var0.toString();
      }

      return var2;
   }

   public static v5 u9(int var0) {
      return t4.n5(var0);
   }

   public static v5 h0(int var0) {
      return t4.l6(var0);
   }

   public static v5 l6(String var0) {
      return t4.n5(var0);
   }

   public static v5 l6(u1s[] var0, j9e var1) {
      return t4.n5(var0, var1);
   }

   public static String n5(String var0, com.aspose.slides.ms.System.Xml.z9 var1, o2 var2) {
      byte var3 = 5;
      boolean var4 = false;
      if (var0.length() > 5 && com.aspose.slides.ms.System.d1.n5(var0, "uuid:", (short)4)) {
         var4 = true;
      } else if (var0.length() > 9 && com.aspose.slides.ms.System.d1.n5(var0, "urn:uuid:", (short)4)) {
         var4 = true;
         var3 = 9;
      }

      String var5;
      if (var4) {
         var5 = var1.n5(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.d1.l6(var0, 0, var3),
               com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, var3, var0.length() - var3), com.aspose.slides.internal.x7n.l6.k5())
            })
         );
      } else {
         var5 = var0;
      }

      if (com.aspose.slides.ms.System.Xml.v8.n5(var2.l6, var5) || com.aspose.slides.ms.System.Xml.v8.n5(var2.k5, var5)) {
         var5 = var2.n5;
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2.h0, var5)) {
         var5 = var2.u9;
      }

      return var5;
   }
}
