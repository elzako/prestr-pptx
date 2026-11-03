package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class k8s {
   private String n5;
   private PPImage l6;
   private final e3e k5;
   private final ImageTransformOperationCollection u3;
   private long a6;
   private static final Object u9 = new Object();

   k8s(ImageTransformOperationCollection var1, e3e var2) {
      this.u3 = var1;
      this.k5 = var2;
      this.n5 = null;
   }

   public final PPImage n5() {
      return this.l6;
   }

   public final void n5(PPImage var1) {
      if (!com.aspose.slides.ms.System.j8.l6(this.l6, var1)) {
         if (var1 == null) {
            this.k5.n5(false);
            this.a6 = this.a6();
         }

         this.l6 = var1;
         this.k5.k5(null);
         this.u9();
      }
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      if (!com.aspose.slides.ms.System.d1.a6(var1, this.n5)) {
         this.a6 = this.a6();
         if (!this.k5.a6()) {
            this.l6 = null;
         } else if (this.n5 == null && !com.aspose.slides.ms.System.d1.n5(var1)) {
            this.l6 = null;
            this.k5.n5(false);
            this.k5.k5(null);
         }

         if (var1 != null && var1.length() == 0) {
            this.n5 = null;
         } else {
            this.n5 = var1;
         }

         this.u9();
      }
   }

   public final String k5() {
      return this.n5;
   }

   public final void l6(String var1) {
      if (!com.aspose.slides.ms.System.d1.a6(var1, this.n5)) {
         if (var1 != null && var1.length() == 0) {
            this.n5 = null;
         } else {
            this.n5 = var1;
         }

         this.u9();
      }
   }

   final void u3() {
      this.n5 = null;
      this.l6 = null;
      this.u3.clear();
      this.u9();
   }

   final void n5(Picture var1) {
      this.n5 = var1.getLinkPathLong();
      this.l6 = com.aspose.slides.internal.v6g.k5.n5(var1.getImage(), PPImage.class);
      this.u3.clear();
      IGenericEnumerator var2 = var1.getImageTransform().iterator();

      try {
         while (var2.hasNext()) {
            ImageTransformOperation var3 = (ImageTransformOperation)var2.next();
            this.u3.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.u9();
   }

   final void n5(IPictureEffectiveData var1) {
      if (var1 != null) {
         this.n5 = var1.getLinkPathLong();
         this.l6 = (PPImage)var1.getImage();
         this.u3.clear();
         IGenericEnumerator var2 = var1.getImageTransform().iterator();

         try {
            while (var2.hasNext()) {
               IEffectEffectiveData var3 = (IEffectEffectiveData)var2.next();
               this.u3.n5(EffectFactory.n5().n5(var3));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.u9();
      }
   }

   final com.aspose.slides.internal.k9.u9 n5(j5m var1, com.aspose.slides.internal.o9b.f2 var2, s5u var3, IBaseSlide var4, boolean var5, PictureFillFormat var6) {
      com.aspose.slides.internal.k9.h0 var7 = com.aspose.slides.internal.k9.h0.n5(this.l6.h0());
      String var8 = com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ this.l6.n3().toString(), this.u3.n5(var4, null)});
      if (!n5(this.u3)) {
         var7 = com.aspose.slides.internal.k9.h0.n5(var7, new com.aspose.slides.internal.k9.a6(var8));
      }

      String var9 = n5(var1, var3, var2.a6(), var5, null);
      com.aspose.slides.internal.k9.h0 var10 = com.aspose.slides.internal.k9.h0.n5(
         var7, new com.aspose.slides.internal.k9.a6(com.aspose.slides.ms.System.d1.n5(new String[]{var8, var9}))
      );
      int var11 = var4 != null ? ((Presentation)var4.getPresentation()).n5(var10) : 1;
      com.aspose.slides.internal.k9.u9 var12 = null;
      com.aspose.slides.internal.k9.u9[] var13 = new com.aspose.slides.internal.k9.u9[]{var12};
      boolean var14 = var11 > 2 && ((Presentation)var4.getPresentation()).r4().n5(var10, var13);
      var12 = var13[0];
      if (var14) {
         return var12;
      }

      com.aspose.slides.internal.k9.u9 var15 = s5u.n5(var3, var7, this.l6);
      if (var3 != null && !com.aspose.slides.ms.System.n1.l6(var3.y4()) && (!var3.h0() || !com.aspose.slides.internal.n8e.k7.l6(var15.k5()))) {
         double var17 = 0.0;
         double var19 = 0.0;
         double[] var21 = new double[]{0.0};
         double[] var22 = new double[]{0.0};
         n5(var15, var3.y4(), var2.a6(), var1, var21, var22);
         var17 = var21[0];
         var19 = var22[0];
         e3 var23 = var1.n5;
         if (var23 != null && var23.a0().m1().n5()[0] != 0.0F && var23.a0().m1().n5()[3] != 0.0F && var17 > 1.0 && var19 > 1.0) {
            com.aspose.slides.internal.o9b.w1[] var24 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
            );
            var24[0] = new com.aspose.slides.internal.o9b.w1(1.0F, 0.0F);
            var24[1] = new com.aspose.slides.internal.o9b.w1(0.0F, 1.0F);
            var23.a0().m1().l6(var24);
            float var25 = (float)com.aspose.slides.ms.System.q1.z3(var24[0].l6() * var24[0].l6() + var24[0].k5() * var24[0].k5());
            float var26 = (float)com.aspose.slides.ms.System.q1.z3(var24[1].l6() * var24[1].l6() + var24[1].k5() * var24[1].k5());
            var17 /= var25;
            var19 /= var26;
            if (com.aspose.slides.internal.v6g.k5.l6(var23, w2.class) && !com.aspose.slides.internal.n8e.k7.h0(var15.a6())) {
               float var27 = 2.5F;
               if (var15.k5().c8() > 144.0F) {
                  var25 = (float)com.aspose.slides.ms.System.q1.u3(var15.k5().c8() / 144.0F);
                  if (var25 > var27) {
                     var25 = var27;
                  }

                  var17 /= var25;
               } else if (var17 < var27) {
                  var17 = 1.0;
               }

               if (var15.k5().y4() > 144.0F) {
                  var26 = (float)com.aspose.slides.ms.System.q1.u3(var15.k5().y4() / 144.0F);
                  if (var26 > var27) {
                     var26 = var27;
                  }

                  var19 /= var26;
               } else if (var19 < var27) {
                  var19 = 1.0;
               }
            }
         }

         if (com.aspose.slides.ms.System.q1.n5(var17 - 1.0) < 0.05 && com.aspose.slides.ms.System.q1.n5(var19 - 1.0) < 0.05) {
            com.aspose.slides.internal.k9.u9 var65 = null;
            com.aspose.slides.internal.k9.u9[] var69 = new com.aspose.slides.internal.k9.u9[]{var65};
            boolean var73 = !var3.t4().n5(var7, var69);
            var65 = var69[0];
            if (var73) {
               var65 = this.n5(var3, var15, var4, var15.k5().n3().u3());
            }

            if (!com.aspose.slides.internal.n8e.k7.h0(var15.a6()) || !var5 && !(var2.l6() > var15.k5().e2()) && !(var2.k5() > var15.k5().h0())) {
               if (var11 > 1) {
                  ((Presentation)var4.getPresentation()).n5(com.aspose.slides.internal.k9.h0.n5(var65.a6()), var10, var65);
               }

               return var65;
            } else {
               com.aspose.slides.internal.k9.l6 var75 = new com.aspose.slides.internal.k9.l6(var2.l6(), var2.k5());
               com.aspose.slides.internal.k9.h0 var76 = com.aspose.slides.internal.k9.h0.n5(var7, var75);
               com.aspose.slides.internal.k9.u9 var77 = null;
               com.aspose.slides.internal.k9.u9[] var79 = new com.aspose.slides.internal.k9.u9[]{var77};
               boolean var80 = !var3.t4().n5(var76, var79);
               var77 = var79[0];
               if (var80) {
                  com.aspose.slides.internal.o9b.f2 var82 = new com.aspose.slides.internal.o9b.f2(var2.l6() * 4.0F, var2.k5() * 4.0F);
                  com.aspose.slides.internal.o9b.y1 var84 = var6.n5(
                        com.aspose.slides.internal.v6g.k5.u3(var82.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var82.k5(), 13)
                     )
                     .y4();
                  com.aspose.slides.internal.o9b.t4 var87 = com.aspose.slides.internal.n8e.k7.n5(
                     var15.a6(), var82.a6(), var84.y4(), new com.aspose.slides.internal.o9b.f2(var82.l6() / var2.l6(), var82.l6() / var2.l6())
                  );
                  if (!n5(this.u3)) {
                     var87 = this.u3.n5(var4, (com.aspose.slides.internal.o9b.l6)var87, var87.x8());
                  }

                  var77 = new com.aspose.slides.internal.k9.u9(var87, var5);
                  var3.t4().n5(var76, var77);
               }

               if (var11 > 1) {
                  ((Presentation)var4.getPresentation()).n5(var76, var10, var77);
               }

               return var77;
            }
         } else {
            com.aspose.slides.internal.k9.u3 var64 = new com.aspose.slides.internal.k9.u3(new com.aspose.slides.internal.k9.a6(var8), var17, var19);
            com.aspose.slides.internal.k9.h0 var68 = com.aspose.slides.internal.k9.h0.n5(var7, var64);
            com.aspose.slides.internal.k9.u9 var71 = null;
            com.aspose.slides.internal.k9.u9[] var74 = new com.aspose.slides.internal.k9.u9[]{var71};
            boolean var28 = !var3.t4().n5(var68, var74);
            var71 = var74[0];
            if (var28) {
               com.aspose.slides.internal.o9b.p8 var29 = new com.aspose.slides.internal.o9b.p8(
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var15.k5().e2() / (float)var17), 14),
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var15.k5().h0() / (float)var19), 14)
               );
               if (var29.n5()) {
                  var29 = new com.aspose.slides.internal.o9b.p8(1, 1);
               }

               com.aspose.slides.internal.k9.u9 var30 = this.n5(var3, var15, var4, var29.u3());
               com.aspose.slides.internal.o9b.t4 var31 = var30.k5();
               if (var31.n3().equals(var29.u3())) {
                  if (var11 > 1) {
                     ((Presentation)var4.getPresentation()).n5(com.aspose.slides.internal.k9.h0.n5(var30.a6()), var10, var30);
                  }

                  return var30;
               }

               if (com.aspose.slides.internal.n8e.k7.h0(var30.a6())) {
                  byte[] var32 = this.n5().getBinaryData();
                  com.aspose.slides.internal.y3.u3 var33 = new com.aspose.slides.internal.y3.u3(var32);
                  boolean var34 = var33.z1() == 5
                     && var33.n3().s7() != var33.t9().l6()
                     && var33.n3().x8() > 0.0F
                     && var33.n3().n3() > 0.0F
                     && var33.n3().s7() < 2000.0F;
                  if (var23 != null && var23.a0().m1().n5()[0] != 0.0F && var23.a0().m1().n5()[3] != 0.0F && var34) {
                     var29 = new com.aspose.slides.internal.o9b.p8(
                        com.aspose.slides.internal.v6g.k5.u3(var2.l6() * com.aspose.slides.ms.System.q1.n5(var23.a0().m1().n5()[0]), 13),
                        com.aspose.slides.internal.v6g.k5.u3(var2.k5() * com.aspose.slides.ms.System.q1.n5(var23.a0().m1().n5()[3]), 13)
                     );
                  } else if (!var34) {
                     if (var33.z1() == 2) {
                        if (!var33.y4().l6().c8().n5()) {
                           var29 = new com.aspose.slides.internal.o9b.p8(
                              com.aspose.slides.internal.v6g.k5.u3(var33.y4().l6().s7() / var33.s7() * 96.0F * 1.7F, 13),
                              com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var33.y4().l6().k5() / var33.x8() * 96.0F * 1.7F), 13)
                           );
                        } else {
                           var29.n5(var29.l6() * 4);
                           var29.l6(var29.k5() * 4);
                        }
                     } else if (var33.n3().s7() * 96.0F / var33.s7() / var2.l6() < 4.0F) {
                        var29 = new com.aspose.slides.internal.o9b.p8(
                           com.aspose.slides.internal.v6g.k5.u3(var2.l6() * 4.0F, 13), com.aspose.slides.internal.v6g.k5.u3(var2.k5() * 4.0F, 13)
                        );
                     } else {
                        var29 = new com.aspose.slides.internal.o9b.p8(
                           com.aspose.slides.internal.v6g.k5.u3(var2.l6() * 4.0F / 2.0F, 13), com.aspose.slides.internal.v6g.k5.u3(var2.k5() * 4.0F / 2.0F, 13)
                        );
                     }
                  }

                  com.aspose.slides.internal.o9b.f2 var35 = (com.aspose.slides.internal.v6g.k5.l6(var23, w2.class)
                        ? new com.aspose.slides.internal.o9b.f2(var29.l6() / var2.l6() * 3.0F / 4.0F, var29.k5() / var2.k5() * 3.0F / 4.0F)
                        : new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F))
                     .a6();
                  byte[] var40;
                  synchronized (u9) {
                     com.aspose.slides.internal.o9b.z1 var37 = var23 != null && var33.z1() == 3 ? var23.a0() : null;
                     boolean var38 = this.l6.getSvgImage() != null;
                     com.aspose.slides.internal.o9b.l6 var39 = com.aspose.slides.internal.n8e.k7.n5(
                        var32, var37, com.aspose.slides.internal.o9b.p8.n5(var29).a6(), var35.a6(), var38
                     );

                     try {
                        var40 = com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var39);
                     } finally {
                        if (var39 != null) {
                           var39.dispose();
                        }
                     }
                  }

                  var71 = new com.aspose.slides.internal.k9.u9(com.aspose.slides.internal.n8e.k7.x8(var40), var40);
                  com.aspose.slides.internal.k9.h0 var89 = com.aspose.slides.internal.k9.h0.n5(var71.a6());
                  Object var90 = null;
                  com.aspose.slides.internal.k9.u9[] var91 = new com.aspose.slides.internal.k9.u9[]{(com.aspose.slides.internal.k9.u9)var90};
                  boolean var92 = var3.t4().n5(var89, var91);
                  if (var92) {
                     var71 = var91[0];
                  } else {
                     var3.t4().n5(var89, var71);
                  }
               } else {
                  com.aspose.slides.internal.o9b.l6 var81 = new com.aspose.slides.internal.o9b.l6(var31, var29.u3());

                  try {
                     byte[] var83;
                     if (com.aspose.slides.ms.System.o0.n5(var31.x8().n5(), com.aspose.slides.internal.j9e.x8.c8().n5()) && var31.c8() <= var81.c8()) {
                        com.aspose.slides.internal.z0k.e2 var85 = new com.aspose.slides.internal.z0k.e2();

                        try {
                           com.aspose.slides.internal.j9e.s7 var93 = com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.c8());
                           com.aspose.slides.internal.j9e.h0 var88 = new com.aspose.slides.internal.j9e.h0();
                           var88.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, 100L);
                           var81.n5(var85, var93, var88);
                           var83 = var85.toArray();
                        } finally {
                           if (var85 != null) {
                              var85.dispose();
                           }
                        }
                     } else {
                        var83 = com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var81);
                     }

                     var71 = new com.aspose.slides.internal.k9.u9(com.aspose.slides.internal.n8e.k7.x8(var83), var83);
                     com.aspose.slides.internal.k9.h0 var86 = com.aspose.slides.internal.k9.h0.n5(var71.a6());
                     var3.t4().n5(var86, var71);
                  } finally {
                     if (var81 != null) {
                        var81.dispose();
                     }
                  }
               }
            }

            if (var11 > 1) {
               ((Presentation)var4.getPresentation()).n5(com.aspose.slides.internal.k9.h0.n5(var71.a6()), var10, var71);
            }

            return var71;
         }
      } else {
         com.aspose.slides.internal.k9.u9 var16 = this.n5(var3, var15, var4, var15.k5().n3().u3());
         if (var11 > 1) {
            ((Presentation)var4.getPresentation()).n5(com.aspose.slides.internal.k9.h0.n5(var16.a6()), var10, var16);
         }

         return var16;
      }
   }

   private com.aspose.slides.internal.k9.u9 n5(s5u var1, com.aspose.slides.internal.k9.u9 var2, IBaseSlide var3, com.aspose.slides.internal.o9b.p8 var4) {
      float var5 = 3000000.0F;
      if (var1 != null) {
         var5 = var1.x8();
      }

      boolean var6 = this.n5(var1, var2.k5(), var2.a6());
      if (var6) {
         com.aspose.slides.internal.o9b.p8 var20 = var4.u3();
         boolean var21 = false;
         if (com.aspose.slides.internal.n8e.k7.h0(var2.a6()) && (float)var20.l6() * var20.k5() > var5) {
            var21 = true;
            float var22 = (float)com.aspose.slides.ms.System.q1.z3(var5 / var20.l6() / var20.k5());
            var20 = new com.aspose.slides.internal.o9b.p8(
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var20.l6() * var22), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var20.k5() * var22), 14)
            );
            if (var20.l6() < 1) {
               var20.n5(1);
            }

            if (var20.k5() < 1) {
               var20.l6(1);
            }
         }

         com.aspose.slides.internal.o9b.l6 var23 = null;
         if (var2 != null && var2.u3() && com.aspose.slides.internal.n8e.k7.h0(var2.a6())) {
            var23 = var2.u3()
               ? com.aspose.slides.internal.n8e.k7.n5(var2.a6(), com.aspose.slides.internal.o9b.p8.n5(var20).a6())
               : com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.j9e.y4)var2.k5(), com.aspose.slides.internal.o9b.p8.n5(var20).a6());
         } else {
            var23 = new com.aspose.slides.internal.o9b.l6(var2.k5(), var20.l6(), var20.k5());
         }

         if (var21) {
            var23.n5(
               com.aspose.slides.internal.n2d.m1.n5(var2.k5()) * var23.e2() / var2.k5().e2(),
               com.aspose.slides.internal.n2d.m1.l6(var2.k5()) * var23.h0() / var2.k5().h0()
            );
         }

         com.aspose.slides.internal.o9b.t4 var25 = var23;
         var6 = false;
         if (!n5(this.u3)) {
            var6 = true;
            var25 = this.u3.n5(var3, var23, var2.k5().x8());
         }

         byte[] var14;
         if (var2.u3() && com.aspose.slides.internal.n8e.k7.a6(var2.a6()) && !var6) {
            com.aspose.slides.internal.z0k.e2 var11 = new com.aspose.slides.internal.z0k.e2();

            try {
               com.aspose.slides.internal.j9e.s7 var12 = com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.c8());
               com.aspose.slides.internal.j9e.h0 var13 = new com.aspose.slides.internal.j9e.h0();
               var13.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, 100L);
               var25.n5(var11, var12, var13);
               var14 = var11.toArray();
            } finally {
               if (var11 != null) {
                  var11.dispose();
               }
            }
         } else {
            var14 = com.aspose.slides.internal.n8e.k7.n5(var25);
         }

         var25 = com.aspose.slides.internal.n8e.k7.x8(var14);
         var23.dispose();
         com.aspose.slides.internal.k9.h0 var27 = com.aspose.slides.internal.k9.h0.n5(var14);
         com.aspose.slides.internal.k9.u9 var28 = new com.aspose.slides.internal.k9.u9(var25, var14);
         if (var1 != null) {
            Object var29 = null;
            com.aspose.slides.internal.k9.u9[] var15 = new com.aspose.slides.internal.k9.u9[]{(com.aspose.slides.internal.k9.u9)var29};
            boolean var16 = var1.t4().n5(var27, var15);
            if (var16) {
               var28 = var15[0];
            } else {
               var1.t4().n5(var27, var28);
            }
         }

         return var28;
      } else {
         if (var1 != null && var2.u3()) {
            com.aspose.slides.internal.k9.h0 var7 = com.aspose.slides.internal.k9.h0.n5(var2.a6());
            Object var8 = null;
            com.aspose.slides.internal.k9.u9[] var9 = new com.aspose.slides.internal.k9.u9[]{(com.aspose.slides.internal.k9.u9)var8};
            boolean var10 = var1.t4().n5(var7, var9);
            if (var10) {
               var2 = var9[0];
            } else {
               var1.t4().n5(var7, var2);
            }
         }

         return var2;
      }
   }

   private boolean n5(s5u var1, com.aspose.slides.internal.o9b.t4 var2, byte[] var3) {
      boolean var4 = false;
      if (var1 != null) {
         var4 = var1.a6() && (!var1.h0() || !com.aspose.slides.internal.n8e.k7.l6(var2));
         if (var4 && com.aspose.slides.internal.n8e.k7.h0(var3)) {
            var4 &= var1.u9();
         }
      }

      return !n5(this.u3) || com.aspose.slides.internal.n8e.k7.k5(var2) || var4;
   }

   static boolean n5(IImageTransformOperationCollection var0) {
      if (var0 != null && var0.size() != 0) {
         int var1 = 0;
         IGenericEnumerator var2 = var0.iterator();

         try {
            while (var2.hasNext()) {
               IImageTransformOperation var3 = (IImageTransformOperation)var2.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var3, AlphaModulateFixed.class)) {
                  AlphaModulateFixed var4 = com.aspose.slides.internal.v6g.k5.n5(var3, AlphaModulateFixed.class);
                  if (var4.getAmount() == 100.0F) {
                     var1++;
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var3, Luminance.class)) {
                  Luminance var8 = com.aspose.slides.internal.v6g.k5.n5(var3, Luminance.class);
                  if (var8.u3() == 0.0F && var8.a6() == 0.0F) {
                     var1++;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return var0.size() - var1 <= 0;
      } else {
         return true;
      }
   }

   static boolean l6(IImageTransformOperationCollection var0) {
      if (var0 != null && var0.size() != 0) {
         IGenericEnumerator var1 = var0.iterator();

         try {
            while (var1.hasNext()) {
               IImageTransformOperation var2 = (IImageTransformOperation)var1.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var2, AlphaInverse.class)) {
                  return true;
               }

               AlphaModulateFixed var3 = com.aspose.slides.internal.v6g.k5.n5(var2, AlphaModulateFixed.class);
               if (var3 != null && var3.getAmount() < 100.0F) {
                  return true;
               }

               AlphaReplace var4 = com.aspose.slides.internal.v6g.k5.n5(var2, AlphaReplace.class);
               if (var4 != null && var4.l6() < 100.0F) {
                  return true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static void n5(com.aspose.slides.internal.k9.u9 var0, float var1, com.aspose.slides.internal.o9b.f2 var2, j5m var3, double[] var4, double[] var5) {
      float var6 = 1.0F;
      float var7 = 1.0F;
      com.aspose.slides.internal.w0.c8 var8 = var3.k5;
      if (var8 != null && !var8.n5()) {
         com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
         );
         var9[0] = new com.aspose.slides.internal.o9b.w1(1.0F, 0.0F);
         var9[1] = new com.aspose.slides.internal.o9b.w1(0.0F, 1.0F);
         com.aspose.slides.internal.n8e.n1.n5(var8, var9);
         var6 = (float)com.aspose.slides.ms.System.q1.z3(var9[0].l6() * var9[0].l6() + var9[0].k5() * var9[0].k5());
         var7 = (float)com.aspose.slides.ms.System.q1.z3(var9[1].l6() * var9[1].l6() + var9[1].k5() * var9[1].k5());
      }

      float var20 = var1 / var6;
      float var10 = var1 / var7;
      com.aspose.slides.internal.o9b.p8 var11 = var0.k5().n3().u3();
      if (com.aspose.slides.internal.n8e.k7.h0(var0.a6())) {
         com.aspose.slides.internal.n8e.k7.s7(var0.a6()).h0().k5(var11);
      }

      double var12 = com.aspose.slides.ms.System.q1.z3(2.0);
      double var14 = 0.001F;
      double var16 = var2.l6() * var20 / 72.0F * var12;
      double var18 = var2.k5() * var10 / 72.0F * var12;
      var4[0] = 1.0;
      var5[0] = 1.0;

      while (var11.l6() / var4[0] > var16 - var14) {
         var4[0] *= var12;
      }

      while (var11.k5() / var5[0] > var18 - var14) {
         var5[0] *= var12;
      }

      if (var4[0] == var12 * var5[0]) {
         var4[0] = var5[0];
      } else if (var5[0] == var12 * var4[0]) {
         var5[0] = var4[0];
      }
   }

   static String n5(j5m var0, s5u var1, com.aspose.slides.internal.o9b.f2 var2, boolean var3, com.aspose.slides.internal.w0.c8 var4) {
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
      var5.n5("|");
      var5.n5(var2.toString());
      var5.n5("|");
      var5.n5(com.aspose.slides.ms.System.n3.l6(var3));
      var5.n5("|");
      if (var0 != null) {
         var5.n5(com.aspose.slides.ms.System.s3.n5(ShapeType.class, var0.h0));
         var5.n5("|");
         if (var0.l6 != null) {
            var5.n5(((ShapeFrame)var0.l6).n5().toString());
            var5.n5("|");
         }

         if (var0.u3 != null) {
            var5.n5(var0.u3.getClass().getName());
            var5.n5("|");
         }

         if (var0.n5 != null) {
            var5.n5(com.aspose.slides.ms.System.a3.l6(var0.n5.x8()));
            var5.n5("|");
            var5.n5(com.aspose.slides.ms.System.a3.l6(var0.n5.s7()));
            var5.n5("|");
         }
      }

      if (var1 != null) {
         var5.n5(var1.q0().toString());
         var5.n5("|");
         var5.n5(com.aspose.slides.ms.System.n3.l6(var1.a6()));
         var5.n5("|");
         var5.n5(com.aspose.slides.ms.System.n3.l6(var1.z1()));
         var5.n5("|");
         var5.n5(com.aspose.slides.ms.System.a3.l6(var1.n3()));
         var5.n5("|");
         var5.n5(com.aspose.slides.ms.System.n1.u9(var1.x8()));
         var5.n5("|");
         var5.n5(com.aspose.slides.ms.System.a3.l6(var1.t9()));
         var5.n5("|");
         var5.n5(com.aspose.slides.ms.System.n1.u9(var1.y4()));
         var5.n5("|");
      }

      if (var4 != null) {
         var5.n5(var4.toString());
      }

      return var5.toString();
   }

   final long a6() {
      return ((this.a6 & 4294967295L) + ((this.l6 != null ? this.l6.y4() : 0L) & 4294967295L) & 4294967295L) + (this.u3.getVersion() & 4294967295L)
         & 4294967295L;
   }

   private void u9() {
      this.a6++;
   }

   public static boolean n5(k8s var0, k8s var1) {
      if (com.aspose.slides.ms.System.j8.l6(var0, var1)) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.u3.size() != var1.u3.size()) {
            return false;
         }

         for (int var2 = 0; var2 < var0.u3.size(); var2++) {
            if (!com.aspose.slides.ms.System.j8.n5(var0.u3.get_Item(var2), var1.u3.get_Item(var2))) {
               return false;
            }
         }

         return com.aspose.slides.internal.n8e.v4.n5(var0.l6(), var1.l6()) && com.aspose.slides.internal.n8e.v4.n5(var0.l6, var1.n5());
      } else {
         return false;
      }
   }
}
