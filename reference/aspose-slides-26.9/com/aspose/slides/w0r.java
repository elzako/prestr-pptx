package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class w0r {
   private IFillOverlayEffectiveData n5;

   public w0r(IFillOverlayEffectiveData var1) {
      this.n5 = var1;
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, ShapeFrame var5) {
      if (var3 != null && var3.u3() != 0 || var4 != null && var4.u9()) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);
         com.aspose.slides.internal.o9b.y1 var6 = var2.s7().y4();
         float var7 = var4 != null && var4.u9() ? (float)var4.n5() : 0.0F;
         byte var8 = 2;
         com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var6.x8() - (var7 + var8), var6.n3() - (var7 + var8));
         com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var6.s7() + 2.0F * (var7 + var8))), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var6.k5() + 2.0F * (var7 + var8))), 14),
            2498570
         );

         try {
            if (var1.y1() != null) {
               var10.n5(var1.y1().y4(), var1.y1().c8());
            }

            com.aspose.slides.internal.x4g.m1 var11 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var9.l6(), -var9.k5());
            var2.l6(var11);
            com.aspose.slides.internal.x4g.m1 var12 = new com.aspose.slides.internal.x4g.m1();
            var12.n5(var11, 1);
            com.aspose.slides.internal.o9b.z1 var13 = n2d.n5(var10, var1);

            try {
               var13.n5(com.aspose.slides.internal.o9b.c8.n5(0, 0, 0, 0).o8());
               if (var3 != null && var3.u3() != 0) {
                  com.aspose.slides.internal.o9b.u3 var14 = d4.k5(var3);

                  try {
                     com.aspose.slides.internal.x4g.m1 var15 = n2d.n5(var14);
                     var15.n5(var12, 1);
                     n2d.n5(var14, var15);
                     var13.n5(var14, var2);
                  } finally {
                     if (var14 != null) {
                        var14.dispose();
                     }
                  }
               }
            } finally {
               if (var13 != null) {
                  var13.dispose();
               }
            }

            com.aspose.slides.internal.o9b.l6 var67 = new com.aspose.slides.internal.o9b.l6(var10.e2(), var10.h0(), var10.s7());

            try {
               var67.n5(var10.c8(), var10.y4());
               com.aspose.slides.internal.o9b.z1 var68 = n2d.n5(var67, var1);

               try {
                  var68.n5(com.aspose.slides.internal.o9b.c8.n5(0, 0, 0, 0).o8());
                  com.aspose.slides.internal.o9b.u3 var16 = this.l6(var3);

                  try {
                     if (com.aspose.slides.internal.v6g.k5.l6(var16, com.aspose.slides.internal.x4g.z3.class)) {
                        com.aspose.slides.internal.x4g.z3 var17 = (com.aspose.slides.internal.x4g.z3)var16;
                        com.aspose.slides.internal.x4g.a6 var18 = var17.t2();
                        int var19 = com.aspose.slides.internal.o9b.c8.w4().h0();
                        if (var17.h0() == null && var18.n5().length == 2 && var18.n5()[0].h0() == var19 && var18.n5()[1].h0() == var19) {
                           var18 = new com.aspose.slides.internal.x4g.a6();
                           var18.n5(new com.aspose.slides.internal.o9b.c8[]{com.aspose.slides.internal.o9b.c8.w4(), com.aspose.slides.internal.o9b.c8.m3()});
                           var18.n5(var17.t2().l6());
                           var17.n5(var18);
                        }
                     }

                     com.aspose.slides.internal.x4g.m1 var70 = n2d.n5(var16);
                     var70.n5(var12, 1);
                     n2d.n5(var16, var70);
                     var68.n5(var16, var2);
                  } finally {
                     if (var16 != null) {
                        var16.dispose();
                     }
                  }
               } finally {
                  if (var68 != null) {
                     var68.dispose();
                  }
               }

               float var69 = this.n5(var3);
               this.n5(var10, var67, var69);
            } finally {
               if (var67 != null) {
                  var67.dispose();
               }
            }

            this.n5(var1, var10, var9.l6(), var9.k5());
         } finally {
            if (var10 != null) {
               var10.dispose();
            }
         }

         var2.dispose();
      }
   }

   private void n5(e3 var1, com.aspose.slides.internal.o9b.l6 var2, float var3, float var4) {
      new com.aspose.slides.internal.o9b.y1();
      com.aspose.slides.internal.o9b.y1 var5;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
         var3 = com.aspose.slides.internal.v6g.k5.u3(var3, 13);
         var4 = com.aspose.slides.internal.v6g.k5.u3(var4, 13);
         var5 = new com.aspose.slides.internal.o9b.y1(var3 < 0.0F ? var3 - 1.5F : var3, var4, var2.e2(), var2.h0());
      } else {
         var5 = new com.aspose.slides.internal.o9b.y1(var3, var4, var2.e2(), var2.h0());
      }

      var1.n5(var2, var5.x8(), var5.n3(), var5.s7(), var5.k5());
   }

   private float n5(a1v var1) {
      if (var1.k5() != null) {
         IGenericEnumerator var2 = var1.k5().iterator();

         try {
            while (var2.hasNext()) {
               IEffectEffectiveData var3 = (IEffectEffectiveData)var2.next();
               o0 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, o0.class);
               if (var4 != null) {
                  return var4.getAmount() / 100.0F;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return 1.0F;
   }

   private com.aspose.slides.internal.o9b.u3 l6(a1v var1) {
      a1v var2 = a1v.n5(var1.h0(), (f6a)this.n5.getFillFormat());
      return d4.k5(var2);
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2, float var3) {
      byte[] var4 = n2d.n5(var1);
      byte[] var5 = n2d.n5(var2);
      float var6 = (1.0F - var3) * 255.0F;

      for (byte var7 = 0; var7 < var4.length; var7 += 4) {
         var4[var7] = com.aspose.slides.internal.v6g.k5.n5((Object)((var4[var7] & 0xFF) * var3 + var6), 13);
         var4[var7 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)((var4[var7 + 1] & 0xFF) * var3 + var6), 13);
         var4[var7 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)((var4[var7 + 2] & 0xFF) * var3 + var6), 13);
      }

      switch (this.n5.getBlend()) {
         case 0:
            this.n5(var4, var5);
            break;
         case 1:
            this.l6(var4, var5);
            break;
         case 2:
            this.k5(var4, var5);
            break;
         case 3:
            this.u3(var4, var5);
            break;
         case 4:
            this.a6(var4, var5);
            break;
         default:
            throw new ArgumentOutOfRangeException("m_blendMode");
      }

      n2d.n5(var1, var4);
      Object var8 = null;
      Object var9 = null;
   }

   private void n5(byte[] var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceBits is null.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("overlayBits is null.");
      }

      if (var1.length != var2.length) {
         throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
      }

      int var3 = 0;

      while (var3 < var1.length) {
         if ((var1[var3 + 3] & 255) != 0) {
            byte var4 = var2[var3];
            if ((var4 & 255) < (var1[var3] & 255)) {
               var1[var3] = var4;
            }

            var4 = var2[++var3];
            if ((var4 & 255) < (var1[var3] & 255)) {
               var1[var3] = var4;
            }

            var4 = var2[++var3];
            if ((var4 & 255) < (var1[var3] & 255)) {
               var1[var3] = var4;
            }

            var1[++var3] = -1;
            var3++;
         } else {
            var3 += 4;
         }
      }
   }

   private void l6(byte[] var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceBits is null.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("overlayBits is null.");
      }

      if (var1.length != var2.length) {
         throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
      }

      int var3 = 0;

      while (var3 < var1.length) {
         if ((var1[var3 + 3] & 255) != 0) {
            byte var4 = var2[var3];
            if ((var4 & 255) > (var1[var3] & 255)) {
               var1[var3] = var4;
            }

            var4 = var2[++var3];
            if ((var4 & 255) > (var1[var3] & 255)) {
               var1[var3] = var4;
            }

            var4 = var2[++var3];
            if ((var4 & 255) > (var1[var3] & 255)) {
               var1[var3] = var4;
            }

            var1[++var3] = -1;
            var3++;
         } else {
            var3 += 4;
         }
      }
   }

   private void k5(byte[] var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceBits is null.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("overlayBits is null.");
      }

      if (var1.length != var2.length) {
         throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
      }

      int var3 = 0;

      while (var3 < var1.length) {
         if ((var1[var3 + 3] & 255) != 0) {
            var1[var3] = (byte)((var1[var3] & 255) * (var2[var3] & 255) >> 8);
            var1[++var3] = (byte)((var1[var3] & 255) * (var2[var3] & 255) >> 8);
            var1[++var3] = (byte)((var1[var3] & 255) * (var2[var3] & 255) >> 8);
            var1[++var3] = -1;
            var3++;
         } else {
            var3 += 4;
         }
      }
   }

   private void u3(byte[] var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceBits is null.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("overlayBits is null.");
      }

      if (var1.length != var2.length) {
         throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
      }

      int var3 = 0;

      while (var3 < var1.length) {
         if ((var1[var3 + 3] & 255) != 0) {
            for (int var4 = var3 + 3; var3 < var4; var3++) {
               int var5 = var1[var3] & 255;
               int var6 = var2[var3] & 255;
               if (var5 <= 127) {
                  var1[var3] = (byte)(2 * var5 * var6 / 255);
               } else {
                  var1[var3] = (byte)(255 - 2 * (255 - var5) * (255 - var6) / 255);
               }
            }

            var1[var3] = -1;
            var3++;
         } else {
            var3 += 4;
         }
      }
   }

   private void a6(byte[] var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceBits is null.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("overlayBits is null.");
      }

      if (var1.length != var2.length) {
         throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
      }

      int var3 = 0;

      while (var3 < var1.length) {
         if ((var1[var3 + 3] & 255) != 0) {
            var1[var3] = (byte)((var1[var3] & 255) + (255 - (var1[var3] & 255)) * (var2[var3] & 255) / 255);
            var1[++var3] = (byte)((var1[var3] & 255) + (255 - (var1[var3] & 255)) * (var2[var3] & 255) / 255);
            var1[++var3] = (byte)((var1[var3] & 255) + (255 - (var1[var3] & 255)) * (var2[var3] & 255) / 255);
            var1[++var3] = -1;
            var3++;
         } else {
            var3 += 4;
         }
      }
   }
}
