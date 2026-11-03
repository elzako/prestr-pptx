package com.aspose.slides.internal.q4d;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.m3;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.u2w.h0;
import com.aspose.slides.internal.u2w.u9;
import com.aspose.slides.internal.z0k.t4;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public class k5 extends ImageReader {
   private t4 n5 = null;
   private boolean l6 = false;
   private h0 k5 = null;
   private int u3 = 0;
   private boolean a6 = false;
   private v3 u9;
   private final Map<Integer, List<ImageTypeSpecifier>> h0 = new HashMap<>();

   public k5(ImageReaderSpi var1) {
      super(var1);
   }

   @Override
   public void setInput(Object input) {
      if (input instanceof t4) {
         this.n5 = (t4)input;
      } else if (input instanceof ImageInputStream) {
         try {
            this.n5 = com.aspose.slides.internal.t5g.u3.u3((ImageInputStream)input);
         } catch (IOException var3) {
            this.n5 = null;
         }
      }

      if (this.n5 == null) {
         throw new IllegalArgumentException("Incorrect input type!");
      }
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IOException {
      this.n5();
      return this.k5.b3().length;
   }

   private void n5() throws IOException {
      if (!this.l6) {
         if (this.n5 == null) {
            throw new IllegalArgumentException("input object was not set");
         }

         this.u9 = new v3(this.n5);
         m3 var1 = new com.aspose.slides.internal.l1f.u3().n5(this.u9, null);
         var1.n5(this.u9);
         this.k5 = (h0)var1;
         this.u3 = this.k5.b3().length;
         this.l6 = true;
      }
   }

   @Override
   public void dispose() {
      if (this.u9 != null) {
         com.aspose.slides.internal.n6h.a6.n5(this.u9);
      }

      if (this.n5 != null) {
         this.n5.dispose();
         this.n5 = null;
      }
   }

   @Override
   public int getWidth(int imageIndex) throws IOException {
      this.n5();
      this.n5(imageIndex, false);
      return this.k5.b3()[imageIndex].z1();
   }

   private void n5(int var1, boolean var2) {
      if (var1 < 0 || var1 > this.u3 - 1 && !var2) {
         throw new IndexOutOfBoundsException("imageIndex < 0");
      }
   }

   @Override
   public int getHeight(int imageIndex) throws IOException {
      this.n5();
      this.n5(imageIndex, false);
      return this.k5.b3()[imageIndex].y4();
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IOException {
      this.n5();
      this.n5(imageIndex, false);
      Integer var2 = imageIndex;
      List var3;
      if (this.h0.containsKey(var2)) {
         var3 = this.h0.get(var2);
      } else {
         var3 = new ArrayList(1);
         u9 var4 = this.k5.b3()[imageIndex];
         com.aspose.slides.internal.f2i.n5 var5 = var4.e5();
         u3 var6 = new u3(var5);
         ImageTypeSpecifier var7 = var6.n5();
         var3.add(var7);
         this.h0.put(var2, var3);
      }

      return var3.iterator();
   }

   @Override
   public IIOMetadata getStreamMetadata() throws IOException {
      return null;
   }

   @Override
   public IIOMetadata getImageMetadata(int imageIndex) throws IOException {
      this.n5();
      this.n5(imageIndex, false);
      return new l6(this.k5, imageIndex);
   }

   @Override
   public BufferedImage read(int imageIndex, ImageReadParam param) throws IOException {
      this.n5();
      this.n5(imageIndex, true);
      if (imageIndex >= this.u3) {
         return null;
      }

      u9 var3 = this.k5.b3()[imageIndex];
      int var4 = this.getWidth(imageIndex);
      int var5 = this.getHeight(imageIndex);
      BufferedImage var6 = getDestination(param, this.getImageTypes(imageIndex), var4, var5);
      if (!this.a6) {
         if (this.n5(var3)) {
            this.n5(var3, var4, var5, var6);
         } else if (var6.getColorModel() instanceof com.aspose.slides.internal.v4y.k5) {
            this.l6(var3, var4, var5, var6);
         } else {
            int[] var7 = var3.k5(new y2(0, 0, var4, var5));
            com.aspose.slides.internal.t2h.n5.n5(var7, var6);
         }
      }

      return this.n5(var6, var3);
   }

   private void n5(u9 var1, int var2, int var3, BufferedImage var4) {
      try {
         ((com.aspose.slides.internal.u2w.u3)var1.f2().l6()).n5().a6(-1);
         int[] var5 = var1.k5(new y2(0, 0, var2, var3));
         DataBufferByte var6 = (DataBufferByte)var4.getRaster().getDataBuffer();
         byte[] var7 = var6.getData();
         int var8 = 0;
         int var9 = 0;

         for (int var10 = 0; var10 < var3; var10++) {
            for (int var11 = 0; var11 < var2; var11++) {
               int var12 = var5[var8++];
               var7[var9++] = (byte)(var12 >> 24 & 0xFF);
               var7[var9++] = (byte)(var12 >> 16 & 0xFF);
               var7[var9++] = (byte)(var12 >> 8 & 0xFF);
               var7[var9++] = (byte)(var12 >> 0 & 0xFF);
            }
         }
      } finally {
         ((com.aspose.slides.internal.u2w.u3)var1.f2().l6()).n5().a6(5);
      }
   }

   private void l6(u9 var1, int var2, int var3, BufferedImage var4) {
      long[] var5 = var1.u3(new y2(0, 0, var2, var3));
      DataBuffer var6 = var4.getRaster().getDataBuffer();
      if (var6.getDataType() == 1) {
         this.n5(var5, ((DataBufferUShort)var6).getData());
      } else if (var6.getDataType() == 2) {
         this.n5(var5, ((DataBufferShort)var6).getData());
      } else {
         if (var6.getDataType() != 0) {
            throw new IllegalArgumentException("Unsupported image datatype: " + var6.getDataType());
         }

         this.n5(var5, ((DataBufferByte)var6).getData());
      }
   }

   private void n5(long[] var1, short[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         long var4 = var1[var3];
         short var6 = (short)(var4 >> 32 & 65535L);
         short var7 = (short)(var4 >> 16 & 65535L);
         short var8 = (short)(var4 >> 0 & 65535L);
         var2[var3 * 3] = var6;
         var2[var3 * 3 + 1] = var7;
         var2[var3 * 3 + 2] = var8;
      }
   }

   private void n5(long[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         long var4 = var1[var3];
         byte var6 = (byte)(var4 >> 40 & 255L);
         byte var7 = (byte)(var4 >> 32 & 255L);
         byte var8 = (byte)(var4 >> 24 & 255L);
         byte var9 = (byte)(var4 >> 16 & 255L);
         byte var10 = (byte)(var4 >> 8 & 255L);
         byte var11 = (byte)(var4 >> 0 & 255L);
         var2[var3 * 6] = var6;
         var2[var3 * 6 + 1] = var7;
         var2[var3 * 6 + 2] = var8;
         var2[var3 * 6 + 3] = var9;
         var2[var3 * 6 + 4] = var10;
         var2[var3 * 6 + 5] = var11;
      }
   }

   private boolean n5(u9 var1) {
      return com.aspose.slides.internal.t5g.u3.a6() && var1.e5().y2() == 5;
   }

   private BufferedImage n5(BufferedImage var1, u9 var2) {
      float var3 = this.n5(var2.e5());
      float var4 = this.l6(var2.e5());
      if (var3 == 0.0F && var4 != 0.0F) {
         var3 = var4;
      }

      if (var4 == 0.0F && var3 != 0.0F) {
         var4 = var3;
      }

      Hashtable var5 = new Hashtable();
      if (var3 * var4 != 0.0F) {
         var5.put("dpiX", var3);
         var5.put("dpiY", var4);
      }

      if (this.n5(var2)) {
         var5.put("pixelFormat", 8207);
      }

      if (var1.getPropertyNames() != null) {
         for (String var9 : var1.getPropertyNames()) {
            var5.put(var9, var1.getProperty(var9));
         }
      }

      return var5.isEmpty() ? var1 : new BufferedImage(var1.getColorModel(), var1.getRaster(), var1.isAlphaPremultiplied(), var5);
   }

   private float n5(com.aspose.slides.internal.f2i.n5 var1) {
      return var1.i1() != null && var1.i1().n5() != 0L ? var1.i1().k5() : 0.0F;
   }

   private float l6(com.aspose.slides.internal.f2i.n5 var1) {
      return var1.e5() != null && var1.e5().n5() != 0L ? var1.e5().k5() : 0.0F;
   }
}
