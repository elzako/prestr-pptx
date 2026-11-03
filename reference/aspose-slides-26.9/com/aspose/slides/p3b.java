package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;

class p3b {
   private String n5;
   private final r6v l6;
   private final int k5;
   private final int u3;
   private final int a6;
   private b5v u9;
   private final IGenericList<a1h> h0;

   public final String n5() {
      return this.n5;
   }

   private void n5(String var1) {
      this.n5 = var1;
   }

   public final IGenericList<a1h> l6() {
      return this.h0;
   }

   public p3b(r6v var1, int var2, int var3, int var4) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.h0 = new List<>();
   }

   public p3b(r6v var1, int var2, int var3, int var4, b5v var5) {
      this(var1, var2, var3, var4);
      this.u9 = var5;
   }

   public final y9i k5() {
      this.l6.u3();
      y9i var1 = this.u3();
      if (var1 == null) {
         return null;
      } else if (this.l6.n5() != 0) {
         String var2 = "An unexpected token '{0}' is encountered at position {1}.";
         this.n5(com.aspose.slides.ms.System.d1.n5(var2,new Object[]{ this.l6.l6(), this.l6.k5()}));
         return null;
      } else {
         return var1;
      }
   }

   private y9i u3() {
      y9i var1 = this.a6();
      if (var1 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, l4s.class)) {
         return var1;
      }

      while (true) {
         byte var2;
         switch (this.l6.n5()) {
            case 13:
               var2 = 0;
               break;
            case 14:
               var2 = 1;
               break;
            case 15:
               var2 = 2;
               break;
            case 16:
               var2 = 3;
               break;
            case 17:
               var2 = 4;
               break;
            case 18:
               var2 = 5;
               break;
            default:
               return var1;
         }

         this.l6.u3();
         y9i var3 = this.a6();
         if (var3 == null) {
            return null;
         }

         var1 = new e0w(var2, var1, var3);
      }
   }

   private y9i a6() {
      y9i var1 = this.u9();
      if (var1 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, l4s.class)) {
         return var1;
      }

      while (true) {
         y9i var2 = null;
         switch (this.l6.n5()) {
            case 6:
               this.l6.u3();
               var2 = this.u9();
               if (var2 == null) {
                  return null;
               }

               var1 = new f5(0, var1, var2);
               break;
            case 7:
               this.l6.u3();
               var2 = this.u9();
               if (var2 == null) {
                  return null;
               }

               var1 = new f5(1, var1, var2);
               break;
            default:
               return var1;
         }
      }
   }

   private y9i u9() {
      y9i var1 = this.h0();
      if (var1 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, l4s.class)) {
         return var1;
      }

      while (true) {
         y9i var2 = null;
         switch (this.l6.n5()) {
            case 8:
               this.l6.u3();
               var2 = this.h0();
               if (var2 == null) {
                  return null;
               }

               var1 = new f5(2, var1, var2);
               break;
            case 9:
               this.l6.u3();
               var2 = this.h0();
               if (var2 == null) {
                  return null;
               }

               var1 = new f5(3, var1, var2);
               break;
            default:
               return var1;
         }
      }
   }

   private y9i h0() {
      y9i var1 = this.c8();
      if (var1 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, l4s.class)) {
         return var1;
      }

      while (this.l6.n5() == 10) {
         this.l6.u3();
         y9i var2 = this.c8();
         if (var2 == null) {
            return null;
         }

         var1 = new f5(4, var1, var2);
      }

      return var1;
   }

   private y9i c8() {
      y9i var1 = this.t2();
      if (var1 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, l4s.class)) {
         return var1;
      }

      while (this.l6.n5() == 11) {
         var1 = new n1(5, var1);
         this.l6.u3();
      }

      return var1;
   }

   private y9i t2() {
      if (this.l6.n5() == 6) {
         this.l6.u3();
         return this.t2();
      } else if (this.l6.n5() == 7) {
         this.l6.u3();
         y9i var1 = this.t2();
         return var1 == null ? null : new n1(1, var1);
      } else {
         return this.s7();
      }
   }

   private y9i s7() {
      y9i var1 = this.x8();
      switch (this.l6.n5()) {
         case 12:
            if (var1 == null) {
               return null;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var1, l4s.class)) {
               return var1;
            }

            this.l6.u3();
            y9i var6 = this.x8();
            if (var6 == null) {
               return null;
            }

            if (!com.aspose.slides.internal.v6g.k5.l6(var1, d0f.class) || !com.aspose.slides.internal.v6g.k5.l6(var6, d0f.class)) {
               String var8 = "An invalid range reference is encountered at position {0}.";
               this.n5(com.aspose.slides.ms.System.d1.n5(var8, new Object[]{this.l6.k5()}));
               return null;
            }

            a1h var7 = ((d0f)var1).n5();
            a1h var4 = ((d0f)var6).n5();
            c2e var5 = new c2e(var7, var4, var7.n5());
            var1 = new d0f(var5);
            this.h0.addItem(var5);
            break;
         case 23:
            String var2 = this.l6.l6();
            this.l6.u3();
            y9i var3 = this.a6();
            var1 = f2i.n5(var1, var3, var2);
      }

      return var1;
   }

   private y9i x8() {
      switch (this.l6.n5()) {
         case 1:
            return this.e2();
         case 2:
            q9 var16 = new q9(this.l6(this.l6.l6()));
            this.l6.u3();
            return var16;
         case 3:
            z6o var2 = new z6o(this.k5(this.l6.l6()));
            this.l6.u3();
            return var2;
         case 4:
            x1c var3 = new x1c(this.u3(this.l6.l6()));
            this.l6.u3();
            return var3;
         case 5:
            u5v var4 = new u5v(this.a6(this.l6.l6()));
            this.l6.u3();
            return var4;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 20:
         case 22:
         case 23:
         default:
            if (this.l6.n5() == 0) {
               this.n5("Unexpected end of the expression.");
            } else {
               String var1 = "An unexpected token \"{0}\" is encountered at position {1}.";
               this.n5(com.aspose.slides.ms.System.d1.n5(var1,new Object[]{ this.l6.l6(), this.l6.k5()}));
            }

            return null;
         case 19:
            return this.n3();
         case 21:
            return this.y4();
         case 24:
            a1h var5 = this.c8(this.l6.l6());
            d0f var24 = new d0f(var5);
            this.h0.addItem(var5);
            this.l6.u3();
            return var24;
         case 25:
            a1h var8 = this.u9(this.l6.l6());
            d0f var23 = new d0f(var8);
            this.h0.addItem(var8);
            this.l6.u3();
            return var23;
         case 26:
            a1h var10 = this.h0(this.l6.l6());
            d0f var22 = new d0f(var10);
            this.h0.addItem(var10);
            this.l6.u3();
            return var22;
         case 27:
            a1h var7 = this.t2(this.l6.l6());
            d0f var21 = new d0f(var7);
            this.h0.addItem(var7);
            this.l6.u3();
            return var21;
         case 28:
            a1h var9 = this.s7(this.l6.l6());
            d0f var20 = new d0f(var9);
            this.h0.addItem(var9);
            this.l6.u3();
            return var20;
         case 29:
            a1h var11 = this.x8(this.l6.l6());
            d0f var19 = new d0f(var11);
            this.h0.addItem(var11);
            this.l6.u3();
            return var19;
         case 30:
            l4s var15 = new l4s(this.l6.l6());
            this.l6.u3();
            return var15;
         case 31:
            a1h var12 = this.n3(this.l6.l6());
            d0f var18 = new d0f(var12);
            this.h0.addItem(var12);
            this.l6.u3();
            return var18;
         case 32:
            a1h var14 = this.e2(this.l6.l6());
            d0f var17 = new d0f(var14);
            this.h0.addItem(var14);
            this.l6.u3();
            return var17;
         case 33:
            a1h var13 = this.y4(this.l6.l6());
            d0f var6 = new d0f(var13);
            this.h0.addItem(var13);
            this.l6.u3();
            return var6;
      }
   }

   private boolean l6(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.t2(var1);
      return "TRUE".equals(var2);
   }

   private double k5(String var1) {
      return com.aspose.slides.ms.System.z3.n3(var1, com.aspose.slides.internal.x7n.l6.k5());
   }

   private String u3(String var1) {
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(var1, 1, var1.length() - 2), "\"\"", "\"");
   }

   private String a6(String var1) {
      return var1;
   }

   private y9i n3() {
      this.l6.u3();
      y9i var1 = this.u3();
      if (var1 == null) {
         return null;
      } else if (this.l6.n5() != 20) {
         this.n5("The close parenthesis is missed.");
         return null;
      } else {
         this.l6.u3();
         return new f4e(var1);
      }
   }

   private y9i y4() {
      String var1 = "_xlfn.";
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8("(_xlfn\\.)?(_xlws\\.)*([A-Z0-9\\.]+)\\(").l6(this.l6.l6());
      String var3;
      if (var2.u3()) {
         var3 = var2.a6().n5(3).k5();
      } else {
         var3 = com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.n5(this.l6.l6(), "_xlfn.", ""), '(');
      }

      x5y var4 = new x5y(var3);
      y9i var5 = null;
      this.l6.u3();

      while (this.l6.n5() != 20) {
         if (this.l6.n5() == 0) {
            String var6 = "The close parenthesis is missed for the {0} function.";
            this.n5(com.aspose.slides.ms.System.d1.n5(var6, new Object[]{var3}));
            return null;
         }

         if (this.l6.n5() == 22) {
            if (var5 == null) {
               var5 = new q1y();
               var4.n5(var5);
            }

            var5 = null;
            this.l6.u3();
            if (this.l6.n5() == 20) {
               var5 = new q1y();
               var4.n5(var5);
            }
         } else {
            var5 = this.u3();
            if (var5 == null) {
               return null;
            }

            var4.n5(var5);
         }
      }

      this.l6.u3();
      return var4;
   }

   private y9i e2() {
      if (com.aspose.slides.ms.System.t9.u9(this.l6.l6().charAt(0))) {
         this.l6.u3();
         return new l4s("#NAME?");
      } else {
         String var1 = "Undefined symbol sequence '{0}' is encountered at position {1}.";
         this.n5(com.aspose.slides.ms.System.d1.n5(var1,new Object[]{ this.l6.l6(), this.l6.k5()}));
         return null;
      }
   }

   private a1h u9(String var1) {
      a1h var2;
      if (this.a6 == 0) {
         var2 = com.aspose.slides.n5.n5(var1, this.k5, this.t9());
      } else {
         var2 = u1x.l6(var1, this.t9());
      }

      return var2;
   }

   private a1h h0(String var1) {
      a1h var2;
      if (this.a6 == 0) {
         var2 = com.aspose.slides.n5.l6(var1, this.u3, this.t9());
      } else {
         var2 = u1x.k5(var1, this.t9());
      }

      return var2;
   }

   private a1h c8(String var1) {
      a1h var2;
      if (this.a6 == 0) {
         var2 = com.aspose.slides.n5.n5(var1, this.u3, this.k5, this.t9());
      } else {
         var2 = u1x.n5(var1, this.t9());
      }

      return var2;
   }

   private a1h t2(String var1) {
      a1h var2;
      if (this.a6 == 0) {
         var2 = com.aspose.slides.n5.n5(var1, this.u3, this.k5);
      } else {
         var2 = u1x.n5(var1);
      }

      return var2;
   }

   private a1h s7(String var1) {
      return this.a6 == 0 ? com.aspose.slides.n5.n5(var1, this.k5) : u1x.l6(var1);
   }

   private a1h x8(String var1) {
      return this.a6 == 0 ? com.aspose.slides.n5.l6(var1, this.u3) : u1x.k5(var1);
   }

   private a1h n3(String var1) {
      return this.a6 == 0 ? com.aspose.slides.n5.l6(var1, this.u3, this.k5) : u1x.u3(var1);
   }

   private a1h y4(String var1) {
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8(a8v.a6().get_Item(3).l6()).l6(var1);
      if (!var2.u3()) {
         var2 = new com.aspose.slides.internal.r7c.c8(a8v.a6().get_Item(4).l6()).l6(var1);
      }

      return !var2.u3() ? null : this.n5(var2);
   }

   private a1h e2(String var1) {
      com.aspose.slides.internal.r7c.u3 var2 = new com.aspose.slides.internal.r7c.c8(a8v.a6().get_Item(0).l6()).l6(var1);
      if (!var2.u3()) {
         var2 = new com.aspose.slides.internal.r7c.c8(a8v.a6().get_Item(1).l6()).l6(var1);
      }

      if (!var2.u3()) {
         var2 = new com.aspose.slides.internal.r7c.c8(a8v.a6().get_Item(2).l6()).l6(var1);
      }

      return !var2.u3() ? null : this.n5(var2);
   }

   private a1h n5(com.aspose.slides.internal.r7c.u3 var1) {
      if (this.u9 == null) {
         return null;
      }

      String var2 = null;
      String[] var3 = new String[]{var2};
      l4a var4 = ((p4b)this.u9.n5()).n5(var1.a6().n5(1).k5(), var3);
      var2 = var3[0];
      if (var4 == null) {
         return null;
      }

      String var5 = var1.a6().n5(2).k5();
      if (var5 == null) {
         return null;
      }

      String var6;
      if (var1.a6().n5() == 4) {
         var6 = var4.n5(var5, var1.a6().n5(3).k5(), var1.a6().n5(4).k5(), this.k5);
      } else if (com.aspose.slides.ms.System.d1.l6(var5, "#")) {
         var6 = var4.n5(var5, var1.a6().n5(3).k5(), null, this.k5);
      } else {
         var6 = var4.n5(null, var5, var1.a6().n5(3).k5(), this.k5);
      }

      if (var6 == null) {
         return null;
      } else {
         return com.aspose.slides.ms.System.d1.u3(var6, ':') != -1
            ? this.n3(com.aspose.slides.ms.System.d1.n5("'", var2, "'!", var6))
            : this.t2(com.aspose.slides.ms.System.d1.n5("'", var2, "'!", var6));
      }
   }

   private String t9() {
      return this.u9 == null ? null : this.u9.l6();
   }
}
