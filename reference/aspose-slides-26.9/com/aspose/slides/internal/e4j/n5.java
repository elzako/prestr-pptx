package com.aspose.slides.internal.e4j;

import com.aspose.slides.internal.w2a.t2;
import com.aspose.slides.internal.w2a.x8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class n5 extends u9 {
   public n5(com.aspose.slides.internal.f2i.n5 var1) {
      super(var1);
      int var2 = var1.x8();
      if (var2 != 0) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("Invalid photometric validator for {0} TIFF file standard.", new Object[]{s3.n5(t2.class, var2)}));
      }
   }

   @Override
   public boolean n5(boolean var1) {
      int var2 = this.l6;
      int var3 = this.u3;
      int[] var4 = this.n5;
      boolean var5 = true;
      switch (this.l6) {
         case 0:
         case 1:
            if (this.n5.length != 1) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     "The MinIsWhite or MinIsBlack photometric for TIFF images require samples per pixels to be equal 1.", 5
                  );
               }

               var5 = false;
            } else if ((var4[0] & 65535) == 1) {
               if (var3 != 1 && var3 != 32773 && var3 != 2) {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5(
                           "Invalid compression {0} for bi-level images. The bi-level images with MinIsWhite or MinIsBlack photometric could only support three compression schemes: {1}, {2} or {3}.",new Object[]{
                           s3.n5(com.aspose.slides.internal.w2a.a6.class, var3),
                           s3.n5(com.aspose.slides.internal.w2a.a6.class, 1L),
                           s3.n5(com.aspose.slides.internal.w2a.a6.class, 2L),
                           s3.n5(com.aspose.slides.internal.w2a.a6.class, 32773L)
                        }),
                        4
                     );
                  }

                  var5 = false;
               }
            } else if ((var4[0] & 65535) != 4 && (var4[0] & 65535) != 8) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     d1.n5("For photometric {0} expected 1, {1} or {2} bit per sample values.",new Object[]{ s3.n5(x8.class, var2), 4, 8}), 7
                  );
               }

               var5 = false;
            } else if (var3 != 1 && var3 != 32773) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     d1.n5(
                        "Invalid compression {0} for grayscale images. The grayscale images with MinIsWhite or MinIsBlack photometric could only support two compression schemes: {1} or {2}.",new Object[]{
                        s3.n5(com.aspose.slides.internal.w2a.a6.class, var3),
                        s3.n5(com.aspose.slides.internal.w2a.a6.class, 1L),
                        s3.n5(com.aspose.slides.internal.w2a.a6.class, 32773L)
                     }),
                     4
                  );
               }

               var5 = false;
            }
            break;
         case 2:
            byte var6 = 3;
            if (var4.length < 3) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3("The RGB full color images with RGB photometric require 3 or more samples per pixels.", 5);
               }

               var5 = false;
            } else if ((var4[0] & 65535) == 8 && (var4[1] & 65535) == 8 && (var4[2] & 65535) == 8) {
               if (var3 != 1 && var3 != 32773) {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5(
                           "Invalid compression {0} for RGB full color images. The RGB full color images with RGB photometric could only support two compression schemes: {1} or {2}.",new Object[]{
                           s3.n5(com.aspose.slides.internal.w2a.a6.class, var3),
                           s3.n5(com.aspose.slides.internal.w2a.a6.class, 1L),
                           s3.n5(com.aspose.slides.internal.w2a.a6.class, 32773L)
                        }),
                        4
                     );
                  }

                  var5 = false;
               }
            } else {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     d1.n5(
                        "Invalid bits per sample values for RGB full color images. For photometric {0} expected [{1}, {1}, {1}] bit per sample values.",new Object[]{
                        s3.n5(x8.class, this.l6),
                        8
                     }),
                     7
                  );
               }

               var5 = false;
            }
            break;
         case 3:
            if (this.n5.length != 1) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3("The palette-color images with Palette photometric require samples per pixels to be equal 1.", 5);
               }

               var5 = false;
            } else if ((var4[0] & 65535) != 4 && (var4[0] & 65535) != 8) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     d1.n5(
                        "Invalid bits per sample values for palette-color images. For photometric {0} expected {1} or {2} bit per sample values.",new Object[]{
                        s3.n5(x8.class, var2),
                        4,
                        8
                     }),
                     7
                  );
               }

               var5 = false;
            } else if (var3 != 1 && var3 != 32773) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     d1.n5(
                        "Invalid compression {0} for palette-color images. The palette-color images with Palette photometric could only support two compression schemes: {1} or {2}.",new Object[]{
                        s3.n5(com.aspose.slides.internal.w2a.a6.class, var3),
                        s3.n5(com.aspose.slides.internal.w2a.a6.class, 1L),
                        s3.n5(com.aspose.slides.internal.w2a.a6.class, 32773L)
                     }),
                     4
                  );
               }

               var5 = false;
            }
            break;
         default:
            if (!var1) {
               throw new com.aspose.slides.internal.h6t.u3(
                  d1.n5(
                     "The TIFF options parameters: photometric {0}, compression {1}, bits per sample {2} don't conform to TIFF Baseline 6.0 standard.",new Object[]{
                     s3.n5(x8.class, var2),
                     s3.n5(com.aspose.slides.internal.w2a.a6.class, var3),
                     n5(var4)
                  }),
                  8
               );
            }

            var5 = false;
      }

      return var5;
   }
}
