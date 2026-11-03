package com.aspose.slides.internal.c9t;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferUShort;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public class a6 extends ImageReader {
   private u3 n5;
   private n3 l6;
   private int k5;
   private SampleModel u3;
   private SampleModel a6;
   private ColorModel u9;
   private ColorModel h0;
   private ImageInputStream c8 = null;
   private boolean t2 = false;
   private Rectangle s7;
   private Rectangle x8;
   private BufferedImage n3;
   private boolean y4 = true;
   private boolean e2 = false;
   private int t9;
   private int z1;
   private int[] t4;
   private int[] q0;

   public a6(ImageReaderSpi var1) {
      super(var1);
   }

   @Override
   public void setInput(Object input, boolean seekForwardOnly, boolean ignoreMetadata) {
      super.setInput(input, seekForwardOnly, ignoreMetadata);
      this.c8 = (ImageInputStream)input;
      if (this.c8 != null) {
         this.c8.setByteOrder(ByteOrder.LITTLE_ENDIAN);
      }

      this.l6();
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IOException {
      if (this.c8 == null) {
         throw new IllegalStateException("Input stream is not set");
      } else if (this.seekForwardOnly && allowSearch) {
         throw new IllegalStateException("Unable to search");
      } else {
         return 1;
      }
   }

   @Override
   public int getWidth(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.l6.l6;
   }

   @Override
   public int getHeight(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.l6.k5;
   }

   private void n5(int var1) {
      if (var1 != 0) {
         throw new IndexOutOfBoundsException("imageIndex != 0");
      }
   }

   public void n5() throws IOException {
      if (!this.t2) {
         if (this.c8 == null) {
            throw new IllegalStateException("Input source not set!");
         }

         byte var1 = 0;
         byte var2 = 0;
         this.c8.mark();
         this.n5 = new u3(this.c8);
         this.l6 = new n3(this.c8, this.n5);
         this.k5 = 3;
         ColorSpace var3 = ColorSpace.getInstance(1000);
         if (this.l6.z1 == 3L || this.l6.z1 == 4L) {
            this.c8.mark();
            this.c8.skipBytes(var1 - this.l6.n5);
            byte[] var4 = new byte[var2];
            this.c8.readFully(var4, 0, var2);
            this.c8.reset();

            try {
               if (this.l6.z1 == 3L) {
                  var3 = new ICC_ColorSpace(ICC_Profile.getInstance(new String(var4)));
               } else {
                  var3 = new ICC_ColorSpace(ICC_Profile.getInstance(var4));
               }
            } catch (Exception var10) {
               var3 = ColorSpace.getInstance(1000);
            }
         }

         if (this.l6.a6 == 0 || this.l6.u9 == 4L || this.l6.u9 == 5L) {
            this.u9 = null;
            this.u3 = null;
         } else if (this.l6.a6 == 1 || this.l6.a6 == 4 || this.l6.a6 == 8) {
            this.k5 = 1;
            if (this.l6.a6 != 8) {
               this.u3 = new MultiPixelPackedSampleModel(0, this.l6.l6, this.l6.k5, this.l6.a6);
            } else {
               int[] var13 = new int[this.k5];

               for (int var15 = 0; var15 < this.k5; var15++) {
                  var13[var15] = this.k5 - 1 - var15;
               }

               this.u3 = new PixelInterleavedSampleModel(0, this.l6.l6, this.l6.k5, this.k5, this.k5 * this.l6.l6, var13);
            }

            int var6;
            byte[] var7;
            byte[] var14;
            byte[] var16;
            if (this.l6.p8 != 0 && this.l6.p8 != 1 && this.l6.p8 != 2) {
               var6 = this.l6.a0.length / 4;
               if (var6 > 256) {
                  var6 = 256;
               }

               var14 = new byte[var6];
               var16 = new byte[var6];
               var7 = new byte[var6];

               for (int var17 = 0; var17 < var6; var17++) {
                  int var18 = 4 * var17;
                  var7[var17] = this.l6.a0[var18];
                  var16[var17] = this.l6.a0[var18 + 1];
                  var14[var17] = this.l6.a0[var18 + 2];
               }
            } else {
               var6 = this.l6.a0.length / 3;
               if (var6 > 256) {
                  var6 = 256;
               }

               var14 = new byte[var6];
               var16 = new byte[var6];
               var7 = new byte[var6];

               for (int var8 = 0; var8 < var6; var8++) {
                  int var9 = 3 * var8;
                  var7[var8] = this.l6.a0[var9];
                  var16[var8] = this.l6.a0[var9 + 1];
                  var14[var8] = this.l6.a0[var9 + 2];
               }
            }

            if (var6 > this.l6.d2) {
               var6 = this.l6.d2;
            }

            this.u9 = new IndexColorModel(this.l6.a6, var6, var14, var16, var7);
         } else if (this.l6.a6 == 16) {
            this.k5 = 3;
            this.u3 = new SinglePixelPackedSampleModel(1, this.l6.l6, this.l6.k5, new int[]{this.l6.n3, this.l6.y4, this.l6.e2});
            this.u9 = new DirectColorModel(var3, 16, this.l6.n3, this.l6.y4, this.l6.e2, 0, false, 1);
         } else if (this.l6.a6 == 32) {
            this.k5 = this.l6.t9 == 0 ? 3 : 4;
            int[] var11 = this.k5 == 3 ? new int[]{this.l6.n3, this.l6.y4, this.l6.e2} : new int[]{this.l6.n3, this.l6.y4, this.l6.e2, this.l6.t9};
            this.u3 = new SinglePixelPackedSampleModel(3, this.l6.l6, this.l6.k5, var11);
            this.u9 = new DirectColorModel(var3, 32, this.l6.n3, this.l6.y4, this.l6.e2, this.l6.t9, false, 3);
         } else {
            this.k5 = 3;
            int[] var12 = new int[this.k5];

            for (int var5 = 0; var5 < this.k5; var5++) {
               var12[var5] = this.k5 - 1 - var5;
            }

            this.u3 = new PixelInterleavedSampleModel(0, this.l6.l6, this.l6.k5, this.k5, this.k5 * this.l6.l6, var12);
            this.u9 = n5(var3, this.u3);
         }

         this.a6 = this.u3;
         this.h0 = this.u9;
         this.c8.reset();
         this.c8.skipBytes(this.n5.u3);
         this.t2 = true;
      }
   }

   @Override
   public Iterator getImageTypes(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      ArrayList var2 = new ArrayList(1);
      var2.add(new ImageTypeSpecifier(this.h0, this.a6));
      return var2.iterator();
   }

   @Override
   public ImageReadParam getDefaultReadParam() {
      return new ImageReadParam();
   }

   @Override
   public IIOMetadata getImageMetadata(int imageIndex) throws IOException {
      return null;
   }

   @Override
   public IIOMetadata getStreamMetadata() throws IOException {
      return null;
   }

   @Override
   public boolean isRandomAccessEasy(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.l6.u9 == 0L;
   }

   @Override
   public BufferedImage read(int imageIndex, ImageReadParam param) throws IOException {
      if (this.c8 == null) {
         throw new IllegalStateException("Input stream is null");
      }

      this.n5(imageIndex);
      this.clearAbortRequest();
      this.processImageStarted(imageIndex);
      if (param == null) {
         param = this.getDefaultReadParam();
      }

      this.n5();
      this.x8 = new Rectangle(0, 0, 0, 0);
      this.s7 = new Rectangle(0, 0, 0, 0);
      computeRegions(param, this.l6.l6, this.l6.k5, param.getDestination(), this.x8, this.s7);
      this.t9 = param.getSourceXSubsampling();
      this.z1 = param.getSourceYSubsampling();
      this.t4 = param.getSourceBands();
      this.q0 = param.getDestinationBands();
      this.e2 = this.t4 != null && this.q0 != null;
      this.y4 = this.s7.equals(new Rectangle(0, 0, this.l6.l6, this.l6.k5)) || this.e2;
      if (!this.e2) {
         this.t4 = new int[this.k5];
         this.q0 = new int[this.k5];

         for (int var3 = 0; var3 < this.k5; var3++) {
            this.q0[var3] = this.t4[var3] = var3;
         }
      }

      this.n3 = param.getDestination();
      WritableRaster var10 = null;
      if (this.n3 == null) {
         if (this.u3 != null && this.u9 != null) {
            this.u3 = this.u3.createCompatibleSampleModel(this.s7.x + this.s7.width, this.s7.y + this.s7.height);
            if (this.e2) {
               this.u3 = this.u3.createSubsetSampleModel(this.t4);
            }

            var10 = Raster.createWritableRaster(this.u3, new Point());
            this.n3 = new BufferedImage(this.u9, var10, false, null);
         }
      } else {
         var10 = this.n3.getWritableTile(0, 0);
         this.u3 = this.n3.getSampleModel();
         this.u9 = this.n3.getColorModel();
         this.y4 = this.y4 & this.s7.equals(var10.getBounds());
      }

      byte[] var4 = null;
      short[] var5 = null;
      int[] var6 = null;
      if (this.u3 != null) {
         if (this.u3.getDataType() == 0) {
            var4 = ((DataBufferByte)var10.getDataBuffer()).getData();
         } else if (this.u3.getDataType() == 1) {
            var5 = ((DataBufferUShort)var10.getDataBuffer()).getData();
         } else if (this.u3.getDataType() == 3) {
            var6 = ((DataBufferInt)var10.getDataBuffer()).getData();
         }
      }

      ImageInputStream var7 = (ImageInputStream)this.getInput();
      if (this.l6.a6 >= 24) {
         if (this.l6.a6 == 64) {
            var7.seek(0L);
            BufferedImage var8 = com.aspose.slides.internal.c9t.l6.n5(var7, false);
            Hashtable var9 = new Hashtable();
            var9.put("bitspPixel", 64);
            this.n3 = new BufferedImage(var8.getColorModel(), var8.getRaster(), var8.isAlphaPremultiplied(), var9);
            return this.n3;
         }

         if (this.l6.p8 == 9 && this.u9.getPixelSize() > 24) {
            var7.seek(0L);
            return com.aspose.slides.internal.c9t.l6.n5(var7, false);
         }
      }

      label80:
      switch (this.l6.p8) {
         case 0:
            this.n5(var4);
            break;
         case 1:
            this.l6(var4);
            break;
         case 2:
            this.k5(var4);
            break;
         case 3:
            this.u3(var4);
            break;
         case 4:
            this.n5(var4);
            break;
         case 5:
            switch ((int)this.l6.u9) {
               case 0:
                  this.l6(var4);
                  break label80;
               case 2:
                  this.u9(var4);
                  break label80;
               default:
                  throw new RuntimeException("Invalid compression");
            }
         case 6:
            switch ((int)this.l6.u9) {
               case 0:
                  this.k5(var4);
                  break label80;
               case 1:
                  this.a6(var4);
                  break label80;
               default:
                  throw new RuntimeException("Invalid compression");
            }
         case 7:
            this.u3(var4);
            break;
         case 8:
            this.n5(var5);
            break;
         case 9:
            throw new IllegalStateException("should be handled in BmpDecoder");
         case 10:
            this.n5(var4);
            break;
         case 11:
            switch ((int)this.l6.u9) {
               case 0:
                  this.l6(var4);
                  break;
               case 2:
                  this.u9(var4);
                  break;
               default:
                  throw new RuntimeException("Invalid compression");
            }
         case 12:
            switch ((int)this.l6.u9) {
               case 0:
                  this.k5(var4);
                  break label80;
               case 1:
                  this.a6(var4);
                  break label80;
               default:
                  throw new RuntimeException("Invalid compression");
            }
         case 13:
            this.n5(var5);
            break;
         case 14:
            this.u3(var4);
            break;
         case 15:
            this.n5(var6);
            break;
         case 16:
         case 17:
         case 18:
            this.n3 = this.n5((int)this.l6.u9, this.n3, param);
      }

      if (this.abortRequested()) {
         this.processReadAborted();
      } else {
         this.processImageComplete();
      }

      return this.n3;
   }

   @Override
   public boolean canReadRaster() {
      return true;
   }

   @Override
   public Raster readRaster(int imageIndex, ImageReadParam param) throws IOException {
      BufferedImage var3 = this.read(imageIndex, param);
      return var3.getData();
   }

   private void l6() {
      this.t2 = false;
      this.n3 = null;
      this.u3 = this.a6 = null;
      this.u9 = this.h0 = null;
   }

   @Override
   public void reset() {
      super.reset();
      this.c8 = null;
      this.l6();
   }

   private void n5(byte[] var1) throws IOException {
      int var2 = (this.l6.l6 + 7) / 8;
      int var3 = var2 % 4;
      if (var3 != 0) {
         var3 = 4 - var3;
      }

      int var4 = var2 + var3;
      if (this.y4) {
         int var5 = this.l6.y1 ? (this.l6.k5 - 1) * var2 : 0;

         for (int var6 = 0; var6 < this.l6.k5 && !this.abortRequested(); var6++) {
            this.c8.readFully(var1, var5, var2);
            this.c8.skipBytes(var3);
            var5 += this.l6.y1 ? -var2 : var2;
            this.processImageUpdate(this.n3, 0, var6, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var6 / this.s7.height);
         }
      } else {
         byte[] var17 = new byte[var4];
         int var18 = ((MultiPixelPackedSampleModel)this.u3).getScanlineStride();
         if (this.l6.y1) {
            int var7 = this.x8.y + (this.s7.height - 1) * this.z1;
            this.c8.skipBytes(var4 * (this.l6.k5 - 1 - var7));
         } else {
            this.c8.skipBytes(var4 * this.x8.y);
         }

         int var19 = var4 * (this.z1 - 1);
         int[] var8 = new int[this.s7.width];
         int[] var9 = new int[this.s7.width];
         int[] var10 = new int[this.s7.width];
         int[] var11 = new int[this.s7.width];
         int var12 = this.s7.x;
         int var13 = this.x8.x;
         int var14 = 0;

         while (var12 < this.s7.x + this.s7.width) {
            var10[var14] = var13 >> 3;
            var8[var14] = 7 - (var13 & 7);
            var11[var14] = var12 >> 3;
            var9[var14] = 7 - (var12 & 7);
            var12++;
            var14++;
            var13 += this.t9;
         }

         var12 = this.s7.y * var18;
         if (this.l6.y1) {
            var12 += (this.s7.height - 1) * var18;
         }

         var13 = 0;

         for (int var22 = this.x8.y; var13 < this.s7.height && !this.abortRequested(); var22 += this.z1) {
            this.c8.read(var17, 0, var4);

            for (int var15 = 0; var15 < this.s7.width; var15++) {
               int var16 = var17[var10[var15]] >> var8[var15] & 1;
               var1[var12 + var11[var15]] = (byte)(var1[var12 + var11[var15]] | var16 << var9[var15]);
            }

            var12 += this.l6.y1 ? -var18 : var18;
            this.c8.skipBytes(var19);
            this.processImageUpdate(this.n3, 0, var13, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var13 / this.s7.height);
            var13++;
         }
      }
   }

   private void l6(byte[] var1) throws IOException {
      int var2 = (this.l6.l6 + 1) / 2;
      int var3 = var2 % 4;
      if (var3 != 0) {
         var3 = 4 - var3;
      }

      int var4 = var2 + var3;
      if (this.y4) {
         int var5 = this.l6.y1 ? (this.l6.k5 - 1) * var2 : 0;

         for (int var6 = 0; var6 < this.l6.k5 && !this.abortRequested(); var6++) {
            this.c8.readFully(var1, var5, var2);
            this.c8.skipBytes(var3);
            var5 += this.l6.y1 ? -var2 : var2;
            this.processImageUpdate(this.n3, 0, var6, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var6 / this.s7.height);
         }
      } else {
         byte[] var17 = new byte[var4];
         int var18 = ((MultiPixelPackedSampleModel)this.u3).getScanlineStride();
         if (this.l6.y1) {
            int var7 = this.x8.y + (this.s7.height - 1) * this.z1;
            this.c8.skipBytes(var4 * (this.l6.k5 - 1 - var7));
         } else {
            this.c8.skipBytes(var4 * this.x8.y);
         }

         int var19 = var4 * (this.z1 - 1);
         int[] var8 = new int[this.s7.width];
         int[] var9 = new int[this.s7.width];
         int[] var10 = new int[this.s7.width];
         int[] var11 = new int[this.s7.width];
         int var12 = this.s7.x;
         int var13 = this.x8.x;
         int var14 = 0;

         while (var12 < this.s7.x + this.s7.width) {
            var10[var14] = var13 >> 1;
            var8[var14] = 1 - (var13 & 1) << 2;
            var11[var14] = var12 >> 1;
            var9[var14] = 1 - (var12 & 1) << 2;
            var12++;
            var14++;
            var13 += this.t9;
         }

         var12 = this.s7.y * var18;
         if (this.l6.y1) {
            var12 += (this.s7.height - 1) * var18;
         }

         var13 = 0;

         for (int var22 = this.x8.y; var13 < this.s7.height && !this.abortRequested(); var22 += this.z1) {
            this.c8.read(var17, 0, var4);

            for (int var15 = 0; var15 < this.s7.width; var15++) {
               int var16 = var17[var10[var15]] >> var8[var15] & 15;
               var1[var12 + var11[var15]] = (byte)(var1[var12 + var11[var15]] | var16 << var9[var15]);
            }

            var12 += this.l6.y1 ? -var18 : var18;
            this.c8.skipBytes(var19);
            this.processImageUpdate(this.n3, 0, var13, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var13 / this.s7.height);
            var13++;
         }
      }
   }

   private void k5(byte[] var1) throws IOException {
      int var2 = this.l6.l6 % 4;
      if (var2 != 0) {
         var2 = 4 - var2;
      }

      int var3 = this.l6.l6 + var2;
      if (this.y4) {
         int var4 = this.l6.y1 ? (this.l6.k5 - 1) * this.l6.l6 : 0;

         for (int var5 = 0; var5 < this.l6.k5 && !this.abortRequested(); var5++) {
            this.c8.readFully(var1, var4, this.l6.l6);
            this.c8.skipBytes(var2);
            var4 += this.l6.y1 ? -this.l6.l6 : this.l6.l6;
            this.processImageUpdate(this.n3, 0, var5, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var5 / this.s7.height);
         }
      } else {
         byte[] var12 = new byte[var3];
         int var13 = ((ComponentSampleModel)this.u3).getScanlineStride();
         if (this.l6.y1) {
            int var6 = this.x8.y + (this.s7.height - 1) * this.z1;
            this.c8.skipBytes(var3 * (this.l6.k5 - 1 - var6));
         } else {
            this.c8.skipBytes(var3 * this.x8.y);
         }

         int var14 = var3 * (this.z1 - 1);
         int var7 = this.s7.y * var13;
         if (this.l6.y1) {
            var7 += (this.s7.height - 1) * var13;
         }

         var7 += this.s7.x;
         int var8 = 0;

         for (int var9 = this.x8.y; var8 < this.s7.height && !this.abortRequested(); var9 += this.z1) {
            this.c8.read(var12, 0, var3);
            int var10 = 0;

            for (int var11 = this.x8.x; var10 < this.s7.width; var11 += this.t9) {
               var1[var7 + var10] = var12[var11];
               var10++;
            }

            var7 += this.l6.y1 ? -var13 : var13;
            this.c8.skipBytes(var14);
            this.processImageUpdate(this.n3, 0, var8, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var8 / this.s7.height);
            var8++;
         }
      }
   }

   private void u3(byte[] var1) throws IOException {
      int var2 = this.l6.l6 * 3 % 4;
      if (var2 != 0) {
         var2 = 4 - var2;
      }

      int var3 = this.l6.l6 * 3;
      int var4 = var3 + var2;
      if (this.y4) {
         int var5 = this.l6.y1 ? (this.l6.k5 - 1) * this.l6.l6 * 3 : 0;

         for (int var6 = 0; var6 < this.l6.k5 && !this.abortRequested(); var6++) {
            this.c8.readFully(var1, var5, var3);
            this.c8.skipBytes(var2);
            var5 += this.l6.y1 ? -var3 : var3;
            this.processImageUpdate(this.n3, 0, var6, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var6 / this.s7.height);
         }
      } else {
         byte[] var15 = new byte[var4];
         var3 = ((ComponentSampleModel)this.u3).getScanlineStride();
         if (this.l6.y1) {
            int var16 = this.x8.y + (this.s7.height - 1) * this.z1;
            this.c8.skipBytes(var4 * (this.l6.k5 - 1 - var16));
         } else {
            this.c8.skipBytes(var4 * this.x8.y);
         }

         int var17 = var4 * (this.z1 - 1);
         int var7 = this.s7.y * var3;
         if (this.l6.y1) {
            var7 += (this.s7.height - 1) * var3;
         }

         var7 += this.s7.x * 3;
         int var8 = 0;

         for (int var9 = this.x8.y; var8 < this.s7.height && !this.abortRequested(); var9 += this.z1) {
            this.c8.read(var15, 0, var4);
            int var10 = 0;

            for (int var11 = 3 * this.x8.x; var10 < this.s7.width; var11 += 3 * this.t9) {
               int var12 = 3 * var10 + var7;

               for (int var13 = 0; var13 < this.q0.length; var13++) {
                  var1[var12 + this.q0[var13]] = var15[var11 + this.t4[var13]];
               }

               var10++;
            }

            var7 += this.l6.y1 ? -var3 : var3;
            this.c8.skipBytes(var17);
            this.processImageUpdate(this.n3, 0, var8, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var8 / this.s7.height);
            var8++;
         }
      }
   }

   private void n5(short[] var1) throws IOException {
      int var2 = this.l6.l6 * 2 % 4;
      if (var2 != 0) {
         var2 = 4 - var2;
      }

      int var3 = this.l6.l6 + var2 / 2;
      if (this.y4) {
         int var4 = this.l6.y1 ? (this.l6.k5 - 1) * this.l6.l6 : 0;

         for (int var5 = 0; var5 < this.l6.k5 && !this.abortRequested(); var5++) {
            this.c8.readFully(var1, var4, this.l6.l6);
            this.c8.skipBytes(var2);
            var4 += this.l6.y1 ? -this.l6.l6 : this.l6.l6;
            this.processImageUpdate(this.n3, 0, var5, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var5 / this.s7.height);
         }
      } else {
         short[] var12 = new short[var3];
         int var13 = ((SinglePixelPackedSampleModel)this.u3).getScanlineStride();
         if (this.l6.y1) {
            int var6 = this.x8.y + (this.s7.height - 1) * this.z1;
            this.c8.skipBytes(var3 * (this.l6.k5 - 1 - var6) << 1);
         } else {
            this.c8.skipBytes(var3 * this.x8.y << 1);
         }

         int var14 = var3 * (this.z1 - 1) << 1;
         int var7 = this.s7.y * var13;
         if (this.l6.y1) {
            var7 += (this.s7.height - 1) * var13;
         }

         var7 += this.s7.x;
         int var8 = 0;

         for (int var9 = this.x8.y; var8 < this.s7.height && !this.abortRequested(); var9 += this.z1) {
            this.c8.readFully(var12, 0, var3);
            int var10 = 0;

            for (int var11 = this.x8.x; var10 < this.s7.width; var11 += this.t9) {
               var1[var7 + var10] = var12[var11];
               var10++;
            }

            var7 += this.l6.y1 ? -var13 : var13;
            this.c8.skipBytes(var14);
            this.processImageUpdate(this.n3, 0, var8, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var8 / this.s7.height);
            var8++;
         }
      }
   }

   private void n5(int[] var1) throws IOException {
      if (this.y4) {
         int var2 = this.l6.y1 ? (this.l6.k5 - 1) * this.l6.l6 : 0;

         for (int var3 = 0; var3 < this.l6.k5 && !this.abortRequested(); var3++) {
            this.c8.readFully(var1, var2, this.l6.l6);
            var2 += this.l6.y1 ? -this.l6.l6 : this.l6.l6;
            this.processImageUpdate(this.n3, 0, var3, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var3 / this.s7.height);
         }
      } else {
         int[] var10 = new int[this.l6.l6];
         int var11 = ((SinglePixelPackedSampleModel)this.u3).getScanlineStride();
         if (this.l6.y1) {
            int var4 = this.x8.y + (this.s7.height - 1) * this.z1;
            this.c8.skipBytes(this.l6.l6 * (this.l6.k5 - 1 - var4) << 2);
         } else {
            this.c8.skipBytes(this.l6.l6 * this.x8.y << 2);
         }

         int var12 = this.l6.l6 * (this.z1 - 1) << 2;
         int var5 = this.s7.y * var11;
         if (this.l6.y1) {
            var5 += (this.s7.height - 1) * var11;
         }

         var5 += this.s7.x;
         int var6 = 0;

         for (int var7 = this.x8.y; var6 < this.s7.height && !this.abortRequested(); var7 += this.z1) {
            this.c8.readFully(var10, 0, this.l6.l6);
            int var8 = 0;

            for (int var9 = this.x8.x; var8 < this.s7.width; var9 += this.t9) {
               var1[var5 + var8] = var10[var9];
               var8++;
            }

            var5 += this.l6.y1 ? -var11 : var11;
            this.c8.skipBytes(var12);
            this.processImageUpdate(this.n3, 0, var6, this.s7.width, 1, 1, 1, new int[]{0});
            this.processImageProgress(100.0F * var6 / this.s7.height);
            var6++;
         }
      }
   }

   private void a6(byte[] var1) throws IOException {
      int var2 = (int)this.l6.h0;
      if (var2 == 0) {
         var2 = (int)(this.n5.k5 - this.n5.u3);
      }

      int var3 = 0;
      int var4 = this.l6.l6 % 4;
      if (var4 != 0) {
         var3 = 4 - var4;
      }

      byte[] var5 = new byte[var2];
      boolean var6 = false;
      this.c8.readFully(var5, 0, var2);
      this.n5(var2, var3, var5, var1);
   }

   private void n5(int var1, int var2, byte[] var3, byte[] var4) throws IOException {
      byte[] var5 = new byte[this.l6.l6 * this.l6.k5];
      int var6 = 0;
      int var7 = 0;
      boolean var8 = false;
      int var9 = this.l6.y1 ? this.l6.k5 - 1 : 0;
      int var10 = ((ComponentSampleModel)this.u3).getScanlineStride();
      int var11 = 0;

      while (var6 != var1) {
         int var12 = var3[var6++] & 255;
         if (var12 == 0) {
            switch (var3[var6++] & 0xFF) {
               case 0:
                  if (var9 >= this.x8.y && var9 < this.x8.y + this.x8.height) {
                     if (this.y4) {
                        int var19 = var9 * this.l6.l6;

                        for (int var23 = 0; var23 < this.l6.l6; var23++) {
                           var4[var19++] = var5[var23];
                        }

                        this.processImageUpdate(this.n3, 0, var9, this.s7.width, 1, 1, 1, new int[]{0});
                        var11++;
                     } else if ((var9 - this.x8.y) % this.z1 == 0) {
                        int var18 = (var9 - this.x8.y) / this.z1 + this.s7.y;
                        int var21 = var18 * var10;
                        var21 += this.s7.x;

                        for (int var24 = this.x8.x; var24 < this.x8.x + this.x8.width; var24 += this.t9) {
                           var4[var21++] = var5[var24];
                        }

                        this.processImageUpdate(this.n3, 0, var18, this.s7.width, 1, 1, 1, new int[]{0});
                        var11++;
                     }
                  }

                  this.processImageProgress(100.0F * var11 / this.s7.height);
                  var9 += this.l6.y1 ? -1 : 1;
                  var7 = 0;
                  if (this.abortRequested()) {
                     var8 = true;
                  }
                  break;
               case 1:
                  var8 = true;
                  break;
               case 2:
                  int var13 = var3[var6++] & 255;
                  int var14 = var3[var6] & 255;
                  var7 += var13 + var14 * this.l6.l6;
                  break;
               default:
                  int var15 = var3[var6 - 1] & 255;

                  for (int var16 = 0; var16 < var15; var16++) {
                     var5[var7++] = (byte)(var3[var6++] & 0xFF);
                  }

                  if ((var15 & 1) == 1) {
                     var6++;
                  }
            }
         } else {
            for (int var20 = 0; var20 < var12; var20++) {
               var5[var7++] = (byte)(var3[var6] & 0xFF);
            }

            var6++;
         }

         if (var8) {
            break;
         }
      }
   }

   private void u9(byte[] var1) throws IOException {
      int var2 = (int)this.l6.h0;
      if (var2 == 0) {
         var2 = (int)(this.n5.k5 - this.n5.u3);
      }

      int var3 = 0;
      int var4 = this.l6.l6 % 4;
      if (var4 != 0) {
         var3 = 4 - var4;
      }

      byte[] var5 = new byte[var2];
      this.c8.readFully(var5, 0, var2);
      this.l6(var2, var3, var5, var1);
   }

   private void l6(int var1, int var2, byte[] var3, byte[] var4) throws IOException {
      byte[] var5 = new byte[this.l6.l6];
      int var6 = 0;
      int var7 = 0;
      boolean var8 = false;
      int var9 = this.l6.y1 ? this.l6.k5 - 1 : 0;
      int var10 = ((MultiPixelPackedSampleModel)this.u3).getScanlineStride();
      int var11 = 0;

      while (var6 != var1) {
         int var12 = var3[var6++] & 255;
         if (var12 == 0) {
            switch (var3[var6++] & 0xFF) {
               case 0:
                  if (var9 >= this.x8.y && var9 < this.x8.y + this.x8.height) {
                     if (this.y4) {
                        int var19 = var9 * (this.l6.l6 + 1 >> 1);
                        int var23 = 0;
                        int var27 = 0;

                        while (var23 < this.l6.l6 >> 1) {
                           var4[var19++] = (byte)(var5[var27++] << 4 | var5[var27++]);
                           var23++;
                        }

                        if ((this.l6.l6 & 1) == 1) {
                           var4[var19] = (byte)(var4[var19] | var5[this.l6.l6 - 1] << 4);
                        }

                        this.processImageUpdate(this.n3, 0, var9, this.s7.width, 1, 1, 1, new int[]{0});
                        var11++;
                     } else if ((var9 - this.x8.y) % this.z1 == 0) {
                        int var18 = (var9 - this.x8.y) / this.z1 + this.s7.y;
                        int var21 = var18 * var10;
                        var21 += this.s7.x >> 1;
                        int var25 = 1 - (this.s7.x & 1) << 2;

                        for (int var29 = this.x8.x; var29 < this.x8.x + this.x8.width; var29 += this.t9) {
                           var4[var21] = (byte)(var4[var21] | var5[var29] << var25);
                           var25 += 4;
                           if (var25 == 4) {
                              var21++;
                           }

                           var25 &= 7;
                        }

                        this.processImageUpdate(this.n3, 0, var18, this.s7.width, 1, 1, 1, new int[]{0});
                        var11++;
                     }
                  }

                  this.processImageProgress(100.0F * var11 / this.s7.height);
                  var9 += this.l6.y1 ? -1 : 1;
                  var7 = 0;
                  if (this.abortRequested()) {
                     var8 = true;
                  }
                  break;
               case 1:
                  var8 = true;
                  break;
               case 2:
                  int var13 = var3[var6++] & 255;
                  int var14 = var3[var6] & 255;
                  var7 += var13 + var14 * this.l6.l6;
                  break;
               default:
                  int var15 = var3[var6 - 1] & 255;

                  for (int var16 = 0; var16 < var15; var16++) {
                     var5[var7++] = (byte)((var16 & 1) == 0 ? (var3[var6] & 240) >> 4 : var3[var6++] & 15);
                  }

                  if ((var15 & 1) == 1) {
                     var6++;
                  }

                  if (((int)Math.ceil(var15 / 2) & 1) == 1) {
                     var6++;
                  }
            }
         } else {
            int[] var20 = new int[]{(var3[var6] & 240) >> 4, var3[var6] & 15};

            for (int var24 = 0; var24 < var12 && var7 < this.l6.l6; var24++) {
               var5[var7++] = (byte)var20[var24 & 1];
            }

            var6++;
         }

         if (var8) {
            break;
         }
      }
   }

   private BufferedImage n5(int var1, BufferedImage var2, ImageReadParam var3) throws IOException {
      String var4;
      switch (var1) {
         case 4:
            var4 = "JPEG";
            break;
         case 5:
            var4 = "PNG";
            break;
         default:
            throw new IOException("Unexpected compression type: " + var1);
      }

      ImageReader var5 = ImageIO.getImageReadersByFormatName(var4).next();
      if (var5 == null) {
         throw new RuntimeException("Reader is null " + var4);
      }

      byte[] var6 = new byte[(int)this.l6.h0];
      this.c8.read(var6);
      var5.setInput(ImageIO.createImageInputStream(new ByteArrayInputStream(var6)));
      if (var2 == null) {
         ImageTypeSpecifier var7 = var5.getImageTypes(0).next();
         var2 = var7.createBufferedImage(this.s7.x + this.s7.width, this.s7.y + this.s7.height);
      }

      var5.addIIOReadProgressListener(new u9(this));
      var5.addIIOReadUpdateListener(new h0(this));
      var5.addIIOReadWarningListener(new c8(this));
      ImageReadParam var8 = var5.getDefaultReadParam();
      var8.setDestination(var2);
      var8.setDestinationBands(var3.getDestinationBands());
      var8.setDestinationOffset(var3.getDestinationOffset());
      var8.setSourceBands(var3.getSourceBands());
      var8.setSourceRegion(var3.getSourceRegion());
      var8.setSourceSubsampling(var3.getSourceXSubsampling(), var3.getSourceYSubsampling(), var3.getSubsamplingXOffset(), var3.getSubsamplingYOffset());
      var5.read(0, var8);
      return var2;
   }

   public static ColorModel n5(ColorSpace var0, SampleModel var1) {
      ColorModel var2 = null;
      if (var1 == null) {
         throw new IllegalArgumentException("sampleModel is null");
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
   static void n5(a6 var0, float var1) {
      var0.processImageProgress(var1);
   }

   // $VF: synthetic method
   static void n5(a6 var0, BufferedImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      var0.processImageUpdate(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: synthetic method
   static void n5(a6 var0, BufferedImage var1) {
      var0.processPassComplete(var1);
   }

   // $VF: synthetic method
   static void n5(a6 var0, BufferedImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9) {
      var0.processPassStarted(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   // $VF: synthetic method
   static void n5(a6 var0, String var1) {
      var0.processWarningOccurred(var1);
   }
}
