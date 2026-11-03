package com.aspose.slides;

class q5 extends e8v {
   private com.aspose.slides.internal.o9b.y1 s7 = com.aspose.slides.internal.o9b.y1.n5.y4();
   private com.aspose.slides.internal.o9b.y1 x8 = new com.aspose.slides.internal.o9b.y1();

   public q5(int var1, int var2, float var3, float var4) {
      super(var1, var2, var3, var4);
      this.n5(new com.aspose.slides.internal.w0.c8());
      this.x8 = new com.aspose.slides.internal.o9b.y1(-var1, -var2, 2.0F * var1, 2.0F * var2);
   }

   public final com.aspose.slides.internal.o9b.y1 n5() {
      return this.s7;
   }

   @Override
   com.aspose.slides.internal.o9b.y1 t9() {
      return this.x8;
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.o9b.y1.n5(this.x8.y4(), var1.y4()).a6(this.x8);
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, a1v var3) {
      if (var1 != null && var1.h0() != 0) {
         boolean var4 = var3 != null && var3.u3() != 0 && var3.u3() != -1;
         boolean var5 = var2 != null && var2.u9();
         if (var4 || var5) {
            if (var4) {
               com.aspose.slides.internal.x4g.s7 var6 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();

               try {
                  this.l6(var6);
                  this.k5(var6.s7().y4());
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
            }

            if (var5) {
               com.aspose.slides.internal.o9b.m3 var36 = this.n5(var2);

               try {
                  boolean var7 = (var2.s7() != 0 || var2.x8() != 0) && !this.n5(var1);
                  if (var7) {
                     com.aspose.slides.internal.x4g.s7 var37 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();

                     try {
                        this.l6(var37);
                        com.aspose.slides.internal.x4g.s7 var9 = null;
                        com.aspose.slides.internal.x4g.s7 var10 = null;
                        com.aspose.slides.internal.x4g.s7[] var11 = new com.aspose.slides.internal.x4g.s7[]{var9};
                        com.aspose.slides.internal.x4g.s7[] var12 = new com.aspose.slides.internal.x4g.s7[]{var10};
                        com.aspose.slides.internal.x4g.s7 var13 = n5(var37, var2, var11, var12);
                        var9 = var11[0];
                        var10 = var12[0];
                        this.n5(var13, var36);
                        this.n5(var9, var36);
                        this.n5(var10, var36);
                        if (var9 != null) {
                           var9.dispose();
                        }

                        if (var10 != null) {
                           var10.dispose();
                        }

                        if (var13 != null) {
                           var13.dispose();
                        }

                        return;
                     } finally {
                        if (var37 != null) {
                           var37.dispose();
                        }
                     }
                  }

                  com.aspose.slides.internal.x4g.s7 var8 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();

                  try {
                     this.l6(var8);
                     this.n5(var8, var36);
                  } finally {
                     if (var8 != null) {
                        var8.dispose();
                     }
                  }
               } finally {
                  if (var36 != null) {
                     var36.dispose();
                  }
               }
            }
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3) {
      if (var1 != null) {
         this.k5(this.u3(new com.aspose.slides.internal.o9b.y1(var2, var3, var1.e2(), var1.h0())).y4());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3) {
      if (var1 != null) {
         this.k5(this.u3(new com.aspose.slides.internal.o9b.y1(var2, var3, var1.e2(), var1.h0())).y4());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.k5(this.u3(new com.aspose.slides.internal.o9b.y1(var2, var3, var4, var5)).y4());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3, float var4, float var5) {
      if (var1 != null) {
         this.k5(this.u3(new com.aspose.slides.internal.o9b.y1(var2, var3, var4, var5)).y4());
      }
   }

   @Override
   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3, a6l var4) {
      this.k5(this.u3(var2.y4()).y4());
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      if (!com.aspose.slides.ms.System.d1.n5(var1) && var3 != null) {
         e4z var4 = l6(var1, var3);
         this.l6(var1, var2.y4(), var3, var4);
      }
   }

   private static e4z l6(String var0, TextParam var1) {
      e4z var2 = var1.d2();
      if (var1.u3 == null && !com.aspose.slides.ms.System.d1.n5(var0)) {
         boolean var3 = var0.length() > 1 && com.aspose.slides.ms.System.t9.a6(var0, 0);
         int var4 = var3 ? com.aspose.slides.ms.System.t9.n5(var0.charAt(0), var0.charAt(1)) : var0.charAt(0);
         if (!var2.n5(var4)) {
            var2 = var1.d5();
         }

         return var2;
      } else {
         return var2;
      }
   }

   private void l6(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3, e4z var4) {
      if (!com.aspose.slides.ms.System.d1.n5(var1) && var3 != null && var4 != null && var4.n5() != null) {
         var1 = var4.n5(var1);
         com.aspose.slides.internal.o9b.n3 var5 = var4.n5();
         float var6 = var3.t4();
         float var7 = this.n5(var5, var5.x8());
         var2.u3(var2.n3() - (var7 + var6 * var3.k5() / 100.0F));
         if (var3.k5() != 0) {
            var6 *= 0.66F;
         }

         com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7(1);

         try {
            v7z.n5(var8, var1, var5.l6(), var5.x8(), var6, var3, var2.u9().u3(), var3.z8(), this.a6);
            this.l6(var8);
            this.k5(var8.s7().y4());
            com.aspose.slides.internal.o9b.m3 var9 = this.n5(var3);
            if (var9 != null && var9.q0() > 0.0F) {
               try {
                  com.aspose.slides.internal.x4g.s7 var10 = (com.aspose.slides.internal.x4g.s7)var8.deepClone();

                  try {
                     var10.n5(var9);
                     this.k5(var8.s7().y4());
                  } finally {
                     var10.dispose();
                  }
               } finally {
                  var9.dispose();
               }
            }
         } finally {
            var8.dispose();
         }
      }
   }

   private com.aspose.slides.internal.o9b.m3 n5(TextParam var1) {
      return var1 != null && var1.a6() != null && var1.a6().u9() ? this.n5(var1.a6()) : null;
   }

   private float n5(com.aspose.slides.internal.o9b.n3 var1, int var2) {
      com.aspose.slides.internal.o9b.y4 var3 = var1.l6();
      float var4 = var3.h0(var2);
      if (var4 <= 0.0F) {
         return 0.0F;
      }

      float var5 = var3.k5(var2);
      return var5 / var4 * var1.n5(this.l6);
   }

   private void k5(com.aspose.slides.internal.o9b.y1 var1) {
      if (a6(var1.y4())) {
         if (!var1.u3() && !(var1.s7() <= 0.0F) && !(var1.k5() <= 0.0F)) {
            com.aspose.slides.internal.o9b.y1.n5(var1.y4(), this.x8.y4()).a6(var1);
            if (!var1.u3() && !(var1.s7() <= 0.0F) && !(var1.k5() <= 0.0F)) {
               if (this.s7.u3()) {
                  var1.a6(this.s7);
               } else {
                  com.aspose.slides.internal.o9b.y1.l6(this.s7.y4(), var1.y4()).a6(this.s7);
               }
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.o9b.m3 var2) {
      if (var1 != null && var2 != null) {
         com.aspose.slides.internal.x4g.s7 var3 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();

         try {
            var3.n5(var2);
            this.k5(var3.s7().y4());
         } finally {
            var3.dispose();
         }
      }
   }

   private void l6(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 != null) {
         if (this.c8 != null) {
            com.aspose.slides.internal.x4g.m1 var2 = com.aspose.slides.internal.n8e.n1.l6(this.c8);
            var1.l6(var2);
         }
      }
   }

   private com.aspose.slides.internal.o9b.y1 u3(com.aspose.slides.internal.o9b.y1 var1) {
      if (!a6(var1.y4()) || var1.u3()) {
         return com.aspose.slides.internal.o9b.y1.n5;
      }

      if (this.c8 == null) {
         return var1;
      }

      com.aspose.slides.internal.o9b.w1 var2 = this.c8.n5(new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.t2())).u3();
      com.aspose.slides.internal.o9b.w1 var3 = this.c8.n5(new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.t2())).u3();
      com.aspose.slides.internal.o9b.w1 var4 = this.c8.n5(new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.l6())).u3();
      com.aspose.slides.internal.o9b.w1 var5 = this.c8.n5(new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.l6())).u3();
      float var6 = com.aspose.slides.ms.System.q1.l6(
         var2.l6(), com.aspose.slides.ms.System.q1.l6(var3.l6(), com.aspose.slides.ms.System.q1.l6(var4.l6(), var5.l6()))
      );
      float var7 = com.aspose.slides.ms.System.q1.n5(
         (float)(var2.l6()), (float)(com.aspose.slides.ms.System.q1.n5((float)(var3.l6()), (float)(com.aspose.slides.ms.System.q1.n5((float)(var4.l6()), (float)(var5.l6()))))
      ));
      float var8 = com.aspose.slides.ms.System.q1.l6(
         var2.k5(), com.aspose.slides.ms.System.q1.l6(var3.k5(), com.aspose.slides.ms.System.q1.l6(var4.k5(), var5.k5()))
      );
      float var9 = com.aspose.slides.ms.System.q1.n5(
         (float)(var2.k5()), (float)(com.aspose.slides.ms.System.q1.n5((float)(var3.k5()), (float)(com.aspose.slides.ms.System.q1.n5((float)(var4.k5()), (float)(var5.k5()))))
      ));
      com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1(var6, var8, var7 - var6, var9 - var8);
      return a6(var10.y4()) ? var10 : com.aspose.slides.internal.o9b.y1.n5;
   }

   private com.aspose.slides.internal.o9b.m3 n5(l6v var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.o9b.m3 var2 = var1.q0();
      if (this.c8 == null) {
         return var2;
      }

      com.aspose.slides.internal.x4g.m1 var3 = com.aspose.slides.internal.n8e.n1.l6(this.c8);
      float var4 = n5(var3);
      if (var4 > 0.0F && com.aspose.slides.ms.System.q1.n5(var4 - 1.0F) >= 1.0E-5F) {
         var2.k5(var2.q0() * var4);
      }

      return var2;
   }

   private static float n5(com.aspose.slides.internal.x4g.m1 var0) {
      if (var0 == null) {
         return 1.0F;
      }

      float[] var1 = var0.n5();
      float var2 = var1[0] * var1[0] + var1[1] * var1[1];
      float var3 = var1[2] * var1[2] + var1[3] * var1[3];
      float var4 = var2 > 0.0F ? (float)com.aspose.slides.ms.System.q1.z3(var2) : 1.0F;
      float var5 = var3 > 0.0F ? (float)com.aspose.slides.ms.System.q1.z3(var3) : 1.0F;
      float var6 = com.aspose.slides.ms.System.q1.n5((float)(var4), (float)(var5));
      return !(var6 <= 0.0F) && !com.aspose.slides.ms.System.n1.k5(var6) && !com.aspose.slides.ms.System.n1.l6(var6) ? var6 : 1.0F;
   }

   private static boolean a6(com.aspose.slides.internal.o9b.y1 var0) {
      return n5(var0.x8()) && n5(var0.n3()) && n5(var0.s7()) && n5(var0.k5());
   }

   private static boolean n5(float var0) {
      return !com.aspose.slides.ms.System.n1.k5(var0) && !com.aspose.slides.ms.System.n1.l6(var0);
   }
}
