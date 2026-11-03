package com.aspose.slides.internal.c9t;

import com.aspose.slides.internal.j9e.t4;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.image.BandedSampleModel;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

public class t2 extends ImageWriter {
   private ImageOutputStream n5 = null;
   private ByteArrayOutputStream l6 = null;
   private int k5;
   private boolean u3 = false;
   private int a6;
   private int u9;
   private int h0 = 0;
   private int[] c8;
   private int[] t2;
   private byte[] s7;
   private short[] x8;
   private int[] n3;

   public t2(ImageWriterSpi var1) {
      super(var1);
   }

   @Override
   public void setOutput(Object output) {
      super.setOutput(output);
      if (output != null) {
         if (!(output instanceof ImageOutputStream)) {
            throw new IllegalArgumentException("Invalid output type");
         }

         this.n5 = (ImageOutputStream)output;
         this.n5.setByteOrder(ByteOrder.LITTLE_ENDIAN);
      } else {
         this.n5 = null;
      }
   }

   @Override
   public IIOMetadata getDefaultStreamMetadata(ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata getDefaultImageMetadata(ImageTypeSpecifier imageType, ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata convertStreamMetadata(IIOMetadata inData, ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata convertImageMetadata(IIOMetadata metadata, ImageTypeSpecifier type, ImageWriteParam param) {
      return null;
   }

   @Override
   public boolean canWriteRasters() {
      return true;
   }

   @Override
   public void write(IIOMetadata streamMetadata, IIOImage image, ImageWriteParam param) throws IOException {
      if (this.n5 == null) {
         throw new IllegalStateException("stream == null");
      }

      if (image == null) {
         throw new IllegalArgumentException("image == null");
      }

      this.clearAbortRequest();
      this.processImageStarted(0);
      if (param == null) {
         param = this.getDefaultWriteParam();
      }

      ImageWriteParam var4 = param;
      int var5 = 24;
      boolean var6 = false;
      int var7 = 0;
      IndexColorModel var8 = null;
      RenderedImage var9 = null;
      Raster var10 = null;
      boolean var11 = image.hasRaster();
      Rectangle var12 = param.getSourceRegion();
      SampleModel var13 = null;
      Object var14 = null;
      this.h0 = 0;
      var9 = image.getRenderedImage();
      var9 = this.n5(image.getRenderedImage());
      if (var9 != null) {
         ColorModel var72;
         if (var11) {
            var9 = null;
            var10 = image.getRaster();
            var13 = var10.getSampleModel();
            var72 = n5((ColorSpace)null, var13);
            if (var12 == null) {
               var12 = var10.getBounds();
            } else {
               var12 = var12.intersection(var10.getBounds());
            }
         } else {
            var13 = var9.getSampleModel();
            var72 = var9.getColorModel();
            Rectangle var15 = new Rectangle(var9.getMinX(), var9.getMinY(), var9.getWidth(), var9.getHeight());
            if (var12 == null) {
               var12 = var15;
            } else {
               var12 = var12.intersection(var15);
            }
         }

         if (var12.isEmpty()) {
            throw new RuntimeException("sourceRegion is empty");
         }

         int var73 = param.getSourceXSubsampling();
         int var16 = param.getSourceYSubsampling();
         int var17 = param.getSubsamplingXOffset();
         int var18 = param.getSubsamplingYOffset();
         int var19 = var13.getDataType();
         var12.translate(var17, var18);
         var12.width -= var17;
         var12.height -= var18;
         int var20 = var12.x / var73;
         int var21 = var12.y / var16;
         this.a6 = (var12.width + var73 - 1) / var73;
         this.u9 = (var12.height + var16 - 1) / var16;
         var17 = var12.x % var73;
         var18 = var12.y % var16;
         Rectangle var22 = new Rectangle(var20, var21, this.a6, this.u9);
         boolean var23 = var22.equals(var12);
         int[] var24 = param.getSourceBands();
         boolean var25 = true;
         int var26 = var13.getNumBands();
         if (var24 != null) {
            var13 = var13.createSubsetSampleModel(var24);
            var72 = null;
            var25 = false;
            var26 = var13.getNumBands();
         } else {
            var24 = new int[var26];
            int var27 = 0;

            while (var27 < var26) {
               var24[var27] = var27++;
            }
         }

         int[] var77 = null;
         boolean var28 = true;
         if (var13 instanceof ComponentSampleModel) {
            var77 = ((ComponentSampleModel)var13).getBandOffsets();
            if (var13 instanceof BandedSampleModel) {
               var28 = false;
            } else {
               for (int var29 = 0; var29 < var77.length; var29++) {
                  var28 &= var77[var29] == var77.length - var29 - 1;
               }
            }
         } else if (var13 instanceof SinglePixelPackedSampleModel) {
            int[] var78 = ((SinglePixelPackedSampleModel)var13).getBitOffsets();

            for (int var30 = 0; var30 < var78.length - 1; var30++) {
               var28 &= var78[var30] > var78[var30 + 1];
            }
         }

         if (var77 == null) {
            var77 = new int[var26];
            int var79 = 0;

            while (var79 < var26) {
               var77[var79] = var79++;
            }
         }

         var23 &= var28;
         int[] var80 = var13.getSampleSize();
         int var81 = this.a6 * var26;
         switch (var4.getCompressionMode()) {
            case 1:
               this.k5 = this.n5(var72, var13);
               break;
            case 2:
               this.k5 = this.n5(var4.getCompressionType());
               break;
            case 3:
               this.k5 = this.n5(var72, var13);
               break;
            default:
               this.k5 = 0;
         }

         if (!this.n5(this.k5, var72, var13)) {
            throw new IOException("Image can not be encoded with compression type " + com.aspose.slides.internal.c9t.n5.n5[this.k5]);
         }

         byte[] var31 = null;
         byte[] var32 = null;
         byte[] var33 = null;
         byte[] var34 = null;
         if (this.k5 == 3) {
            var5 = DataBuffer.getDataTypeSize(var13.getDataType());
            if (var5 != 16 && var5 != 32) {
               var5 = 32;
               var23 = false;
            }

            var81 = this.a6 * var5 + 7 >> 3;
            var6 = true;
            var7 = 3;
            var31 = new byte[var7];
            var32 = new byte[var7];
            var33 = new byte[var7];
            var34 = new byte[var7];
            int var35 = 16711680;
            int var36 = 65280;
            int var37 = 255;
            if (var5 == 16) {
               if (!(var72 instanceof DirectColorModel)) {
                  throw new IOException("Image can not be encoded with compression type " + com.aspose.slides.internal.c9t.n5.n5[this.k5]);
               }

               DirectColorModel var38 = (DirectColorModel)var72;
               var35 = var38.getRedMask();
               var36 = var38.getGreenMask();
               var37 = var38.getBlueMask();
            }

            this.n5(var35, 0, var31, var32, var33, var34);
            this.n5(var36, 1, var31, var32, var33, var34);
            this.n5(var37, 2, var31, var32, var33, var34);
            if (!var23) {
               this.c8 = new int[3];
               this.c8[0] = var35;
               this.c8[1] = var36;
               this.c8[2] = var37;
               this.t2 = new int[3];
               this.t2[0] = this.k5(var35);
               this.t2[1] = this.k5(var36);
               this.t2[2] = this.k5(var37);
            }

            if (var72 instanceof IndexColorModel) {
               var8 = (IndexColorModel)var72;
            }
         } else if (var72 instanceof IndexColorModel) {
            var6 = true;
            var8 = (IndexColorModel)var72;
            var7 = var8.getMapSize();
            if (var7 <= 2) {
               var5 = 1;
               var81 = this.a6 + 7 >> 3;
            } else if (var7 <= 16) {
               var5 = 4;
               var81 = this.a6 + 1 >> 1;
            } else if (var7 <= 256) {
               var5 = 8;
            } else {
               var5 = 24;
               var6 = false;
               var7 = 0;
               var81 = this.a6 * 3;
            }

            if (var6) {
               var31 = new byte[var7];
               var32 = new byte[var7];
               var33 = new byte[var7];
               var34 = new byte[var7];
               var8.getAlphas(var34);
               var8.getReds(var31);
               var8.getGreens(var32);
               var8.getBlues(var33);
            }
         } else if (!(var72 instanceof ComponentColorModel) || var26 == 1 && var72.getPixelSize() == 8 && var19 == 0) {
            if (var26 == 1) {
               var6 = true;
               var7 = 256;
               var5 = var80[0];
               var81 = this.a6 * var5 + 7 >> 3;
               var31 = new byte[256];
               var32 = new byte[256];
               var33 = new byte[256];
               var34 = new byte[256];

               for (int var83 = 0; var83 < 256; var83++) {
                  var31[var83] = (byte)var83;
                  var32[var83] = (byte)var83;
                  var33[var83] = (byte)var83;
                  var34[var83] = -1;
               }
            } else if (var13 instanceof SinglePixelPackedSampleModel && var25) {
               int[] var84 = var13.getSampleSize();
               var5 = 0;

               for (int var39 : var84) {
                  var5 += var39;
               }

               var5 = this.u3(var5);
               if (var5 != DataBuffer.getDataTypeSize(var13.getDataType())) {
                  var23 = false;
               }

               var81 = this.a6 * var5 + 7 >> 3;
            }
         } else {
            ComponentColorModel var82 = (ComponentColorModel)var72;
            var5 = var82.getPixelSize();
         }

         int var85 = 0;
         int var90 = 0;
         byte var93 = 0;
         int var96 = 0;
         byte var100 = 0;
         byte var40 = 0;
         int var41 = var7;
         int var42 = var7;
         int var43 = var81 % 4;
         if (var43 != 0) {
            var43 = 4 - var43;
         }

         var90 = 54 + var7 * 4;
         var96 = (var81 + var43) * this.u9;
         var85 = var96 + var90;
         var93 = 40;
         long var44 = this.n5.getStreamPosition();
         this.n5(var85, var90);
         this.l6(var93, var5);
         this.n5.writeInt(this.k5);
         this.n5.writeInt(var96);
         this.n5.writeInt(var100);
         this.n5.writeInt(var40);
         this.n5.writeInt(var41);
         this.n5.writeInt(var42);
         if (var6) {
            if (this.k5 == 3) {
               for (int var46 = 0; var46 < 3; var46++) {
                  int var47 = (var34[var46] & 255) + (var31[var46] & 255) * 256 + (var32[var46] & 255) * 65536 + (var33[var46] & 255) * 16777216;
                  this.n5.writeInt(var47);
               }
            } else {
               for (int var101 = 0; var101 < var7; var101++) {
                  this.n5.writeByte(var33[var101]);
                  this.n5.writeByte(var32[var101]);
                  this.n5.writeByte(var31[var101]);
                  this.n5.writeByte(var34[var101]);
               }
            }
         }

         int var102 = this.a6 * var26;
         int[] var103 = new int[var102 * var73];
         this.s7 = new byte[var81];
         if (this.k5 != 4 && this.k5 != 5) {
            int var50 = var77[0];

            for (int var51 = 1; var51 < var77.length; var51++) {
               if (var77[var51] > var50) {
                  var50 = var77[var51];
               }
            }

            int[] var104 = new int[var50 + 1];
            int var52 = var81;
            if (var23 && var25) {
               var52 = var81 / (DataBuffer.getDataTypeSize(var19) >> 3);
            }

            for (int var53 = 0; var53 < this.u9 && !this.abortRequested(); var53++) {
               int var54 = var21 + var53;
               if (!this.u3) {
                  var54 = var21 + this.u9 - var53 - 1;
               }

               Raster var55 = var10;
               Rectangle var56 = new Rectangle(var20 * var73 + var17, var54 * var16 + var18, (this.a6 - 1) * var73 + 1, 1);
               if (!var11) {
                  var55 = var9.getData(var56);
               }

               if (var23 && var25) {
                  SampleModel var105 = var55.getSampleModel();
                  int var106 = 0;
                  int var107 = var56.x - var55.getSampleModelTranslateX();
                  int var108 = var56.y - var55.getSampleModelTranslateY();
                  if (var105 instanceof ComponentSampleModel) {
                     ComponentSampleModel var110 = (ComponentSampleModel)var105;
                     var106 = var110.getOffset(var107, var108, 0);

                     for (int var62 = 1; var62 < var110.getNumBands(); var62++) {
                        if (var106 > var110.getOffset(var107, var108, var62)) {
                           var106 = var110.getOffset(var107, var108, var62);
                        }
                     }
                  } else if (var105 instanceof MultiPixelPackedSampleModel) {
                     MultiPixelPackedSampleModel var61 = (MultiPixelPackedSampleModel)var105;
                     var106 = var61.getOffset(var107, var108);
                  } else if (var105 instanceof SinglePixelPackedSampleModel) {
                     SinglePixelPackedSampleModel var109 = (SinglePixelPackedSampleModel)var105;
                     var106 = var109.getOffset(var107, var108);
                  }

                  if (this.k5 == 0 || this.k5 == 3) {
                     switch (var19) {
                        case 0:
                           byte[] var113 = ((DataBufferByte)var55.getDataBuffer()).getData();
                           this.n5.write(var113, var106, var52);
                           break;
                        case 1:
                           short[] var63 = ((DataBufferUShort)var55.getDataBuffer()).getData();
                           this.n5.writeShorts(var63, var106, var52);
                           break;
                        case 2:
                           short[] var115 = ((DataBufferShort)var55.getDataBuffer()).getData();
                           this.n5.writeShorts(var115, var106, var52);
                           break;
                        case 3:
                           int[] var64 = ((DataBufferInt)var55.getDataBuffer()).getData();
                           this.n5.writeInts(var64, var106, var52);
                     }

                     for (int var114 = 0; var114 < var43; var114++) {
                        this.n5.writeByte(0);
                     }
                  } else if (this.k5 == 2) {
                     if (this.s7 == null || this.s7.length < var102) {
                        this.s7 = new byte[var102];
                     }

                     var55.getPixels(var56.x, var56.y, var56.width, var56.height, var103);

                     for (int var111 = 0; var111 < var102; var111++) {
                        this.s7[var111] = (byte)var103[var111];
                     }

                     this.l6(this.s7, var102);
                  } else if (this.k5 == 1) {
                     if (this.s7 == null || this.s7.length < var102) {
                        this.s7 = new byte[var102];
                     }

                     var55.getPixels(var56.x, var56.y, var56.width, var56.height, var103);

                     for (int var112 = 0; var112 < var102; var112++) {
                        this.s7[var112] = (byte)var103[var112];
                     }

                     this.n5(this.s7, var102);
                  }
               } else {
                  var55.getPixels(var56.x, var56.y, var56.width, var56.height, var103);
                  if (var73 != 1 || var50 != var26 - 1) {
                     int var57 = 0;
                     int var58 = 0;

                     for (int var59 = 0; var57 < this.a6; var59 += var26) {
                        System.arraycopy(var103, var58, var104, 0, var104.length);

                        for (int var60 = 0; var60 < var26; var60++) {
                           var103[var59 + var60] = var104[var24[var60]];
                        }

                        var57++;
                        var58 += var73 * var26;
                     }
                  }

                  this.n5(0, var102, var5, var103, var43, var26, var8);
               }

               this.processImageProgress(100.0F * ((float)var53 / this.u9));
            }

            if (this.k5 == 2 || this.k5 == 1) {
               this.n5.writeByte(0);
               this.n5.writeByte(1);
               this.n5(2);
               var96 = this.h0;
               var85 = this.h0 + var90;
               long var65 = this.n5.getStreamPosition();
               this.n5.seek(var44);
               this.k5(var85, 2);
               this.n5.seek(var44);
               this.k5(var96, 34);
               this.n5.seek(var65);
            }

            if (this.abortRequested()) {
               this.processWriteAborted();
            } else {
               this.processImageComplete();
               this.n5.flushBefore(this.n5.getStreamPosition());
            }
         } else {
            this.l6 = new ByteArrayOutputStream();
            this.n5(image, var4);
            this.l6.flush();
            var96 = this.l6.size();
            long var48 = this.n5.getStreamPosition();
            var85 = var90 + var96;
            this.n5.seek(var44);
            this.k5(var85, 2);
            this.n5.seek(var44);
            this.k5(var96, 34);
            this.n5.seek(var48);
            this.n5.write(this.l6.toByteArray());
            this.l6 = null;
            if (this.abortRequested()) {
               this.processWriteAborted();
            } else {
               this.processImageComplete();
               this.n5.flushBefore(this.n5.getStreamPosition());
            }
         }
      }
   }

   private RenderedImage n5(RenderedImage var1) throws IOException {
      Object var2 = var1.getProperty("pixelFormat");
      int var3 = 0;
      if (!var2.equals(BufferedImage.UndefinedProperty)) {
         var3 = (Integer)var2;
      }

      Object var4 = var1.getProperty("bitspPixel");
      int var5 = 0;
      if (!var4.equals(BufferedImage.UndefinedProperty)) {
         var5 = (Integer)var4;
      }

      Object var6 = var1.getProperty("dpiX");
      int var7 = 0;
      if (!var6.equals(BufferedImage.UndefinedProperty)) {
         var7 = ((Float)var6).intValue();
      }

      Object var8 = var1.getProperty("dpiY");
      int var9 = 0;
      if (!var8.equals(BufferedImage.UndefinedProperty)) {
         var9 = ((Float)var8).intValue();
      }

      ColorModel var10 = var1.getColorModel();
      ColorSpace var11 = var10.getColorSpace();
      if (var11 instanceof com.aspose.slides.internal.p0s.l6) {
         ColorConvertOp var12 = new ColorConvertOp(var11, ColorSpace.getInstance(1004), null);
         var1 = var12.filter((BufferedImage)var1, null);
      }

      if (var5 == 0 && var3 == 0) {
         return var1;
      } else if (var3 == 8207) {
         return com.aspose.slides.internal.t5g.u3.l6((BufferedImage)var1);
      } else if (var5 == 16) {
         return com.aspose.slides.internal.t5g.u3.l6((BufferedImage)var1);
      } else if (var5 <= 24) {
         return this.n5(var1, var5, var3);
      } else if (var5 == 48) {
         int var18 = var1.getWidth();
         int var13 = var1.getHeight();
         int[] var14 = ((BufferedImage)var1).getRGB(0, 0, var18, var13, null, 0, var18);
         var1 = new BufferedImage(var18, var13, 1);
         ((BufferedImage)var1).setRGB(0, 0, var18, var13, var14, 0, var18);
         return var1;
      } else if (var5 == 64) {
         RenderedImage var16 = this.n5(var1, var5, var3);
         com.aspose.slides.internal.c9t.k5.l6(var16, var7, var9, (ImageOutputStream)this.getOutput());
         return null;
      } else {
         RenderedImage var15 = this.n5(var1, 32, 2498570);
         com.aspose.slides.internal.c9t.k5.n5(var15, var7, var9, (ImageOutputStream)this.getOutput());
         return null;
      }
   }

   private RenderedImage n5(RenderedImage var1, int var2, int var3) {
      ColorModel var4 = var1.getColorModel();
      if (!(var4 instanceof DirectColorModel)) {
         return var1;
      }

      WritableRaster var5 = ((BufferedImage)var1).getRaster();
      DataBuffer var6 = var5.getDataBuffer();
      DirectColorModel var7 = (DirectColorModel)var4;
      SampleModel var8 = null;
      int[] var9 = null;
      if (var7.getNumColorComponents() <= 3 && var2 <= 24) {
         var9 = new int[]{var7.getRedMask(), var7.getGreenMask(), var7.getBlueMask()};
      } else if (var7.getNumColorComponents() <= 3 && var2 > 24) {
         if (!var4.hasAlpha() && !t4.n5(var3, 262144)) {
            var7 = new DirectColorModel(32, 16711680, 65280, 255);
            var9 = new int[]{var7.getRedMask(), var7.getGreenMask(), var7.getBlueMask()};
         } else {
            var7 = new DirectColorModel(32, 16711680, 65280, 255, -16777216);
            var9 = new int[]{var7.getRedMask(), var7.getGreenMask(), var7.getBlueMask(), var7.getAlphaMask()};
         }
      }

      var8 = new SinglePixelPackedSampleModel(var6 instanceof DataBufferUShort ? 1 : 3, var1.getWidth(), var1.getHeight(), var9);
      return new BufferedImage(var7, Raster.createWritableRaster(var8, var6, null), t4.n5(var3, 524288), null);
   }

   private void n5(int var1, int var2, int var3, int[] var4, int var5, int var6, IndexColorModel var7) throws IOException {
      int var8 = 0;
      int var9 = 0;
      switch (var3) {
         case 1:
            for (int var43 = 0; var43 < var2 / 8; var43++) {
               this.s7[var9++] = (byte)(
                  var4[var1++] << 7
                     | var4[var1++] << 6
                     | var4[var1++] << 5
                     | var4[var1++] << 4
                     | var4[var1++] << 3
                     | var4[var1++] << 2
                     | var4[var1++] << 1
                     | var4[var1++]
               );
            }

            if (var2 % 8 > 0) {
               var8 = 0;

               for (int var44 = 0; var44 < var2 % 8; var44++) {
                  var8 |= var4[var1++] << 7 - var44;
               }

               this.s7[var9++] = (byte)var8;
            }

            this.n5.write(this.s7, 0, (var2 + 7) / 8);
            break;
         case 4:
            if (this.k5 == 2) {
               byte[] var41 = new byte[var2];

               for (int var48 = 0; var48 < var2; var48++) {
                  var41[var48] = (byte)var4[var1++];
               }

               this.l6(var41, var2);
            } else {
               for (int var42 = 0; var42 < var2 / 2; var42++) {
                  var8 = var4[var1++] << 4 | var4[var1++];
                  this.s7[var9++] = (byte)var8;
               }

               if (var2 % 2 == 1) {
                  var8 = var4[var1] << 4;
                  this.s7[var9++] = (byte)var8;
               }

               this.n5.write(this.s7, 0, (var2 + 1) / 2);
            }
            break;
         case 8:
            if (this.k5 == 1) {
               for (int var39 = 0; var39 < var2; var39++) {
                  this.s7[var39] = (byte)var4[var1++];
               }

               this.n5(this.s7, var2);
            } else {
               for (int var40 = 0; var40 < var2; var40++) {
                  this.s7[var40] = (byte)var4[var1++];
               }

               this.n5.write(this.s7, 0, var2);
            }
            break;
         case 16:
            if (this.x8 == null) {
               this.x8 = new short[var2 / var6];
            }

            int var38 = 0;

            for (int var47 = 0; var38 < var2; var47++) {
               this.x8[var47] = 0;
               if (this.k5 == 0) {
                  this.x8[var47] = (short)((31 & var4[var38]) << 10 | (31 & var4[var38 + 1]) << 5 | 31 & var4[var38 + 2]);
                  var38 += 3;
               } else {
                  for (int var51 = 0; var51 < var6; var38++) {
                     this.x8[var47] = (short)(this.x8[var47] | var4[var38] << this.t2[var51] & this.c8[var51]);
                     var51++;
                  }
               }
            }

            this.n5.writeShorts(this.x8, 0, this.x8.length);
            break;
         case 24:
            if (var6 == 3) {
               for (int var36 = 0; var36 < var2; var36 += var6) {
                  this.s7[var9++] = (byte)var4[var1 + 2];
                  this.s7[var9++] = (byte)var4[var1 + 1];
                  this.s7[var9++] = (byte)var4[var1];
                  var1 += var6;
               }

               this.n5.write(this.s7, 0, var2);
            } else {
               int var37 = var7.getMapSize();
               byte[] var46 = new byte[var37];
               byte[] var50 = new byte[var37];
               byte[] var13 = new byte[var37];
               var7.getReds(var46);
               var7.getGreens(var50);
               var7.getBlues(var13);

               for (int var14 = 0; var14 < var2; var14++) {
                  int var15 = var4[var1];
                  this.s7[var9++] = var13[var15];
                  this.s7[var9++] = var50[var15];
                  this.s7[var9++] = var13[var15];
                  var1++;
               }

               this.n5.write(this.s7, 0, var2 * 3);
            }
            break;
         case 32:
            if (this.n3 == null) {
               this.n3 = new int[var2 / var6];
            }

            if (var6 == 3) {
               int var35 = 0;

               for (int var45 = 0; var35 < var2; var45++) {
                  this.n3[var45] = 0;
                  if (this.k5 == 0) {
                     this.n3[var45] = (0xFF & var4[var35 + 2]) << 16 | (0xFF & var4[var35 + 1]) << 8 | 0xFF & var4[var35];
                     var35 += 3;
                  } else {
                     for (int var49 = 0; var49 < var6; var35++) {
                        this.n3[var45] = this.n3[var45] | var4[var35] << this.t2[var49] & this.c8[var49];
                        var49++;
                     }
                  }
               }
            } else if (var6 != 4) {
               for (int var34 = 0; var34 < var2; var34++) {
                  if (var7 != null) {
                     this.n3[var34] = var7.getRGB(var4[var34]);
                  } else {
                     this.n3[var34] = var4[var34] << 16 | var4[var34] << 8 | var4[var34];
                  }
               }
            } else {
               int var10 = 0;

               for (int var11 = 0; var10 < var2; var11++) {
                  this.n3[var11] = 0;
                  if (this.k5 == 0) {
                     this.n3[var11] = (0xFF & var4[var10 + 3]) << 24
                        | (0xFF & var4[var10 + 2]) << 0
                        | (0xFF & var4[var10 + 1]) << 8
                        | (0xFF & var4[var10 + 0]) << 16;
                     var10 += 4;
                  } else {
                     for (int var12 = 0; var12 < var6; var10++) {
                        this.n3[var11] = this.n3[var11] | var4[var10] << this.t2[var12] & this.c8[var12];
                        var12++;
                     }
                  }
               }
            }

            this.n5.writeInts(this.n3, 0, this.n3.length);
      }

      if (this.k5 == 0) {
         for (int var33 = 0; var33 < var5; var33++) {
            this.n5.writeByte(0);
         }
      }
   }

   private void n5(byte[] var1, int var2) throws IOException {
      int var3 = 1;
      int var4 = -1;
      int var5 = -1;
      byte var6 = 0;
      byte var7 = 0;
      var6 = var1[++var5];
      byte[] var8 = new byte[256];

      while (var5 < var2 - 1) {
         var7 = var1[++var5];
         if (var7 == var6) {
            if (var4 >= 3) {
               this.n5.writeByte(0);
               this.n5.writeByte(var4);
               this.n5(2);

               for (int var14 = 0; var14 < var4; var14++) {
                  this.n5.writeByte(var8[var14]);
                  this.n5(1);
               }

               if (!this.l6(var4)) {
                  this.n5.writeByte(0);
                  this.n5(1);
               }
            } else if (var4 > -1) {
               for (int var15 = 0; var15 < var4; var15++) {
                  this.n5.writeByte(1);
                  this.n5.writeByte(var8[var15]);
                  this.n5(2);
               }
            }

            var4 = -1;
            if (++var3 == 256) {
               this.n5.writeByte(var3 - 1);
               this.n5.writeByte(var6);
               this.n5(2);
               var3 = 1;
            }
         } else {
            if (var3 > 1) {
               this.n5.writeByte(var3);
               this.n5.writeByte(var6);
               this.n5(2);
            } else if (var4 < 0) {
               var8[++var4] = var6;
               var8[++var4] = var7;
            } else if (var4 < 254) {
               var8[++var4] = var7;
            } else {
               this.n5.writeByte(0);
               this.n5.writeByte(var4 + 1);
               this.n5(2);

               for (int var9 = 0; var9 <= var4; var9++) {
                  this.n5.writeByte(var8[var9]);
                  this.n5(1);
               }

               this.n5.writeByte(0);
               this.n5(1);
               var4 = -1;
            }

            var6 = var7;
            var3 = 1;
         }

         if (var5 == var2 - 1) {
            if (var4 == -1) {
               this.n5.writeByte(var3);
               this.n5.writeByte(var6);
               this.n5(2);
               var3 = 1;
            } else if (var4 < 2) {
               if (var4 > -1) {
                  for (int var17 = 0; var17 <= var4; var17++) {
                     this.n5.writeByte(1);
                     this.n5.writeByte(var8[var17]);
                     this.n5(2);
                  }
               }
            } else {
               this.n5.writeByte(0);
               this.n5.writeByte(var4 + 1);
               this.n5(2);

               for (int var16 = 0; var16 <= var4; var16++) {
                  this.n5.writeByte(var8[var16]);
                  this.n5(1);
               }

               if (!this.l6(var4 + 1)) {
                  this.n5.writeByte(0);
                  this.n5(1);
               }
            }

            this.n5.writeByte(0);
            this.n5.writeByte(0);
            this.n5(2);
         }
      }
   }

   private void l6(byte[] var1, int var2) throws IOException {
      int var3 = 2;
      int var4 = -1;
      int var5 = -1;
      int var6 = 0;
      int var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      byte var11 = 0;
      byte[] var12 = new byte[256];
      var8 = var1[++var5];
      var9 = var1[++var5];

      while (var5 < var2 - 2) {
         var10 = var1[++var5];
         var11 = var1[++var5];
         if (var10 == var8) {
            if (var4 >= 4) {
               this.n5.writeByte(0);
               this.n5.writeByte(var4 - 1);
               this.n5(2);

               for (byte var40 = 0; var40 < var4 - 2; var40 += 2) {
                  var6 = var12[var40] << 4 | var12[var40 + 1];
                  this.n5.writeByte((byte)var6);
                  this.n5(1);
               }

               if (!this.l6(var4 - 1)) {
                  var7 = var12[var4 - 2] << 4 | 0;
                  this.n5.writeByte(var7);
                  this.n5(1);
               }

               if (!this.l6((int)Math.ceil((var4 - 1) / 2))) {
                  this.n5.writeByte(0);
                  this.n5(1);
               }
            } else if (var4 > -1) {
               this.n5.writeByte(2);
               var6 = var12[0] << 4 | var12[1];
               this.n5.writeByte(var6);
               this.n5(2);
            }

            var4 = -1;
            if (var11 == var9) {
               var3 += 2;
               if (var3 == 256) {
                  this.n5.writeByte(var3 - 1);
                  var6 = var8 << 4 | var9;
                  this.n5.writeByte(var6);
                  this.n5(2);
                  var3 = 2;
                  if (var5 < var2 - 1) {
                     var8 = var9;
                     var9 = var1[++var5];
                  } else {
                     this.n5.writeByte(1);
                     int var41 = var9 << 4 | 0;
                     this.n5.writeByte(var41);
                     this.n5(2);
                     var3 = -1;
                  }
               }
            } else {
               var3++;
               var6 = var8 << 4 | var9;
               this.n5.writeByte(var3);
               this.n5.writeByte(var6);
               this.n5(2);
               var3 = 2;
               var8 = var11;
               if (var5 < var2 - 1) {
                  var9 = var1[++var5];
               } else {
                  this.n5.writeByte(1);
                  int var42 = var11 << 4 | 0;
                  this.n5.writeByte(var42);
                  this.n5(2);
                  var3 = -1;
               }
            }
         } else {
            if (var3 > 2) {
               var6 = var8 << 4 | var9;
               this.n5.writeByte(var3);
               this.n5.writeByte(var6);
               this.n5(2);
            } else if (var4 < 0) {
               var12[++var4] = var8;
               var12[++var4] = var9;
               var12[++var4] = var10;
               var12[++var4] = var11;
            } else if (var4 < 253) {
               var12[++var4] = var10;
               var12[++var4] = var11;
            } else {
               this.n5.writeByte(0);
               this.n5.writeByte(var4 + 1);
               this.n5(2);

               for (int var13 = 0; var13 < var4; var13 += 2) {
                  var6 = var12[var13] << 4 | var12[var13 + 1];
                  this.n5.writeByte((byte)var6);
                  this.n5(1);
               }

               this.n5.writeByte(0);
               this.n5(1);
               var4 = -1;
            }

            var8 = var10;
            var9 = var11;
            var3 = 2;
         }

         if (var5 >= var2 - 2) {
            if (var4 == -1 && var3 >= 2) {
               if (var5 == var2 - 2) {
                  if (var1[++var5] == var8) {
                     var3++;
                     var6 = var8 << 4 | var9;
                     this.n5.writeByte(var3);
                     this.n5.writeByte(var6);
                     this.n5(2);
                  } else {
                     var6 = var8 << 4 | var9;
                     this.n5.writeByte(var3);
                     this.n5.writeByte(var6);
                     this.n5.writeByte(1);
                     var6 = var1[var5] << 4 | 0;
                     this.n5.writeByte(var6);
                     int var45 = var1[var5] << 4 | 0;
                     this.n5(4);
                  }
               } else {
                  this.n5.writeByte(var3);
                  var6 = var8 << 4 | var9;
                  this.n5.writeByte(var6);
                  this.n5(2);
               }
            } else if (var4 > -1) {
               if (var5 == var2 - 2) {
                  var12[++var4] = var1[++var5];
               }

               if (var4 < 2) {
                  switch (var4) {
                     case 0:
                        this.n5.writeByte(1);
                        int var44 = var12[0] << 4 | 0;
                        this.n5.writeByte(var44);
                        this.n5(2);
                        break;
                     case 1:
                        this.n5.writeByte(2);
                        var6 = var12[0] << 4 | var12[1];
                        this.n5.writeByte(var6);
                        this.n5(2);
                  }
               } else {
                  this.n5.writeByte(0);
                  this.n5.writeByte(var4 + 1);
                  this.n5(2);

                  for (byte var43 = 0; var43 < var4; var43 += 2) {
                     var6 = var12[var43] << 4 | var12[var43 + 1];
                     this.n5.writeByte((byte)var6);
                     this.n5(1);
                  }

                  if (!this.l6(var4 + 1)) {
                     var7 = var12[var4] << 4 | 0;
                     this.n5.writeByte(var7);
                     this.n5(1);
                  }

                  if (!this.l6((int)Math.ceil((var4 + 1) / 2))) {
                     this.n5.writeByte(0);
                     this.n5(1);
                  }
               }
            }

            this.n5.writeByte(0);
            this.n5.writeByte(0);
            this.n5(2);
         }
      }
   }

   private synchronized void n5(int var1) {
      this.h0 += var1;
   }

   private boolean l6(int var1) {
      return var1 % 2 == 0;
   }

   private void n5(int var1, int var2) throws IOException {
      this.n5.writeByte(66);
      this.n5.writeByte(77);
      this.n5.writeInt(var1);
      this.n5.writeInt(0);
      this.n5.writeInt(var2);
   }

   private void l6(int var1, int var2) throws IOException {
      this.n5.writeInt(var1);
      this.n5.writeInt(this.a6);
      this.n5.writeInt(this.u9);
      this.n5.writeShort(1);
      this.n5.writeShort(var2);
   }

   private void k5(int var1, int var2) throws IOException {
      this.n5.skipBytes(var2);
      this.n5.writeInt(var1);
   }

   @Override
   public void reset() {
      super.reset();
      this.n5 = null;
   }

   private int n5(String var1) {
      for (int var2 = 0; var2 < com.aspose.slides.internal.c9t.n5.n5.length; var2++) {
         if (com.aspose.slides.internal.c9t.n5.n5[var2].equals(var1)) {
            return var2;
         }
      }

      return 0;
   }

   private void n5(IIOImage var1, ImageWriteParam var2) throws IOException {
      String var3 = this.k5 == 4 ? "jpeg" : "png";
      Iterator var4 = ImageIO.getImageWritersByFormatName(var3);
      ImageWriter var5 = null;
      if (var4.hasNext()) {
         var5 = (ImageWriter)var4.next();
      }

      if (var5 != null) {
         if (this.l6 == null) {
            throw new RuntimeException("No stream for writing embedded image!");
         }

         var5.addIIOWriteProgressListener(new s7(this));
         var5.addIIOWriteWarningListener(new x8(this));
         var5.setOutput(ImageIO.createImageOutputStream(this.l6));
         ImageWriteParam var6 = var5.getDefaultWriteParam();
         var6.setDestinationOffset(var2.getDestinationOffset());
         var6.setSourceBands(var2.getSourceBands());
         var6.setSourceRegion(var2.getSourceRegion());
         var6.setSourceSubsampling(var2.getSourceXSubsampling(), var2.getSourceYSubsampling(), var2.getSubsamplingXOffset(), var2.getSubsamplingYOffset());
         var5.write(null, var1, var6);
      } else {
         throw new RuntimeException(var3 + " writer was not found");
      }
   }

   @Override
   public ImageWriteParam getDefaultWriteParam() {
      return new y4();
   }

   private int k5(int var1) {
      int var2 = 0;

      while ((var1 & 1) == 0) {
         var2++;
         var1 >>>= 1;
      }

      return var2;
   }

   protected int n5(ColorModel var1, SampleModel var2) {
      ImageTypeSpecifier var3 = new ImageTypeSpecifier(var1, var2);
      return this.n5(var3);
   }

   protected int n5(ImageTypeSpecifier var1) {
      return var1.getBufferedImageType() == 8 ? 3 : 0;
   }

   protected boolean n5(int var1, ColorModel var2, SampleModel var3) {
      ImageTypeSpecifier var4 = new ImageTypeSpecifier(var2, var3);
      return this.n5(var1, var4);
   }

   public boolean l6(ImageTypeSpecifier var1) {
      int var2 = var1.getSampleModel().getDataType();
      if (var2 >= 0 && var2 <= 3) {
         SampleModel var3 = var1.getSampleModel();
         int var4 = var3.getNumBands();
         if (var4 != 1 && var4 != 3 && var4 != 4) {
            return false;
         } else {
            return var4 == 1 && var2 != 0 ? false : var2 <= 0 || var3 instanceof SinglePixelPackedSampleModel;
         }
      } else {
         return false;
      }
   }

   protected boolean n5(int var1, ImageTypeSpecifier var2) {
      if (!this.l6(var2)) {
         return false;
      }

      int var3 = var2.getBufferedImageType();
      int var4 = var2.getColorModel().getPixelSize();
      if (this.k5 == 2 && var4 != 4) {
         return false;
      }

      if (this.k5 == 1 && var4 != 8) {
         return false;
      }

      if (var4 != 16) {
         return true;
      }

      boolean var5 = false;
      boolean var6 = false;
      SampleModel var7 = var2.getSampleModel();
      if (var7 instanceof SinglePixelPackedSampleModel) {
         int[] var8 = ((SinglePixelPackedSampleModel)var7).getSampleSize();
         var5 = true;
         var6 = true;

         for (int var9 = 0; var9 < var8.length; var9++) {
            var5 &= var8[var9] == 5;
            var6 &= var8[var9] == 5 || var9 == 1 && var8[var9] == 6;
         }
      }

      return this.k5 == 0 && var5 || this.k5 == 3 && var6;
   }

   protected void n5(int var1, int var2, byte[] var3, byte[] var4, byte[] var5, byte[] var6) {
      var5[var2] = (byte)(0xFF & var1 >> 24);
      var4[var2] = (byte)(0xFF & var1 >> 16);
      var3[var2] = (byte)(0xFF & var1 >> 8);
      var6[var2] = (byte)(0xFF & var1);
   }

   private int u3(int var1) {
      if (var1 <= 8) {
         return 8;
      } else if (var1 <= 16) {
         return 16;
      } else {
         return var1 <= 24 ? 24 : 32;
      }
   }

   private static ColorModel n5(ColorSpace var0, SampleModel var1) {
      ColorModel var2 = null;
      if (var1 == null) {
         throw new IllegalArgumentException("sampleModel == null");
      }

      int var3 = var1.getNumBands();
      if (var3 >= 1 && var3 <= 4) {
         int var4 = var1.getDataType();
         if (var1 instanceof ComponentSampleModel) {
            if (var4 < 0 || var4 > 5) {
               return null;
            }

            if (var0 == null) {
               var0 = var3 <= 2 ? ColorSpace.getInstance(1003) : ColorSpace.getInstance(1000);
            }

            boolean var5 = var3 == 2 || var3 == 4;
            int var6 = var5 ? 3 : 1;
            boolean var7 = false;
            int var8 = DataBuffer.getDataTypeSize(var4);
            int[] var9 = new int[var3];

            for (int var10 = 0; var10 < var3; var10++) {
               var9[var10] = var8;
            }

            var2 = new ComponentColorModel(var0, var9, var5, var7, var6, var4);
         } else if (var1 instanceof SinglePixelPackedSampleModel) {
            SinglePixelPackedSampleModel var15 = (SinglePixelPackedSampleModel)var1;
            int[] var17 = var15.getBitMasks();
            int var19 = 0;
            int var22 = 0;
            int var25 = 0;
            int var27 = 0;
            var3 = var17.length;
            if (var3 <= 2) {
               var19 = var22 = var25 = var17[0];
               if (var3 == 2) {
                  var27 = var17[1];
               }
            } else {
               var19 = var17[0];
               var22 = var17[1];
               var25 = var17[2];
               if (var3 == 4) {
                  var27 = var17[3];
               }
            }

            int[] var11 = var15.getSampleSize();
            int var12 = 0;

            for (int var13 = 0; var13 < var11.length; var13++) {
               var12 += var11[var13];
            }

            if (var0 == null) {
               var0 = ColorSpace.getInstance(1000);
            }

            var2 = new DirectColorModel(var0, var12, var19, var22, var25, var27, false, var1.getDataType());
         } else if (var1 instanceof MultiPixelPackedSampleModel) {
            int var16 = ((MultiPixelPackedSampleModel)var1).getPixelBitStride();
            int var18 = 1 << var16;
            byte[] var21 = new byte[var18];

            for (int var24 = 0; var24 < var18; var24++) {
               var21[var24] = (byte)(255 * var24 / (var18 - 1));
            }

            var2 = new IndexColorModel(var16, var18, var21, var21, var21);
         }

         return var2;
      } else {
         return null;
      }
   }

   // $VF: synthetic method
   static void n5(t2 var0, float var1) {
      var0.processImageProgress(var1);
   }

   // $VF: synthetic method
   static void n5(t2 var0, int var1, String var2) {
      var0.processWarningOccurred(var1, var2);
   }
}
