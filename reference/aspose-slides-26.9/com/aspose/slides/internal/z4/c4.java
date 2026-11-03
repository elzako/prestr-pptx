package com.aspose.slides.internal.z4;

public class c4 extends com.aspose.slides.internal.e1.y4 {
   private final s7 n5;
   private final com.aspose.slides.internal.g0.l6 l6 = new com.aspose.slides.internal.g0.l6();
   private boolean k5 = true;

   public c4(com.aspose.slides.internal.z0k.t4 var1, k7 var2) {
      this(new s7(var1, var2));
   }

   public c4(s7 var1) {
      this.n5 = var1;
   }

   public final void l6(com.aspose.slides.internal.e1.m3 var1, com.aspose.slides.internal.b8.s7 var2) {
      try {
         this.n5(var1, var2);
      } catch (com.aspose.slides.internal.g3.n5 var4) {
      }
   }

   public final void n5() {
      this.n5.n5();
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.w1 var1) {
      this.n5.n5(var1.n5().a6());
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.w1 var1) {
      this.n5.l6();
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.t2 var1) {
      this.n5.h0().n5((com.aspose.slides.internal.e1.p8)var1);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.t2 var1) {
      this.n5.h0().n5(var1);
   }

   @Override
   public boolean n5(com.aspose.slides.internal.e1.z3 var1) {
      this.n5.h0().n5(var1);
      return true;
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.z3 var1) {
      this.n5.h0().l6(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.z1 var1) {
      if (var1.u9() != null && var1.u9().n5() != 0 || var1.c8() != null && var1.c8().u9() != null && var1.c8().u9().n5() != 0) {
         this.n5.c8().n5();
         com.aspose.slides.internal.e1.r4 var2 = com.aspose.slides.internal.e1.r4.n5(var1);
         var2.n5(var1.a6());
         var2.n5(new com.aspose.slides.internal.w0.c8());
         var2.u3().l6(var1.n3().l6(), var1.n3().k5(), 1);
         if (var1.u3() != null) {
            var2.u3().n5(var1.u3(), 1);
         }

         var2.n5(var1.z1());
         var2.k5(var1.j5());
         this.n5.a6().n5(true);
         this.l6(var2);
         this.n5.a6().n5(false);
      } else {
         this.n5.h0().n5(var1);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.r4 var1) {
      if (this.k5) {
         this.k5 = this.k5(var1);
         if (this.k5) {
            if (this.n5.a6().e2()) {
               com.aspose.slides.internal.w0.s7 var2 = var1.l6();
               if (var2 != null) {
                  switch (var2.u9().n5()) {
                     case 0:
                        if (((com.aspose.slides.internal.w0.n3)var2.u9()).l6().l6() == 0) {
                           var1.n5((com.aspose.slides.internal.w0.s7)null);
                        }
                  }
               }

               com.aspose.slides.internal.w0.l6 var3 = var1.k5();
               if (var2 == null && var3 != null) {
                  switch (var3.n5()) {
                     case 0:
                        if (((com.aspose.slides.internal.w0.n3)var3).l6().l6() == 0) {
                           var1.n5((com.aspose.slides.internal.w0.l6)null);
                        }
                  }
               }

               new n5(this.l6().a6()).k5(var1);
               if (var1.k5() == null && var1.l6() == null) {
                  if (var1.n3() != null) {
                     this.n5.h0().n5(var1.n3());
                  }

                  this.k5 = false;
               } else {
                  this.n5.h0().n5(var1);
               }
            } else {
               this.n5.h0().n5(var1);
            }
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.r4 var1) {
      if (this.k5) {
         this.n5.h0().l6(var1);
      }

      this.k5 = true;
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.c4 var1) {
      if (this.k5) {
         this.n5.h0().n5(var1);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.c4 var1) {
      if (this.k5) {
         this.n5.h0().l6(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.y2 var1) {
      if (this.k5) {
         this.n5.h0().n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      if (this.k5) {
         this.n5.h0().n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.k7 var1) {
      if (this.n5.a6().e2() && (var1.u9() != 1 && var1.u9() != 2 || this.n5.a6().l6().z3()) && l6(var1)) {
         var1 = new n5(this.n5.a6()).l6(var1);
      }

      var1 = var1.n5(this, this.l6, false, this.l6().a6().l6().z3());
      if (var1 != null) {
         this.n5.h0().n5(var1);
      }
   }

   private static boolean l6(com.aspose.slides.internal.e1.k7 var0) {
      com.aspose.slides.internal.j7.n5 var1 = new com.aspose.slides.internal.j7.n5(var0.u3());

      try {
         return !com.aspose.slides.internal.o9b.t4.k5(var1.c8().s7()) ? false : com.aspose.slides.internal.j7.n5.n5(var1.c8(), false, false).k5();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.u9 var1) {
      this.n5.h0().n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.j5 var1) {
      this.n5.h0().n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.s3 var1) {
      this.n5.u9().n5(var1, this.n5.h0());
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.x8 var1) {
      this.n5.u9().n5(var1, this.n5.h0());
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.s7 var1) {
      this.n5.u9().n5(var1, this.n5.h0());
   }

   private boolean k5(com.aspose.slides.internal.e1.r4 var1) {
      if (this.n5.a6().e2() && this.n5.a6().l6().n3().n5() == 1 && var1.l6() != null && var1.k5() == null) {
         com.aspose.slides.internal.w0.s7 var2 = var1.l6();
         if (var2.l6() == 0.0F) {
            return false;
         }

         switch (var2.u9().n5()) {
            case 0:
               if (((com.aspose.slides.internal.w0.n3)var2.u9()).l6().l6() == 0) {
                  return false;
               }
         }
      }

      return true;
   }

   public final s7 l6() {
      return this.n5;
   }
}
