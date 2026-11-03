package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.Generic.IGenericList;

public final class s0 extends v3 {
   private int n5;
   private IGenericList<j9> l6;
   private static final com.aspose.slides.internal.x7n.n5 u3 = com.aspose.slides.internal.x7n.l6.k5().t9();

   public s0(int var1, IGenericList<j9> var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   private s0(s0 var1) {
      super(var1);
      this.n5 = var1.n5;
      j9[] var2 = new j9[var1.l6.size()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = n5(var1.l6.get_Item(var3));
      }

      this.l6 = com.aspose.slides.ms.System.u3.n5(var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         this.l6.get_Item(var2).n5(var1);
      }
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      switch (this.n5) {
         case 7:
            return this.k5(var1);
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            return com.aspose.slides.ms.System.d1.n5;
         case 13:
            return this.u3(var1);
         case 14:
            return this.a6(var1);
         case 15:
            return this.u9(var1);
         case 16:
            return this.h0(var1);
         case 17:
            return this.c8(var1);
         case 18:
            return this.t2(var1);
         case 19:
            return this.s7(var1);
         case 20:
            return this.x8(var1);
         case 21:
            return this.n3(var1);
      }
   }

   public static String n5(double var0) {
      return com.aspose.slides.ms.System.d2.n5(var0, "R", com.aspose.slides.internal.x7n.s7.x8());
   }

   public static String n5(boolean var0) {
      return var0 ? "true" : "false";
   }

   private String k5(com.aspose.slides.internal.x6s.h0 var1) {
      if (this.l6.size() > 0) {
         Object var2 = this.l6.get_Item(0).n5(var1);
         switch (this.n5(var2)) {
            case 1:
               return (String)var2;
            case 2:
               return com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class) ? "true" : "false";
            case 3:
               com.aspose.slides.internal.x6s.a6 var3 = this.l6.get_Item(0).h0();
               return var3 != null ? var3.c8() : com.aspose.slides.ms.System.d1.n5;
            case 4:
               return ((com.aspose.slides.internal.x6s.a6)var2).c8();
            default:
               return n5(((Double)com.aspose.slides.internal.v6g.k5.u3(var2, double.class)).doubleValue());
         }
      } else {
         return var1.k5().c8();
      }
   }

   @Override
   public int u9() {
      if (this.n5 == 19) {
         return 0;
      } else {
         return this.n5 != 14 && this.n5 != 15 ? 1 : 2;
      }
   }

   private String u3(com.aspose.slides.internal.x6s.h0 var1) {
      int var2 = 0;
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      while (var2 < this.l6.size()) {
         var3.n5(this.l6.get_Item(var2++).n5(var1).toString());
      }

      return var3.toString();
   }

   private boolean a6(com.aspose.slides.internal.x6s.h0 var1) {
      String var2 = this.l6.get_Item(0).n5(var1).toString();
      String var3 = this.l6.get_Item(1).n5(var1).toString();
      return var2.length() >= var3.length() && com.aspose.slides.ms.System.d1.l6(var2, 0, var3, 0, var3.length()) == 0;
   }

   private boolean u9(com.aspose.slides.internal.x6s.h0 var1) {
      String var2 = this.l6.get_Item(0).n5(var1).toString();
      String var3 = this.l6.get_Item(1).n5(var1).toString();
      return u3.u3(var2, var3, 1073741824L) >= 0;
   }

   private String h0(com.aspose.slides.internal.x6s.h0 var1) {
      String var2 = this.l6.get_Item(0).n5(var1).toString();
      String var3 = this.l6.get_Item(1).n5(var1).toString();
      if (var3.length() == 0) {
         return var3;
      }

      int var4 = u3.u3(var2, var3, 1073741824L);
      return var4 < 1 ? com.aspose.slides.ms.System.d1.n5 : com.aspose.slides.ms.System.d1.l6(var2, 0, var4);
   }

   private String c8(com.aspose.slides.internal.x6s.h0 var1) {
      String var2 = this.l6.get_Item(0).n5(var1).toString();
      String var3 = this.l6.get_Item(1).n5(var1).toString();
      if (var3.length() == 0) {
         return var2;
      }

      int var4 = u3.u3(var2, var3, 1073741824L);
      return var4 < 0 ? com.aspose.slides.ms.System.d1.n5 : com.aspose.slides.ms.System.d1.k5(var2, var4 + var3.length());
   }

   private String t2(com.aspose.slides.internal.x6s.h0 var1) {
      String var2 = this.l6.get_Item(0).n5(var1).toString();
      double var3 = com.aspose.slides.ms.System.Xml.f4.l6(com.aspose.slides.ms.System.Xml.f4.n5(this.l6.get_Item(1).n5(var1))) - 1.0;
      if (com.aspose.slides.ms.System.d2.k5(var3) || var2.length() <= var3) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      if (this.l6.size() == 3) {
         double var5 = com.aspose.slides.ms.System.Xml.f4.l6(com.aspose.slides.ms.System.Xml.f4.n5(this.l6.get_Item(2).n5(var1)));
         if (com.aspose.slides.ms.System.d2.k5(var5)) {
            return com.aspose.slides.ms.System.d1.n5;
         }

         if (var3 < 0.0 || var5 < 0.0) {
            var5 += var3;
            if (!(var5 > 0.0)) {
               return com.aspose.slides.ms.System.d1.n5;
            }

            var3 = 0.0;
         }

         double var7 = var2.length() - var3;
         if (var5 > var7) {
            var5 = var7;
         }

         return com.aspose.slides.ms.System.d1.l6(var2, com.aspose.slides.internal.v6g.k5.u3(var3, 14), com.aspose.slides.internal.v6g.k5.u3(var5, 14));
      } else {
         if (var3 < 0.0) {
            var3 = 0.0;
         }

         return com.aspose.slides.ms.System.d1.k5(var2, com.aspose.slides.internal.v6g.k5.u3(var3, 14));
      }
   }

   private double s7(com.aspose.slides.internal.x6s.h0 var1) {
      return this.l6.size() > 0 ? this.l6.get_Item(0).n5(var1).toString().length() : var1.k5().c8().length();
   }

   private String x8(com.aspose.slides.internal.x6s.h0 var1) {
      String var2;
      if (this.l6.size() > 0) {
         var2 = this.l6.get_Item(0).n5(var1).toString();
      } else {
         var2 = var1.k5().c8();
      }

      var2 = com.aspose.slides.ms.System.Xml.f4.j5(var2);
      int var3 = 0;
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      boolean var5 = true;
      com.aspose.slides.ms.System.Xml.u4 var6 = com.aspose.slides.ms.System.Xml.u4.n5().l6();

      while (var3 < var2.length()) {
         if (!var6.n5(var2.charAt(var3))) {
            var5 = true;
            var4.n5(var2.charAt(var3));
         } else if (var5) {
            var5 = false;
            var4.n5(' ');
         }

         var3++;
      }

      return var4.toString();
   }

   private String n3(com.aspose.slides.internal.x6s.h0 var1) {
      String var2 = this.l6.get_Item(0).n5(var1).toString();
      String var3 = this.l6.get_Item(1).n5(var1).toString();
      String var4 = this.l6.get_Item(2).n5(var1).toString();
      int var5 = 0;
      com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();

      while (var5 < var2.length()) {
         int var7 = com.aspose.slides.ms.System.d1.u3(var3, var2.charAt(var5));
         if (var7 != -1) {
            if (var7 < var4.length()) {
               var6.n5(var4.charAt(var7));
            }
         } else {
            var6.n5(var2.charAt(var5));
         }

         var5++;
      }

      return var6.toString();
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new s0(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
