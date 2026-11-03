package com.aspose.slides.internal.x9;

import com.aspose.slides.ms.System.q1;

public class z3 {
   private com.aspose.slides.internal.e5.z3 n5;
   private com.aspose.slides.internal.f2.u9 l6;
   private com.aspose.slides.internal.o9b.p8 k5 = new com.aspose.slides.internal.o9b.p8();
   private com.aspose.slides.internal.o9b.y1 u3 = new com.aspose.slides.internal.o9b.y1();
   private com.aspose.slides.internal.o9b.p8 a6 = new com.aspose.slides.internal.o9b.p8(-1, -1);
   private boolean u9;

   public z3(com.aspose.slides.internal.e5.z3 var1, com.aspose.slides.internal.f2.u9 var2, com.aspose.slides.internal.o9b.p8 var3) {
      this.n5 = var1;
      this.l6 = var2;
      var3.k5(this.k5);
      this.n5();
   }

   protected final void n5() {
      int var1 = -1;
      int var2 = -1;
      com.aspose.slides.internal.f2.k5 var3 = this.n5.l6().u3(this.l6).c8();
      if (var3.a6() != 9) {
         var1 = var3.l6(this.l6);
      }

      var3 = this.n5.l6().l6(this.l6).c8();
      if (var1 == -1 && var3.a6() != 9) {
         var1 = var3.l6(this.l6);
      }

      var3 = this.n5.n5().u3(this.l6).c8();
      if (var3.a6() != 9) {
         var2 = var3.l6(this.l6);
      }

      var3 = this.n5.n5().l6(this.l6).c8();
      if (var2 == -1 && var3.a6() != 9) {
         var2 = var3.l6(this.l6);
      }

      boolean var4 = false;
      int var5 = -1;
      int var6 = -1;
      var3 = this.n5.u3();
      if (var3.a6() != 9) {
         switch (var3.a6()) {
            case 125:
               if (var2 != -1) {
                  var5 = var2;
               }

               var4 = true;
               break;
            case 187:
               if (var2 != -1 && this.k5.l6() > var2) {
                  var5 = var2;
               }

               var4 = true;
               break;
            case 188:
               if (var2 != -1 && this.k5.l6() < var2) {
                  var5 = var2;
               }

               var4 = true;
               break;
            default:
               var5 = var3.l6(this.l6);
         }
      }

      var3 = this.n5.k5();
      if (var3.a6() != 9) {
         switch (var3.a6()) {
            case 125:
               if (var1 != -1) {
                  var6 = var1;
               }

               var4 = true;
               break;
            case 187:
               if (var1 != -1 && this.k5.k5() > var1) {
                  var6 = var1;
               }

               var4 = true;
               break;
            case 188:
               if (var1 != -1 && this.k5.k5() < var1) {
                  var6 = var1;
               }

               var4 = true;
               break;
            default:
               var6 = var3.l6(this.l6);
         }
      }

      com.aspose.slides.internal.o9b.p8 var7 = new com.aspose.slides.internal.o9b.p8();
      if (var4) {
         this.n5(this.k5.u3()).k5(var7);
      } else {
         this.k5.k5(var7);
      }

      com.aspose.slides.internal.o9b.p8 var8 = this.n5(var5, var6, var7.u3()).u3();
      var5 = var8.l6();
      var6 = var8.k5();
      if (var2 == -1) {
         var2 = this.n5(var5, this.n5.n5(), this.n5.u3());
      }

      if (var1 == -1) {
         var1 = this.n5(var6, this.n5.l6(), this.n5.k5());
      }

      this.u9 = false;
      int var9 = this.n5.h0();
      if (var9 == 57) {
         this.u9 = true;
      } else if (var9 == 42) {
         if (var5 <= var2 && var6 > var1) {
         }

         this.u9 = true;
      }

      int var10 = this.n5(var2, var5);
      int var11 = this.l6(var1, var6);
      this.a6 = new com.aspose.slides.internal.o9b.p8(var2, var1);
      com.aspose.slides.internal.o9b.y1.n5(new com.aspose.slides.internal.o9b.y2(var10, var11, var5, var6)).a6(this.u3);
   }

