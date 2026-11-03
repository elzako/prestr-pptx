package com.aspose.slides.internal.q0y;

class a6 extends n5 {
   private com.aspose.slides.internal.u7q.l6 k5;
   private u9 u3 = null;
   private com.aspose.slides.internal.u7q.n5[] a6;
   private com.aspose.slides.internal.u7q.n5[] u9;
   private com.aspose.slides.internal.u7q.n5[] h0;
   private com.aspose.slides.internal.d9l.u3 c8;

   public a6(com.aspose.slides.internal.u7q.k5 var1, com.aspose.slides.internal.u7q.k5 var2) {
      this.k5 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.u7q.l6.class);
      this.a6 = null;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      if (var2 != null) {
         this.u3 = new u9();
      }
   }

   @Override
   public void n5() {
      super.n5();
      if (this.k5 == null) {
         throw new com.aspose.slides.internal.d3l.a6();
      }

      this.a6 = n5(this.k5.h0());
      this.u9 = n5(this.k5.t2());
      this.h0 = n5(this.k5.c8());
      if (this.k5.s7() != null) {
         this.k5.s7().n5();
      }
   }

   @Override
   public void n5(float[] var1) {
      this.l6(var1);
      if (this.u3 != null) {
         this.u3.n5(var1);
      }

      if (this.k5.u3()) {
         if (!com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.u7q.h0.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.u7q.c8.class)) {
            if ((this.k5.u9() & 255) > 3) {
               if (this.u9 != null && this.k5.x8() != null && this.h0 != null && this.k5.s7() != null && this.a6 != null) {
                  n5(var1, this.u9, this.k5.a6() & 255);
                  if ((this.k5.u9() & 255) == 3 || this.h0.length == 3) {
                     n5(var1, this.k5.x8());
                  }

                  n5(var1, this.h0, this.k5.a6() & 255);
                  n5(var1, this.k5.s7());
                  n5(var1, this.a6, this.k5.u9() & 255);
               } else if (this.u9 != null && this.k5.s7() != null && this.a6 != null) {
                  n5(var1, this.u9, this.k5.a6() & 255);
                  n5(var1, this.k5.s7());
                  n5(var1, this.a6, this.k5.u9() & 255);
               }
            } else if (this.u9 != null && this.k5.x8() != null && this.h0 != null && this.k5.s7() != null && this.a6 != null) {
               n5(var1, this.u9, this.k5.a6() & 255);
               if ((this.k5.u9() & 255) == 3 || this.h0.length == 3) {
                  n5(var1, this.k5.x8());
               }

               n5(var1, this.h0, this.k5.a6() & 255);
               n5(var1, this.k5.s7());
               n5(var1, this.a6, this.k5.u9() & 255);
            } else if (this.u9 != null && this.k5.s7() != null && this.a6 != null) {
               n5(var1, this.u9, this.k5.a6() & 255);
               n5(var1, this.k5.s7());
               n5(var1, this.a6, this.k5.u9() & 255);
            } else if (this.u9 != null && this.k5.x8() != null && this.h0 != null) {
               n5(var1, this.u9, this.k5.a6() & 255);
               if ((this.k5.u9() & 255) == 3 || this.h0.length == 3) {
                  n5(var1, this.k5.x8());
               }

               n5(var1, this.h0, this.k5.u9() & 255);
            } else if (this.u9 != null) {
               n5(var1, this.u9, this.k5.u9() & 255);
            }
         } else {
            n5(var1, this.k5.x8());
            n5(var1, this.u9, this.k5.a6() & 255);
            n5(var1, this.k5.s7());
            n5(var1, this.a6, this.k5.u9() & 255);
         }
      } else if (!com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.u7q.h0.class)
         && !com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.u7q.c8.class)) {
         if ((this.k5.a6() & 255) > 3) {
            if (this.u9 != null && this.k5.x8() != null && this.h0 != null && this.k5.s7() != null && this.a6 != null) {
               n5(var1, this.a6, this.k5.a6() & 255);
               n5(var1, this.k5.s7());
               n5(var1, this.h0, this.k5.a6() & 255);
               if ((this.k5.u9() & 255) == 3 || this.h0.length == 3) {
                  n5(var1, this.k5.x8());
               }

               n5(var1, this.u9, this.k5.u9() & 255);
            } else if (this.u9 != null && this.k5.s7() != null && this.a6 != null) {
               n5(var1, this.a6, this.k5.a6() & 255);
               n5(var1, this.k5.s7());
               n5(var1, this.u9, this.k5.u9() & 255);
            }
         } else if (this.u9 != null && this.k5.x8() != null && this.h0 != null && this.k5.s7() != null && this.a6 != null) {
            n5(var1, this.a6, this.k5.a6() & 255);
            n5(var1, this.k5.s7());
            n5(var1, this.h0, this.k5.a6() & 255);
            if ((this.k5.u9() & 255) == 3 || this.h0.length == 3) {
               n5(var1, this.k5.x8());
            }

            n5(var1, this.u9, this.k5.u9() & 255);
         } else if (this.u9 != null && this.k5.s7() != null && this.a6 != null) {
            n5(var1, this.a6, this.k5.a6() & 255);
            n5(var1, this.k5.s7());
            n5(var1, this.u9, this.k5.u9() & 255);
         } else if (this.u9 != null && this.k5.x8() != null && this.h0 != null) {
            n5(var1, this.h0, this.k5.a6() & 255);
            if ((this.k5.u9() & 255) == 3 || this.h0.length == 3) {
               n5(var1, this.k5.x8());
            }

            n5(var1, this.u9, this.k5.u9() & 255);
         } else if (this.u9 != null) {
            n5(var1, this.u9, this.k5.u9() & 255);
         }
      } else {
         n5(var1, this.k5.x8());
         n5(var1, this.a6, this.k5.a6() & 255);
         n5(var1, this.k5.s7());
         n5(var1, this.u9, this.k5.u9() & 255);
      }

      this.k5(var1);
   }

   private static com.aspose.slides.internal.u7q.n5[] n5(com.aspose.slides.internal.u7q.n5[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            var0[var1].n5();
         }
      }

      return var0;
   }

   private static void n5(float[] var0, com.aspose.slides.internal.u7q.n5[] var1, int var2) {
      if (var1 != null) {
         for (int var3 = 0; var3 < var2; var3++) {
            var0[var3] = com.aspose.slides.internal.g7i.k5.k5(var1[var3].n5(var0[var3]));
         }
      }
   }

   private static void n5(float[] var0, com.aspose.slides.internal.d9l.u3 var1) {
      if (var1 != null) {
         var1.n5(var0);
      }
   }

   private static void n5(float[] var0, com.aspose.slides.internal.d9l.n5 var1) {
      if (var1 != null) {
         var1.n5(var0);
      }
   }

   @Override
   public boolean c8() {
      return this.k5.n3();
   }
}
