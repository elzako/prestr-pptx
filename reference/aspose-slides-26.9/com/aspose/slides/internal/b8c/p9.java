package com.aspose.slides.internal.b8c;

public class p9 {
   private p9$n5 n5 = null;
   private Object l6;
   private String k5;
   private v5 u3;
   private int a6 = 1;
   private boolean u9 = false;

   public final int n5() {
      return this.a6;
   }

   public final boolean l6() {
      return this.u9;
   }

   public final boolean k5() {
      return this.n5.n5();
   }

   public final com.aspose.slides.ms.System.c4[] u3() {
      return this.n5.l6();
   }

   public final Object a6() {
      return this.l6;
   }

   public final v5 u9() {
      return this.u3;
   }

   public p9(Object var1, String var2, v5 var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      if (var3.x8() == 1 || com.aspose.slides.internal.v6g.k5.l6(var3, d5.class) || com.aspose.slides.internal.v6g.k5.l6(var3, x9.class)) {
         this.u9 = true;
         this.a6 = com.aspose.slides.internal.v6g.k5.k5(var1, com.aspose.slides.ms.System.u3.class).a6();
      }
   }

   @Override
   public String toString() {
      return this.k5;
   }

   public final void h0() {
      if (this.n5 == null) {
         switch (this.u3.n3()) {
            case 14:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
               if (this.u9) {
                  this.n5 = new p9$n5(this.a6);

                  for (int var1 = 0; var1 < this.a6; var1++) {
                     com.aspose.slides.ms.System.z3.y4(
                           com.aspose.slides.internal.v6g.k5.k5(this.l6, com.aspose.slides.ms.System.u3.class).k5(var1), com.aspose.slides.internal.x7n.s7.x8()
                        )
                        .k7(this.n5.l6()[var1]);
                  }
               } else {
                  this.n5 = new p9$n5();
                  com.aspose.slides.ms.System.z3.y4(this.l6, com.aspose.slides.internal.x7n.s7.x8()).k7(this.n5.l6()[0]);
               }

               this.n5.n5(true);
               break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            default:
               if (this.u9) {
                  this.n5 = new p9$n5(this.a6);
               } else {
                  this.n5 = new p9$n5();
               }
         }
      }
   }

   private boolean l6(p9 var1) {
      for (int var2 = 0; var2 < this.n5(); var2++) {
         if (com.aspose.slides.ms.System.c4.h0(this.u3()[var2], var1.u3()[var2])) {
            return false;
         }
      }

      return true;
   }

   public final boolean n5(p9 var1) {
      if (this.n5() != var1.n5()) {
         return false;
      }

      if (this.u9() != var1.u9()) {
         if (!this.u9().l6(var1.u9())) {
            return false;
         }

         var1.h0();
         this.h0();
         if (this.k5() && var1.k5()) {
            return this.l6(var1);
         }
      }

      if (this.l6()) {
         if (var1.l6()) {
            return this.u9().l6(this.a6(), var1.a6()) == 0;
         }

         com.aspose.slides.ms.System.u3 var4 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), com.aspose.slides.ms.System.u3.class);
         x6[] var5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(var4), x6[].class);
         return var5 != null
            ? var5.length == 1 && com.aspose.slides.ms.System.u3.n5((Object)(var5)).k5(0).equals(var1.a6())
            : var4.a6() == 1 && var4.k5(0).equals(var1.a6());
      } else {
         if (!var1.l6()) {
            return this.a6().equals(var1.a6());
         }

         com.aspose.slides.ms.System.u3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.a6(), com.aspose.slides.ms.System.u3.class);
         x6[] var3 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(var2), x6[].class);
         return var3 != null
            ? var3.length == 1 && com.aspose.slides.ms.System.u3.n5((Object)(var3)).k5(0).equals(this.a6())
            : var2.a6() == 1 && var2.k5(0).equals(this.a6());
      }
   }
}
