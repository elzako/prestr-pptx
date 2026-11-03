package com.aspose.slides.internal.v7y;

public final class a1 extends k8 {
   private j9 a6;
   private boolean u9;

   public a1(j9 var1, j9 var2, boolean var3) {
      super(var1);
      this.a6 = var2;
      this.u9 = var3;
   }

   private a1(a1 var1) {
      super(var1);
      this.a6 = n5(var1.a6);
      this.u9 = var1.u9;
   }

   @Override
   public void t2() {
      this.a6.t2();
      super.t2();
   }

   public final j9 z1() {
      return this.a6;
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      super.n5(var1);
      this.a6.n5(var1);
      if (this.a6.u9() != 0 && this.a6.u9() != 5 && this.u9) {
         o5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, o5.class);
         if (var2 != null) {
            this.n5 = var2.n5;
         }
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      while ((this.l6 = this.n5.h0()) != null) {
         if (this.t4()) {
            this.u3++;
            return this.l6;
         }
      }

      return null;
   }

   public final boolean t4() {
      Object var1 = this.a6.n5((com.aspose.slides.internal.x6s.h0)this.n5);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.x6s.h0.class)) {
         return this.a6.h0() != null;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, String.class)) {
         return ((String)var1).length() != 0;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)) {
         return com.aspose.slides.internal.v6g.k5.u3(var1, double.class) == this.n5.u3();
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var1, Boolean.class) ? com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class) : true;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.x6s.a6 var2 = this.n5.n5(var1);
      if (var2 != null) {
         switch (this.a6.u9()) {
            case 0:
               f0 var3 = com.aspose.slides.internal.v6g.k5.n5(this.a6, f0.class);
               if (var3 != null) {
                  double var4 = com.aspose.slides.internal.v6g.k5.u3(var3.n5, double.class);
                  w8 var6 = com.aspose.slides.internal.v6g.k5.n5(this.n5, w8.class);
                  if (var6 != null) {
                     com.aspose.slides.internal.x6s.a6 var11 = var1.n5();
                     var11.q0();
                     int var12 = 0;
                     var11.t4();

                     do {
                        if (var6.l6(var11)) {
                           var12++;
                           if (var1.l6(var11)) {
                              return var4 == var12 ? var2 : null;
                           }
                        }
                     } while (var11.z1());

                     return null;
                  }

                  c3 var7 = com.aspose.slides.internal.v6g.k5.n5(this.n5, c3.class);
                  if (var7 != null) {
                     com.aspose.slides.internal.x6s.a6 var8 = var1.n5();
                     var8.q0();
                     int var9 = 0;
                     var8.e2();

                     do {
                        if (var7.l6(var8)) {
                           var9++;
                           if (var1.l6(var8)) {
                              return var4 == var9 ? var2 : null;
                           }
                        }
                     } while (var8.t9());

                     return null;
                  }
               }
               break;
            case 1:
               if (this.u9) {
                  return ((String)this.a6.n5(new r8(var1, true))).length() != 0 ? var2 : null;
               }
               break;
            case 2:
               if (this.u9) {
                  return com.aspose.slides.internal.v6g.k5.u3(this.a6.n5(new r8(var1, true)), boolean.class) ? var2 : null;
               }
               break;
            case 3:
               this.a6.n5(new r8(var1, true));
               return this.a6.h0() != null ? var2 : null;
            case 4:
               return var2;
            default:
               return null;
         }

         this.n5(new r8(var2, true));

         com.aspose.slides.internal.x6s.a6 var10;
         while ((var10 = this.h0()) != null) {
            if (var10.l6(var1)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public int c8() {
      return 1 | this.n5.c8() & 24;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new a1(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
