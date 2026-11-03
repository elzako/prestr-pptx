package com.aspose.slides.internal.q4d;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r5w.h0;
import com.aspose.slides.internal.u2w.c8;
import com.aspose.slides.internal.u2w.s7;
import com.aspose.slides.internal.u2w.u9;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.o0;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.awt.image.IndexColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.IIOImage;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;

public class a6 extends ImageWriter {
   private static final int[] n5 = new int[]{1, 4, 8, 24, 32};
   private static final int[] l6 = new int[]{196865, 197634, 198659, 137224, 2498570};
   private boolean k5 = false;
   private int u3 = 0;
   private com.aspose.slides.internal.v6s.a6 a6 = null;
   private t4 u9;
   private v3 h0;

   @Override
   public void setOutput(Object output) {
      if (output instanceof t4) {
         this.u9 = (t4)output;
         this.h0 = new v3(this.u9);
      } else if (this.u9 != null) {
         throw new IllegalArgumentException("Illegal output type!");
      }
   }

   @Override
   public void dispose() {
      if (this.h0 != null) {
         com.aspose.slides.internal.n6h.a6.n5(this.h0);
         this.h0 = null;
      }

      this.a6 = null;
   }

   public a6(ImageWriterSpi var1) {
      super(var1);
   }

   @Override
   public IIOMetadata getDefaultStreamMetadata(ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata getDefaultImageMetadata(ImageTypeSpecifier imageType, ImageWriteParam param) {
      return com.aspose.slides.internal.q4d.l6.n5();
   }

   @Override
   public IIOMetadata convertStreamMetadata(IIOMetadata inData, ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata convertImageMetadata(IIOMetadata inData, ImageTypeSpecifier imageType, ImageWriteParam param) {
      return null;
   }

   @Override
   public boolean canWriteSequence() {
      return true;
   }

   @Override
   public void prepareWriteSequence(IIOMetadata streamMetadata) throws IOException {
      if (this.u9 == null) {
         throw new InvalidOperationException("stream is null");
      }

      this.k5 = true;
      this.u3 = 0;
      this.a6 = null;
   }

   @Override
   public void writeToSequence(IIOImage image, ImageWriteParam param) throws IOException {
      if (!this.k5) {
         throw new InvalidOperationException("need to call prepareWriteSequence method");
      }

      if (this.u9 == null) {
         throw new InvalidOperationException("output == null!");
      }

      if (image == null) {
         throw new IllegalArgumentException("image == null!");
      }

      int[] var3 = new int[]{this.u3};
      u9 var4 = null;

      try {
         var4 = this.n5(image, var3);
         this.u3 = var3[0];
         if (this.a6 == null) {
            this.a6 = this.n5(this.u3);
         }

         this.n5(this.a6, var4, true);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   @Override
   public void endWriteSequence() throws IOException {
      this.k5 = false;
      this.u3 = 0;
      this.a6 = null;
   }

   @Override
   public void write(IIOMetadata streamMetadata, IIOImage image, ImageWriteParam param) throws IOException {
      if (this.u9 == null) {
         throw new InvalidOperationException("output == null!");
      }

      if (image == null) {
         throw new IllegalArgumentException("image == null!");
      }

      this.u3 = 19789;
      int[] var4 = new int[]{this.u3};
      u9 var5 = null;

      try {
         var5 = this.n5(image, var4);
         this.u3 = var4[0];
         this.a6 = this.n5(this.u3);
         this.n5(this.a6, var5, false);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private com.aspose.slides.internal.v6s.a6 n5(int var1) {
      com.aspose.slides.internal.v6s.a6 var2 = com.aspose.slides.internal.v6s.k5.n5(this.h0, var1);
      var2.k5().n5(0L, 0);
      s7.n5(var2);
      return var2;
   }

   private void n5(com.aspose.slides.internal.v6s.a6 var1, u9 var2, boolean var3) {
      boolean var4 = !var3;
      com.aspose.slides.internal.c4z.l6.l6(var2, var1, var4, var2.e5(), var2.b3(), var2.w1(), var2.x8());
   }

   private u9 n5(IIOImage var1, int[] var2) {
      RenderedImage var3 = var1.getRenderedImage();
      Map var4 = this.n5(var3);
      var3 = this.n5(var3, var4);
      IIOMetadata var5 = var1.getMetadata();
      return var5 != null && var5 instanceof l6 ? this.n5(var3, var4, (l6)var5, var2) : this.n5(var3, var4, var2);
   }

   private u9 n5(RenderedImage var1, Map<String, Object> var2, l6 var3, int[] var4) {
      int var5 = var1.getWidth();
      int var6 = var1.getHeight();
      u9 var7 = var3.k5();
      com.aspose.slides.internal.f2i.n5 var8 = this.n5(var1, var2, new com.aspose.slides.internal.f2i.n5(var7.e5()), true);
      u9 var10;
      if (var8.y2() == 5 && var1.getColorModel().getColorSpace() instanceof com.aspose.slides.internal.p0s.n5) {
         byte[] var12 = this.n5((BufferedImage)var1);
         var10 = new com.aspose.slides.internal.c4z.l6(var8, var5, var6);
         ((com.aspose.slides.internal.c4z.l6)var10).n5(var12);
         this.n5(var8);
      } else if (var8.t1() == 48 && var1.getColorModel() instanceof com.aspose.slides.internal.v4y.k5) {
         byte[] var11 = this.l6((BufferedImage)var1);
         var10 = new com.aspose.slides.internal.c4z.l6(var8, var5, var6);
         ((com.aspose.slides.internal.c4z.l6)var10).n5(var11);
         this.n5(var8);
      } else {
         var10 = new u9(var8, var5, var6);
         int[] var9 = com.aspose.slides.internal.t2h.n5.n5((BufferedImage)var1);
         var10.l6(new y2(0, 0, var5, var6), var9);
      }

      var10.n5(var7.b3());
      if (var4[0] == 0) {
         var4[0] = var3.l6().k7();
      }

      return var10;
   }

   private u9 n5(RenderedImage var1, Map<String, Object> var2, int[] var3) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      com.aspose.slides.internal.f2i.n5 var6 = new com.aspose.slides.internal.f2i.n5(3);
      var6.n5((long)var5);
      var6.c8(2);
      Object var7 = var2.get("dpiX");
      if (var7 != null && var7 != BufferedImage.UndefinedProperty) {
         var6.n5(new c8(Float.valueOf((Float)var7 * 100.0F).longValue(), 100L));
      }

      Object var8 = var2.get("dpiY");
      if (var8 != null && var8 != BufferedImage.UndefinedProperty) {
         var6.l6(new c8(Float.valueOf((Float)var8 * 100.0F).longValue(), 100L));
      }

      var6.h0(2);
      com.aspose.slides.internal.f2i.n5 var9 = this.n5(var1, var2, var6, false);
      var3[0] = var9.q0();
      u9 var10 = new u9(var9, var4, var5);
      int[] var11 = com.aspose.slides.internal.t2h.n5.n5((BufferedImage)var1);
      var10.l6(new y2(0, 0, var4, var5), var11);
      return var10;
   }

   private Map<String, Object> n5(RenderedImage var1) {
      HashMap var2 = new HashMap();
      String[] var3 = var1.getPropertyNames();
      if (var3 != null) {
         for (String var7 : var3) {
            var2.put(var7, var1.getProperty(var7));
         }
      }

      return var2;
   }

   private byte[] n5(BufferedImage var1) {
      DataBuffer var2 = var1.getRaster().getDataBuffer();
      if (var2.getDataType() == 0) {
         byte[] var3 = ((DataBufferByte)var1.getRaster().getDataBuffer()).getData();
         byte[] var4 = new byte[var3.length];
         System.arraycopy(var3, 0, var4, 0, var3.length);
         return var4;
      } else {
         throw new IllegalArgumentException("Not supported data type: " + var2.getDataType());
      }
   }

   private byte[] l6(BufferedImage var1) {
      DataBuffer var2 = var1.getRaster().getDataBuffer();
      if (var2.getDataType() == 1) {
         return this.n5(((DataBufferUShort)var1.getRaster().getDataBuffer()).getData());
      } else if (var2.getDataType() == 2) {
         return this.n5(((DataBufferShort)var1.getRaster().getDataBuffer()).getData());
      } else if (var2.getDataType() == 0) {
         return this.n5(((DataBufferByte)var1.getRaster().getDataBuffer()).getData());
      } else {
         throw new IllegalArgumentException("Not supported data type: " + var2.getDataType());
      }
   }

   private byte[] n5(short[] var1) {
      byte[] var2 = new byte[var1.length * 2];

      for (int var3 = 0; var3 < var1.length; var3++) {
         short var4 = var1[var3];
         byte var5 = (byte)(var4 >> 8 & 0xFF);
         byte var6 = (byte)(var4 >> 0 & 0xFF);
         int var7 = var3 * 2;
         var2[var7] = var6;
         var2[var7 + 1] = var5;
      }

      return var2;
   }

   private byte[] n5(byte[] var1) {
      byte[] var2 = new byte[var1.length];

      for (int var3 = 0; var3 < var1.length; var3 += 2) {
         var2[var3] = var1[var3 + 1];
         var2[var3 + 1] = var1[var3];
      }

      return var2;
   }

   private com.aspose.slides.internal.f2i.n5 n5(RenderedImage var1, Map<String, Object> var2, com.aspose.slides.internal.f2i.n5 var3, boolean var4) {
      this.n5(var2, var3);
      if (this.l6(var3.m3())) {
         var3.l6(new int[]{1});
         var3.a6(0);
         return var3;
      } else {
         a6$n5 var5 = this.n5(var1, var2, var4);
         this.l6(var3);
         this.n5(var1, var3);
         this.n5(var1, var3, var5);
         this.n5(var3, var5);
         this.l6(var1, var3, var5);
         this.l6(var3, var5);
         this.k5(var1, var3, var5);
         this.u3(var1, var3, var5);
         this.k5(var1, var3);
         this.a6(var1, var3, var5);
         return var3;
      }
   }

   private RenderedImage n5(RenderedImage var1, Map<String, Object> var2) {
      Integer var3 = this.n5(var2);
      if (var3 == null) {
         return var1;
      }

      int var4 = -1;

      for (int var5 = 0; var5 < n5.length; var5++) {
         if (var3 == n5[var5]) {
            var4 = var5;
            break;
         }
      }

      if (var4 == -1) {
         throw new ArgumentException("Encoder.ColorDepth");
      }

      if (!(var1 instanceof BufferedImage)) {
         return var1;
      }

      BufferedImage var9 = (BufferedImage)var1;
      com.aspose.slides.internal.o9b.l6 var6 = com.aspose.slides.internal.o9b.l6.n5(var9);
      int var7 = l6[var4];
      if (var6.s7() == var7) {
         return var1;
      }

      com.aspose.slides.internal.o9b.l6 var8 = com.aspose.slides.internal.r5w.h0.n5(var6, var7);
      return var8.k5();
   }

   private Integer n5(Map<String, Object> var1) {
      o0 var2 = com.aspose.slides.internal.j9e.a6.l6.n5();
      Object var3 = var1.get("encoderParameters");
      if (var3 == null) {
         return null;
      }

      Object[] var4 = (Object[])var3;

      for (Object var8 : var4) {
         Object[] var9 = (Object[])var8;
         o0 var10 = (o0)var9[0];
         if (var10.equals(var2)) {
            return (Integer)var9[1];
         }
      }

      return null;
   }

   private void n5(com.aspose.slides.internal.f2i.n5 var1) {
      if (var1.m3() != 32946 && var1.m3() != 8 && var1.m3() != 5 && var1.m3() != 1) {
         var1.k5(5);
      }
   }

   private void n5(Map<String, Object> var1, com.aspose.slides.internal.f2i.n5 var2) {
      Integer var3 = this.l6(var1);
      if (var3 == null) {
         var3 = var2.m3();
      }

      switch (var3) {
         case 6:
            var3 = 7;
         default:
            var2.k5(var3);
      }
   }

   private Integer l6(Map<String, Object> var1) {
      o0 var2 = com.aspose.slides.internal.j9e.a6.k5.n5();
      Object var3 = var1.get("encoderParameters");
      if (var3 == null) {
         return null;
      }

      Object[] var4 = (Object[])var3;

      for (Object var8 : var4) {
         Object[] var9 = (Object[])var8;
         o0 var10 = (o0)var9[0];
         int var11 = (Integer)var9[1];
         if (var10.equals(var2)) {
            switch (var11) {
               case 2:
                  return 5;
               case 3:
                  return 3;
               case 4:
                  return 4;
               case 5:
                  return 32773;
               case 6:
                  return 1;
               default:
                  return null;
            }
         }
      }

      return null;
   }

   private a6$n5 n5(RenderedImage var1, Map<String, Object> var2, boolean var3) {
      SampleModel var4 = var1.getSampleModel();
      ColorModel var5 = var1.getColorModel();
      int var6 = var4.getNumBands();
      boolean var7 = var5 != null && var5.hasAlpha();
      boolean var8 = var7 && var5.isAlphaPremultiplied();
      byte var9 = 0;
      if (var6 > 1 && var7) {
         var6--;
         var9 = 1;
      }

      Integer var10 = this.n5(var2);
      if (var10 == null) {
         var10 = this.k5(var2);
      }

      if (var10 == 48) {
         var6 = 3;
         var7 = false;
         var9 = 0;
      } else if (var10 == 32) {
         var6 = 3;
         var7 = true;
         var9 = 1;
      }

      int var11 = this.n5(var1, var6, var9, var3);
      int[] var12 = this.n5(var6, var9, var11);
      return new a6$n5(var6, var7, var8, var9, var11, var12);
   }

   private int n5(RenderedImage var1, int var2, int var3, boolean var4) {
      int[] var5 = var1.getSampleModel().getSampleSize();
      int var6 = 0;

      for (int var7 = 0; var7 < var2; var7++) {
         var6 = Math.max(var6, var5[var7]);
      }

      if (var6 == 3) {
         var6 = 4;
      } else if (var6 > 4 && var6 < 8) {
         var6 = 8;
      } else if (var6 > 8 && var6 < 16) {
         var6 = 16;
      } else if (var6 > 16) {
         var6 = 32;
      }

      int var8 = var2 + var3;
      if (!var4 && var8 == 3 && var6 == 16) {
         var6 = 8;
      }

      if (var8 == 4 && var6 == 16) {
         var6 = 8;
      }

      if (var2 + var3 == 1 && var6 == 2) {
         var6 = 4;
      }

      return var6;
   }

   private int[] n5(int var1, int var2, int var3) {
      int[] var4 = new int[var1 + var2];
      Arrays.fill(var4, var3);
      return var4;
   }

   private void l6(com.aspose.slides.internal.f2i.n5 var1) {
      if (var1.y1() != 1) {
         var1.u9(1);
      }
   }

   private void n5(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2) {
      if (this.l6(var1, var2)) {
         var2.c8(1);
      }
   }

   private boolean l6(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2) {
      int var3 = var2.o0();
      int[] var4 = var1.getSampleModel().getSampleSize();
      if (var4[0] == 8 && (var3 == 1 || var3 == 2)) {
         int var5 = var2.m3();
         return var5 == 1 || var5 == 32773;
      } else {
         return true;
      }
   }

   private void n5(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2, a6$n5 var3) {
      ColorModel var4 = var1.getColorModel();
      int var5 = -1;
      if (var2.y2() != -1) {
         var5 = var2.y2();
         if (var5 == 3 && !(var4 instanceof IndexColorModel)) {
            var5 = -1;
         }
      }

      if (var3.n5 == 3) {
         if (var5 == -1) {
            var5 = 2;
         }
      } else if (var3.n5 == 1 && var4 instanceof IndexColorModel) {
         var5 = this.n5((IndexColorModel)var4, var5);
      } else if (var5 == -1) {
         var5 = this.l6(var1);
      }

      if ((var5 == 1 || var5 == 0) && var3.n5()) {
         var5 = 2;
      }

      var2.a6(var5);
   }

   private void n5(com.aspose.slides.internal.f2i.n5 var1, a6$n5 var2) {
      var1.l6(var2.u9);
   }

   private void l6(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2, a6$n5 var3) {
      com.aspose.slides.internal.u2w.a6 var4 = var2.s7(339);
      if (var4 == null && (var3.a6 == 16 || var3.a6 == 32)) {
         int var5 = var1.getSampleModel().getDataType();
         byte var6;
         if (var3.a6 == 16 && var5 == 1) {
            var6 = 1;
         } else if (var3.a6 == 32 && var5 == 4) {
            var6 = 3;
         } else {
            var6 = 2;
         }

         int[] var7 = new int[var2.s3()];
         Arrays.fill(var7, var6);
         var2.u3(var7);
      }
   }

   private void l6(com.aspose.slides.internal.f2i.n5 var1, a6$n5 var2) {
      if (!var2.l6) {
         var1.t2(338);
      } else {
         var1.u3(var2.k5 ? 1 : 2);
      }
   }

   private void k5(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2, a6$n5 var3) {
      ColorModel var4 = var1.getColorModel();
      int var5 = var2.y2();
      if (var5 == 3 && var4 instanceof IndexColorModel) {
         IndexColorModel var6 = (IndexColorModel)var4;
         int[] var7 = new int[3 * (1 << var3.u9[0])];
         int var8 = 1 << var3.u9[0];
         int var9 = Math.min(var8, var6.getMapSize());

         for (int var10 = 0; var10 < var9; var10++) {
            var7[var10] = var6.getRed(var10) * 65535 / 255;
            var7[var8 + var10] = var6.getGreen(var10) * 65535 / 255;
            var7[2 * var8 + var10] = var6.getBlue(var10) * 65535 / 255;
         }

         var2.k5(var7);
      } else {
         var2.t2(320);
      }
   }

   private void u3(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2, a6$n5 var3) {
      com.aspose.slides.internal.u2w.a6 var4 = var2.s7(282);
      com.aspose.slides.internal.u2w.a6 var5 = var2.s7(283);
      if (var4 == null && var5 == null) {
         com.aspose.slides.internal.u2w.a6 var6 = var2.s7(296);
         c8[] var7 = new c8[1];
         if (var6 == null && var2.s7(286) == null && var2.s7(287) == null) {
            var7[0] = new c8(1L, 1L);
            var2.h0(1);
         } else {
            int var8 = var2.a0();
            int var9 = Math.max(var1.getWidth(), var1.getHeight());
            switch (var8) {
               case 2:
                  var7[0] = new c8(var9, 4L);
                  break;
               case 3:
                  var7[0] = new c8((int)(100L * var9), 1016L);
                  break;
               default:
                  var7[0] = new c8(1L, 1L);
            }
         }

         var2.n5(var7[0]);
         var2.l6(var7[0]);
      } else if (var4 == null && var5 != null) {
         var2.n5(var2.e5());
      } else if (var4 != null && var5 == null) {
         var2.l6(var2.i1());
      }
   }

   private void k5(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2) {
      int var3 = var1.getWidth();
      var2.k5((long)var3);
      int var4 = var1.getHeight();
      var2.l6((long)var4);
   }

   private void a6(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2, a6$n5 var3) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      long var6 = this.u9(var1, var2, var3);
      boolean var8 = false;
      int var9 = var4;
      int var10 = (int)var6;
      boolean var11 = this.h0(var1, var2, var3);
      if (var2.m3() == 7) {
         byte var12;
         byte var13;
         if (var3.n5 == 1) {
            var12 = 1;
            var13 = 1;
         } else {
            var12 = 2;
            var13 = 2;
         }

         if (var8) {
            int var14 = 8 * var13;
            int var15 = 8 * var12;
            var9 = Math.max(var14 * ((var9 + var14 / 2) / var14), var14);
            var10 = Math.max(var15 * ((var10 + var15 / 2) / var15), var15);
         } else if (var6 < var5) {
            int var20 = 8 * Math.max(var13, var12);
            var6 = var10 = Math.max(var20 * ((var10 + var20 / 2) / var20), var20);
         }
      } else if (var11) {
         var9 = var4;
         var10 = var5;
      } else if (var8) {
         int var18 = var9 % 16;
         if (var18 != 0) {
            var9 = Math.max(16 * ((var9 + 8) / 16), 16);
         }

         int var16 = var10 % 16;
         if (var16 != 0) {
            var10 = Math.max(16 * ((var10 + 8) / 16), 16);
         }
      }

      int var19 = (var4 + var9 - 1) / var9;
      int var17 = (var5 + var10 - 1) / var10;
      if (!var8) {
         var2.t2(322);
         var2.t2(323);
         var2.t2(324);
         var2.t2(325);
         var2.n5(var6);
         var2.l6(new long[]{var17});
         var2.n5(new long[]{var17});
      }
   }

   private long u9(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2, a6$n5 var3) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      com.aspose.slides.internal.u2w.a6 var6 = var2.s7(278);
      long var7;
      if (var6 != null) {
         var7 = var2.d2();
         if (var7 < 0L) {
            var7 = var5;
         }
      } else {
         int var9 = var3.a6 * (var3.n5 + var3.u3);
         int var10 = (var9 * var4 + 7) / 8;
         var7 = Math.max(Math.max(8192 / var10, 1), 8);
      }

      return Math.min(var7, var5);
   }

   private int n5(IndexColorModel var1, int var2) {
      if (this.n5(var1)) {
         if (var2 != 1 && var2 != 0) {
            int var3 = var1.getRed(0);
            var2 = var3 == 0 ? 1 : 0;
         }
      } else {
         var2 = 3;
      }

      return var2;
   }

   private boolean n5(IndexColorModel var1) {
      int var2 = var1.getRed(0);
      int var3 = var1.getRed(1);
      return var1.getMapSize() == 2
         && var2 == var1.getGreen(0)
         && var2 == var1.getBlue(0)
         && var3 == var1.getGreen(1)
         && var3 == var1.getBlue(1)
         && (var2 == 0 || var2 == 255)
         && (var3 == 0 || var3 == 255)
         && var2 != var3;
   }

   private int l6(RenderedImage var1) {
      ColorModel var2 = var1.getColorModel();
      if (var2 == null) {
         return 1;
      }

      switch (var2.getColorSpace().getType()) {
         case 1:
            return 8;
         case 3:
            return 6;
         case 9:
            return 5;
         default:
            return 1;
      }
   }

   private boolean h0(RenderedImage var1, com.aspose.slides.internal.f2i.n5 var2, a6$n5 var3) {
      int[] var4 = var1.getSampleModel().getSampleSize();
      boolean var5 = false;
      if (var3.n5 == 3 && var4[0] == 8 && var4[1] == 8 && var4[2] == 8) {
         int var6 = var2.y2();
         if (var2.s7(34665) != null) {
            if (var2.m3() != 1 || var6 != 2 && var6 != 6) {
               if (var2.m3() == 6) {
                  var5 = true;
               }
            } else {
               var5 = true;
            }
         }
      }

      return var5 && var2.m3() == 6;
   }

   private int k5(Map<String, Object> var1) {
      Object var2 = var1.get("bitspPixel");
      return var2 != null ? (Integer)var2 : 0;
   }

   private boolean l6(int var1) {
      return var1 == 3 || var1 == 4 || var1 == 2;
   }
}
