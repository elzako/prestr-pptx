package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class t6s {
   public final Paragraph n5;

   public t6s(Paragraph var1) {
      if (var1 == null) {
         throw new ArgumentNullException("paragraph");
      }

      this.n5 = var1;
   }

   public final int n5() {
      l3f var1 = new l3f();
      com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1();
      TextFrame var3 = this.n5.x8().k5();
      f1z var4 = var3.u3;
      l3f[] var5 = new l3f[]{var1};
      com.aspose.slides.internal.o9b.y1[] var6 = new com.aspose.slides.internal.o9b.y1[]{var2};
      s3z.n5(var4, var5, var6, null);
      var5[0].n5(var1);
      var6[0].a6(var2);
      return var4.l6(this.n5);
   }

   public final com.aspose.slides.internal.o9b.l6 n5(float var1, float var2) {
      if (!(var1 <= 0.0F) && !(var2 <= 0.0F)) {
         int var3 = this.n5.h0();
         if (var3 < 0) {
            return null;
         }

         TextFrame var4 = this.n5.x8().k5();
         float var5 = 0.0F;
         Shape var6 = com.aspose.slides.internal.v6g.k5.n5(var4.getParentShape(), Shape.class);
         if (var6 != null) {
            var5 = var6.s3().k5();
            var6.s3().n5(0.0F);
         }

         try {
            TextFrame var7 = new TextFrame(com.aspose.slides.internal.v6g.k5.n5(var4, r0g.class).getParent_Immediate());
            var7.n5((ITextFrame)var4);
            com.aspose.slides.internal.o9b.y1 var8 = com.aspose.slides.internal.o9b.y1.n5.y4();

            for (int var9 = 0; var9 < var7.getParagraphs().getCount(); var9++) {
               IParagraph var10 = var7.getParagraphs().get_Item(var9);
               if (var9 == var3) {
                  ((Paragraph)var10).l6().a6(var8);
                  if (var8.k5() <= 0.0F) {
                     return null;
                  }
               } else {
                  IGenericEnumerator var11 = var10.getPortions().iterator();

                  try {
                     while (var11.hasNext()) {
                        IPortion var12 = (IPortion)var11.next();
                        var12.getPortionFormat().getFillFormat().setFillType((byte)0);
                        var12.getPortionFormat().getLineFormat().getFillFormat().setFillType((byte)0);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                        var11.dispose();
                     }
                  }

                  if (var9 == var3 + 1) {
                     var10.getParagraphFormat().getBullet().setType((byte)0);
                  }
               }
            }

            s5u var49 = new s5u(
               var4.getSlide(),
               new com.aspose.slides.internal.t4r.n5<>(com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class),
               new y4x()
            );
            i2h var50 = new i2h();
            float var51 = var8.s7();
            if (var6 != null) {
               com.aspose.slides.internal.o9b.l6 var52 = null;
               com.aspose.slides.internal.o9b.l6[] var13 = new com.aspose.slides.internal.o9b.l6[]{var52};
               boolean var14 = n5(var7, var6, var49, var1, var2, var13);
               var52 = var13[0];
               if (var14) {
                  return var52;
               }

               if (var51 <= 0.0F) {
                  var51 = var6.getWidth();
               }

               var4.a6().l6(var50);
            } else {
               ICell var54 = var4.getParentCell();
               if (var54 != null) {
                  if (var51 <= 0.0F) {
                     var51 = (float)var54.getWidth();
                  }

                  ITextFrameFormatEffectiveData var56 = var4.s7().getEffective();
                  var50 = new i2h();
                  var50.l6 = (float)var56.getMarginLeft();
                  var50.k5 = (float)var56.getMarginTop();
                  var50.u3 = (float)var56.getMarginRight();
                  var50.a6 = (float)var56.getMarginBottom();
               }
            }

            if (var51 <= 0.0F) {
               return null;
            }

            int var55 = com.aspose.slides.ms.System.q1.n5(1, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var51), 14));
            int var57 = com.aspose.slides.ms.System.q1.n5(1, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var8.k5()), 14));
            int var58 = com.aspose.slides.ms.System.q1.n5(
               1, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var55 * var1)), 14)
            );
            int var15 = com.aspose.slides.ms.System.q1.n5(
               1, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var57 * var2)), 14)
            );
            com.aspose.slides.internal.o9b.l6 var16 = new com.aspose.slides.internal.o9b.l6(var58, var15, 2498570);
            com.aspose.slides.internal.o9b.z1 var17 = com.aspose.slides.internal.o9b.z1.n5(var16);

            try {
               var17.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
            } finally {
               if (var17 != null) {
                  var17.dispose();
               }
            }

            com.aspose.slides.ms.System.o0 var18 = com.aspose.slides.ms.System.o0.l6().k5();

            try {
               r6e.n5(var18.k5());
               var16.n5(96.0F, 96.0F);
               r1c var19 = new r1c(var16, var55, var57);

               try {
                  float var20 = var50.l6 - var8.x8();
                  float var21 = var50.k5 - var8.n3();
                  if (var20 != 0.0F || var21 != 0.0F) {
                     var19.n5(var20, var21);
                  }

                  var7.u3.n5(var19, var49);
               } finally {
                  if (var19 != null) {
                     var19.dispose();
                  }
               }

               r6e.n5(var18.k5(), var16);
               return var16;
            } catch (RuntimeException var46) {
               r6e.l6(var18.k5());
               var16.dispose();
               return null;
            }
         } finally {
            if (var6 != null) {
               var6.s3().n5(var5);
            }
         }
      } else {
         return null;
      }
   }

   private static boolean n5(TextFrame var0, Shape var1, s5u var2, float var3, float var4, com.aspose.slides.internal.o9b.l6[] var5) {
      var5[0] = null;
      GeometryShape var6 = com.aspose.slides.internal.v6g.k5.n5(var1, GeometryShape.class);
      if (var6 == null) {
         return false;
      }

      if (l6o.n5() && !u1v.k5(var0) && !var0.s7().getKeepTextFlat() && ((ThreeDFormat)var0.s7().getThreeDFormat()).u9() != -1) {
         com.aspose.slides.internal.o9b.y1 var7 = l6o.n5(var6).y4();
         int var8 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var7.s7()), 14);
         int var9 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var7.k5()), 14);
         if (!(var8 < 1.0F) && !(var9 < 1.0F)) {
            int var10 = com.aspose.slides.ms.System.q1.n5(1, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var8 * var3)), 14));
            int var11 = com.aspose.slides.ms.System.q1.n5(1, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var9 * var4)), 14));
            com.aspose.slides.internal.o9b.l6 var12 = new com.aspose.slides.internal.o9b.l6(var10, var11, 2498570);
            com.aspose.slides.internal.o9b.z1 var13 = com.aspose.slides.internal.o9b.z1.n5(var12);

            try {
               var13.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
            } finally {
               if (var13 != null) {
                  var13.dispose();
               }
            }

            boolean var14 = false;
            com.aspose.slides.ms.System.o0 var15 = com.aspose.slides.ms.System.o0.l6().k5();

            try {
               r6e.n5(var15.k5());
               r1c var16 = new r1c(var12, var8, var9);

               boolean var17;
               try {
                  var16.n5(-var7.x8(), -var7.n3());
                  var17 = l6o.n5(var16, var2, var6, var0);
               } finally {
                  var16.dispose();
               }

               if (var17) {
                  var5[0] = com.aspose.slides.internal.n8e.k7.n5(var12);
                  r6e.n5(var15.k5(), var5[0]);
                  var14 = true;
                  return true;
               }
            } catch (RuntimeException var34) {
               if (var5[0] != null) {
                  var5[0].dispose();
                  var5[0] = null;
               }

               return false;
            } finally {
               var12.dispose();
               if (!var14) {
                  r6e.l6(var15.k5());
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final com.aspose.slides.internal.o9b.y1 l6() {
      TextFrame var1 = this.n5.x8().k5();
      f1z var2 = var1.u3;
      if (com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.n5(var1, r0g.class).getParent_Immediate(), Cell.class)) {
         Cell var13 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var1, r0g.class).getParent_Immediate(), Cell.class);
         var2.n5(new d2k((float)(var13.getWidth() - var13.getMarginLeft() - var13.getMarginRight()), 0.0F), null);
         s4s var14 = var2.n5(this.n5).l6();
         ITextFrameFormatEffectiveData var15 = var1.getTextFrameFormat().getEffective();
         float var16 = (float)var15.getMarginLeft();
         float var17 = (float)var15.getMarginTop();
         return new com.aspose.slides.internal.o9b.y1(var14.n5.n5 + var16, var14.n5.l6 + var17, var14.l6.n5, var14.l6.l6);
      }

      l3f var3 = new l3f();
      com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1();
      l3f[] var5 = new l3f[]{var3};
      com.aspose.slides.internal.o9b.y1[] var6 = new com.aspose.slides.internal.o9b.y1[]{var4};
      s3z.n5(var2, var5, var6, null);
      var5[0].n5(var3);
      var6[0].a6(var4);
      TextFrameFormat var7 = var1.n5;
      i2h var8 = var1.a6().k5();
      com.aspose.slides.internal.w0.c8 var9 = s3z.n5(var3.n5().n5(), var4.y4(), var8.k5(), var7.y1(), var7.getRotationAngle(), var7.getWrapText(), var7.z1());
      d2k var10 = var3.n5.u3();
      var10.n5 = var9.u3() * (var9.c8() - var10.n5);
      var10.l6 = var9.h0() * (var9.t2() - var10.l6);
      s4s var11 = var2.n5(this.n5).l6();
      d2k var12 = var11.n5.u3();
      d2k.n5(var12, var10).n5(var12);
      if (var9.u3() < 0.0F) {
         var12.n5 = -var12.n5 - var11.l6.n5;
      }

      if (var9.h0() < 0.0F) {
         var12.l6 = -var12.l6 - var11.l6.l6;
      }

      return new com.aspose.slides.internal.o9b.y1(var12.n5, var12.l6, var11.l6.n5, var11.l6.l6);
   }
}
