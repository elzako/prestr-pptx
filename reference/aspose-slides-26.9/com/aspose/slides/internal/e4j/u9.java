package com.aspose.slides.internal.e4j;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.w2a.x8;
import com.aspose.slides.ms.System.c3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;

public class u9 implements l6 {
   protected int[] n5;
   protected int l6;
   protected int k5;
   protected int u3;
   protected boolean a6;
   protected int[] u9;
   protected com.aspose.slides.internal.f2i.n5 h0;

   public u9(com.aspose.slides.internal.f2i.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("options");
      }

      this.n5 = var1.k7();
      this.l6 = var1.y2();
      this.k5 = var1.j5();
      this.u3 = var1.m3();
      this.u9 = var1.z8();
      this.a6 = var1.w1();
      this.h0 = var1;
   }

   @Override
   public boolean n5(boolean var1) {
      boolean var2 = true;
      switch (this.l6) {
         case 0:
         case 1:
            if (this.n5.length != 1) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     "The MinIsWhite or MinIsBlack photometric for TIFF images require samples per pixels to be equal 1.", 5
                  );
               }

               var2 = false;
            }
            break;
         case 2:
            if (this.n5.length < 3) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3("The samples per pixel are invalid. Samples per pixels should be at least 3 for RGB images.", 5);
               }

               var2 = false;
            }
            break;
         case 3:
            if (this.n5.length != 1) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3("The palette TIFF images require samples per pixels to be equal 1.", 5);
               }

               var2 = false;
            } else {
               int[] var3 = this.u9;
               if (var3 == null) {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        "The palette TIFF images require ColorMap to be defined. Use ColorMap or Palette property to specify the ColorMap.", 1
                     );
                  }

                  var2 = false;
               } else {
                  int var4 = com.aspose.slides.internal.v6g.k5.u3(3.0 * q1.a6(2.0, this.n5[0] & 65535), 14);
                  if (var3.length != var4) {
                     if (!var1) {
                        throw new com.aspose.slides.internal.h6t.u3(
                           "The palette TIFF images require ColorMap length corresponding to the followign formula: 3 * (2**BitsPerSample).", 2
                        );
                     }

                     var2 = false;
                  }
               }
            }
            break;
         case 4:
         default:
            if (!var1) {
               throw new com.aspose.slides.internal.h6t.u3(
                  d1.n5("The Photometric={0} format is not supported at the moment.", new Object[]{s3.n5(x8.class, this.l6)})
               );
            }

            var2 = false;
            break;
         case 5:
            if (var1) {
               var2 = false;
            }
            break;
         case 6:
            if (this.n5.length != 3) {
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3("The samples per pixel are invalid. Samples per pixels should be at least 3 for YCbCr images.", 5);
               }

               var2 = false;
            } else if (this.u3 != 7 && this.u3 != 6) {
               int[] var5 = this.h0.t9();
               if (var5.length == 2
                  && ((var5[0] & 65535) == 1 || (var5[0] & 65535) == 2 || (var5[0] & 65535) == 4)
                  && ((var5[1] & 65535) == 1 || (var5[1] & 65535) == 2 || (var5[1] & 65535) == 4)
                  && (var5[1] & 65535) <= (var5[0] & 65535)) {
                  int var6 = var5[0];
                  int var7 = var5[1];
                  if (((this.h0.v4() & 4294967295L) % (var6 & 65535) & 4294967295L) != 0L) {
                     if (!var1) {
                        throw new com.aspose.slides.internal.h6t.u3(
                           d1.n5("Invalid image width={0}. The image width must be integer multiples of YCbCrSubsampleHoriz={1}.",new Object[]{ this.h0.v4(), var6})
                        );
                     }

                     var2 = false;
                  } else if (((this.h0.z7() & 4294967295L) % (var7 & 65535) & 4294967295L) != 0L) {
                     if (!var1) {
                        throw new com.aspose.slides.internal.h6t.u3(
                           d1.n5("Invalid image height={0}. The image height must be integer multiples of YCbCrSubsampleVert={1}.",new Object[]{ this.h0.z7(), var7})
                        );
                     }

                     var2 = false;
                  } else if (this.h0.o0() == 2) {
                     if (!var1) {
                        throw new com.aspose.slides.internal.h6t.u3("The horizontal differencing isn't supported for YCbCr images.");
                     }

                     var2 = false;
                  } else {
                     long var8 = this.h0.d2();
                     if ((var8 & 4294967295L) != 4294967295L && ((var8 & 4294967295L) % (var7 & 65535) & 4294967295L) != 0L) {
                        if (!var1) {
                           throw new com.aspose.slides.internal.h6t.u3(
                              d1.n5(
                                 "Invalid rows per strip value RowsPerStrip={0}. Rows per strip must be an integer multiple of YCbCrSubsampleVert = {1}",new Object[]{
                                 var8,
                                 var7
                              })
                           );
                        }

                        var2 = false;
                     } else {
                        int var10 = this.u3;
                        if (var10 != 1 && var10 != 5 && var10 != 32946) {
                           if (!var1) {
                              throw new com.aspose.slides.internal.h6t.u3(
                                 d1.n5(
                                    "The compression {0} is not supported fro YCbCr images.",
                                    new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, var10)}
                                 )
                              );
                           }

                           var2 = false;
                        } else if (this.h0.t4()) {
                           int var11 = com.aspose.slides.internal.v6g.k5.n5(this.h0.s7(322).h0(), int[].class)[0];
                           if ((var11 & 65535) % (var6 & 65535) != 0) {
                              if (!var1) {
                                 throw new com.aspose.slides.internal.h6t.u3(
                                    d1.n5(
                                       "Invalid image tile width={0}. The image tile width must be integer multiples of YCbCrSubsampleHoriz={1}.",new Object[]{ var11, var6
                                    })
                                 );
                              }

                              var2 = false;
                           } else {
                              int var12 = com.aspose.slides.internal.v6g.k5.n5(this.h0.s7(323).h0(), int[].class)[0];
                              if ((var12 & 65535) % (var7 & 65535) != 0) {
                                 if (!var1) {
                                    throw new com.aspose.slides.internal.h6t.u3(
                                       d1.n5(
                                          "Invalid image tile height={0}. The image tile height must be integer multiples of YCbCrSubsampleVert={1}.",new Object[]{
                                          var12,
                                          var7
                                       })
                                    );
                                 }

                                 var2 = false;
                              }
                           }
                        }
                     }
                  }
               } else {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5(
                           "Invalid image subsampling factors for chrominance components. YCbCrSubsampleHoriz ={0}, YCbCrSubsampleVert={1}",new Object[]{ var5[0], var5[1]
                        })
                     );
                  }

                  var2 = false;
               }
            }
      }

      if (var2) {
         switch (this.u3) {
            case 1:
            case 5:
            case 8:
            case 32773:
            case 32946:
               break;
            case 2:
            case 3:
            case 4:
            case 32771:
               if (this.n5.length != 1) {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5("For compression {0} expected 1 sample per pixel.", new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3)}), 3
                     );
                  }

                  var2 = false;
               } else if (this.l6 != 1 && this.l6 != 0) {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5(
                           "For compression {0} the photometric should be MinIsWhite or MinIsBlack only.",
                           new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3)}
                        ),
                        4
                     );
                  }

                  var2 = false;
               } else if ((this.n5[0] & 65535) != 1) {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5("For compression {0} expected 1 bit per sample.", new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3)}), 3
                     );
                  }

                  var2 = false;
               }
               break;
            case 6:
            case 7:
               if (this.l6 != 1 && this.l6 != 2 && this.l6 != 6) {
                  if (!var1) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5(
                           "For compression {0} the photometric should be MinIsBlack, RGB or YCbCr only.",
                           new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3)}
                        ),
                        4
                     );
                  }

                  var2 = false;
               } else if (this.a6 && this.k5 == 0) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     d1.n5("The unspecified data is not supported by {0} compression", new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3)}),
                     6
                  );
               }
               break;
            default:
               if (!var1) {
                  throw new com.aspose.slides.internal.h6t.u3(
                     d1.n5("The compression {0} is not supported at the moment.", new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.u3)})
                  );
               }

               var2 = false;
         }
      }

      return var2;
   }

   public static String n5(int[] var0) {
      a5 var1 = new a5("[");

      for (int var5 : var0) {
         var1.n5(c3.n5(var5, "G"));
         var1.n5(',');
      }

      var1.n5(var1.l6() - 1, ']');
      return var1.toString();
   }
}