   private int n5(int var1, com.aspose.slides.internal.h2.b3 var2, com.aspose.slides.internal.f2.k5 var3) {
      boolean var4 = var3.a6() != 187;
      boolean var5 = var3.a6() != 188;
      com.aspose.slides.internal.f2.k5 var6 = var2.k5(this.l6).c8();
      if (var6.a6() != 9) {
         int var7 = var6.l6(this.l6);
         if (var7 != -1 && var5) {
            var1 = q1.l6(var1, var7);
         }
      }

      var6 = var2.l6(this.l6).c8();
      if (var6.a6() != 9) {
         int var9 = var6.l6(this.l6);
         if (var9 != -1 && var4) {
            var1 = q1.n5(var1, var9);
         }
      }

      return var1;
   }

   private com.aspose.slides.internal.o9b.p8 n5(com.aspose.slides.internal.o9b.p8 var1) {
      com.aspose.slides.internal.o9b.p8 var2 = new com.aspose.slides.internal.o9b.p8(var1.k5(), var1.l6());
      int var3 = this.n5(var1.l6(), this.n5.n5(), this.n5.u3());
      int var4 = this.n5(var1.k5(), this.n5.l6(), this.n5.k5());
      int var5 = this.n5.a6();
      if (var5 == 154) {
         double var6 = (double)var3 / var1.l6();
         double var8 = (double)var4 / var1.k5();
         if (var6 < var8) {
            var2.n5(var3);
            var2.l6(com.aspose.slides.internal.v6g.k5.u3(var6 * var1.k5(), 14));
         } else if (var6 > var8) {
            var2.n5(com.aspose.slides.internal.v6g.k5.u3(var8 * var1.l6(), 14));
            var2.l6(var4);
         }
      } else {
         var2.n5(var3);
         var2.l6(var4);
      }

      return var2;
   }

   private com.aspose.slides.internal.o9b.p8 n5(int var1, int var2, com.aspose.slides.internal.o9b.p8 var3) {
      com.aspose.slides.internal.o9b.p8 var4 = new com.aspose.slides.internal.o9b.p8(var1, var2);
      int var5 = this.n5.a6();
      if (var5 == 154 || var1 == -1 || var2 == -1) {
         if (var1 == -1 && var2 == -1) {
            var4.n5(var3.l6());
            var4.l6(var3.k5());
         } else if (var1 == -1) {
            if (var3.k5() == 0) {
               var4.n5(0);
            } else {
               var4.n5(com.aspose.slides.internal.v6g.k5.u3((double)var3.l6() * var2 / var3.k5(), 14));
            }
         } else if (var2 == -1) {
            if (var3.l6() == 0) {
               var4.l6(0);
            } else {
               var4.l6(com.aspose.slides.internal.v6g.k5.u3((double)var3.k5() * var1 / var3.l6(), 14));
            }
         } else if (var3.l6() != 0 && var3.k5() != 0) {
            double var6 = (double)var1 / var3.l6();
            double var8 = (double)var2 / var3.k5();
            if (var6 < var8) {
               var4.l6(com.aspose.slides.internal.v6g.k5.u3(var6 * var3.k5(), 14));
            } else if (var6 > var8) {
               var4.n5(com.aspose.slides.internal.v6g.k5.u3(var8 * var3.l6(), 14));
            }
         } else {
            var4.n5(0);
            var4.l6(0);
         }
      }

      return var4;
   }

   public final int n5(int var1, int var2) {
      int var3 = 0;
      switch (this.n5.s7()) {
         case 23:
            var3 = (var1 - var2) / 2;
            break;
         case 39:
            var3 = var1 - var2;
         case 70:
         case 135:
      }

      return var3;
   }

   public final int l6(int var1, int var2) {
      int var3 = 0;
      switch (this.n5.t2()) {
         case 3:
            var3 = var1 - var2;
         case 9:
         case 13:
         default:
            break;
         case 23:
            var3 = (var1 - var2) / 2;
      }

      return var3;
   }

   public final com.aspose.slides.internal.o9b.y1 l6() {
      return this.u3;
   }

   public final com.aspose.slides.internal.o9b.p8 k5() {
      return this.a6;
   }

   public final boolean u3() {
      return this.u9;
   }
}
