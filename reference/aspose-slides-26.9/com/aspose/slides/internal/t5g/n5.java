package com.aspose.slides.internal.t5g;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.c9t.t2;
import com.aspose.slides.internal.g3y.h0;
import com.aspose.slides.internal.g3y.u9;
import com.aspose.slides.internal.j9e.c8;
import com.aspose.slides.internal.j9e.m1;
import com.aspose.slides.internal.j9e.s7;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.j9e.z3;
import com.aspose.slides.internal.v6g.a6;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;
import com.aspose.slides.ms.core.System.Drawing.imagecodecs.jpeg.JpegImageReader;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;

public class n5 implements IDisposable {
   private ImageReader w1 = null;
   private ImageWriter r4 = null;
   private Object c4 = null;
   private x8 y2 = null;
   private int y1 = 0;
   private boolean a0 = false;
   private static HashMap<o0, n5$k5> d2 = new HashMap<>(6);
   private static HashMap d5 = null;
   private static HashMap s3 = null;
   static o0 n5 = new o0("557cf400-1a04-11d3-9a73-0000f81ef32e");
   static o0 l6 = new o0("557cf401-1a04-11d3-9a73-0000f81ef32e");
   static o0 k5 = new o0("557cf402-1a04-11d3-9a73-0000f81ef32e");
   static o0 u3 = new o0("557cf403-1a04-11d3-9a73-0000f81ef32e");
   static o0 a6 = new o0("557cf404-1a04-11d3-9a73-0000f81ef32e");
   static o0 u9 = new o0("557cf405-1a04-11d3-9a73-0000f81ef32e");
   static o0 h0 = new o0("557cf406-1a04-11d3-9a73-0000f81ef32e");
   static o0 c8 = new o0("557cf407-1a04-11d3-9a73-0000f81ef32e");
   private static final o0[] p8 = new o0[]{n5, l6, k5, u3, a6, u9, h0, c8};
   private static final Dictionary<String, o0> f2 = new l6();
   private static final Dictionary<String, n5$l6> i1 = new k5();
   static byte[][] t2 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{66, 77}, null)};
   static byte[][] s7 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255}, null)};
   static byte[][] x8 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 216}, null)};
   static byte[][] n3 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255}, null)};
   static byte[][] y4 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{137, 80, 78, 71, 13, 10, 26, 10}, null)};
   static byte[][] e2 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255, 255, 255, 255, 255, 255, 255}, null)};
   static byte[][] t9 = new byte[][]{
      com.aspose.slides.internal.r5w.l6.n5(new int[]{71, 73, 70, 56, 57, 97}, null),
      com.aspose.slides.internal.r5w.l6.n5(new int[]{71, 73, 70, 56, 55, 97}, null)
   };
   static byte[][] z1 = new byte[][]{
      com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255, 255, 255, 255, 255}, null),
      com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255, 255, 255, 255, 255}, null)
   };
   static byte[][] t4 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{0, 0, 1, 0}, null)};
   static byte[][] q0 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255, 255, 255}, null)};
   static byte[][] z3 = new byte[][]{
      com.aspose.slides.internal.r5w.l6.n5(new int[]{73, 73}, null), com.aspose.slides.internal.r5w.l6.n5(new int[]{77, 77}, null)
   };
   static byte[][] m1 = new byte[][]{
      com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255}, null), com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255}, null)
   };
   static byte[][] k7 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{215, 205, 198, 154}, null)};
   static byte[][] m3 = new byte[][]{com.aspose.slides.internal.r5w.l6.n5(new int[]{255, 255, 255, 255}, null)};
   static byte[][] z8 = new byte[][]{
      com.aspose.slides.internal.r5w.l6.n5(
         new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 69, 77, 70},
         null
      )
   };
   static byte[][] j5 = new byte[][]{
      com.aspose.slides.internal.r5w.l6.n5(
         new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 255, 255, 255, 255},
         null
      )
   };
   private static boolean e5 = false;

   protected n5() {
   }

   public ImageReader n5() {
      return this.w1;
   }

   void n5(ImageReader var1) {
      this.w1 = var1;
      if (var1 != null) {
         if (var1.getOriginatingProvider() != null) {
            this.y2 = n5(var1.getOriginatingProvider().getMIMETypes());
         }
      }
   }

   public ImageWriter l6() {
      return this.r4;
   }

   void n5(ImageWriter var1) {
      this.r4 = var1;
      if (var1 != null) {
         if (var1.getOriginatingProvider() != null) {
            this.y2 = n5(var1.getOriginatingProvider().getMIMETypes());
         }
      }
   }

   Object k5() {
      return this.c4;
   }

   public void n5(Object var1) {
      this.c4 = var1;
      if (var1 != null) {
         if (this.n5() != null) {
            this.n5().setInput(var1);
         }

         if (this.l6() != null) {
            this.l6().setOutput(var1);
         }
      }
   }

   public static n5 n5(ImageInputStream var0) {
      n5 var1 = l6(var0);
      if (var1 == null) {
         Iterator var2 = ImageIO.getImageReaders(var0);
         var1 = n5(var2);
      }

      return var1;
   }

   private static n5 l6(ImageInputStream var0) {
      o0 var1 = null;

      try {
         byte[] var2 = new byte[8];
         var0.mark();
         var0.readFully(var2);
         var0.reset();
         if (var2[0] == 66 && var2[1] == 77) {
            var1 = n5.k5();
         } else if (var2[0] == -119 && var2[1] == 80 && var2[2] == 78 && var2[3] == 71 && var2[4] == 13 && var2[5] == 10 && var2[6] == 26 && var2[7] == 10) {
            var1 = h0.k5();
         } else if (var2[0] == -1 && var2[1] == -40) {
            var1 = l6.k5();
         } else if (var2[0] == 71 && var2[1] == 73 && var2[2] == 70 && var2[3] == 56 && (var2[4] == 55 || var2[4] == 57) && var2[5] == 97) {
            var1 = k5.k5();
         } else if ((var2[0] != 73 || var2[1] != 73 || var2[2] != 42 || var2[3] != 0) && (var2[0] != 77 || var2[1] != 77 || var2[2] != 0 || var2[3] != 42)) {
            if (var2[0] != 0 || var2[1] != 0 || var2[3] != 0 || var2[2] != 1 && var2[2] != 2 || var2[4] <= 0) {
               return null;
            }

            var1 = c8.k5();
         } else {
            var1 = u9.k5();
         }
      } catch (IOException var3) {
         return null;
      }

      return a6(var1);
   }

   public static n5 n5(x8 var0) {
      o0 var1 = l6(var0).k5();
      n5 var2 = a6(var1);
      if (var2 == null) {
         var2 = u9(var1);
      }

      return var2;
   }

   private static n5 a6(o0 var0) {
      ImageReader var1 = c8(var0);
      if (var1 != null) {
         n5 var2 = new n5();
         var2.n5(var1);
         var2.y2 = u3(var0);
         return var2;
      } else {
         return null;
      }
   }

   private static n5 u9(o0 var0) {
      n5 var1 = null;

      try {
         s7 var2 = k5(var0.k5());
         Iterator var3 = ImageIO.getImageReadersByMIMEType(var2.h0());
         var1 = n5(var3);
      } catch (Exception var4) {
      }

      if (var1 == null) {
         x8 var5 = u3(var0.k5());
         String var6 = var5 != null ? var5.toString() : var0.toString();
         throw new NotSupportedException(d1.n5("The '{0}' format decoder is not installed.", new Object[]{var6}));
      } else {
         return var1;
      }
   }

   private static n5 n5(Iterator var0) {
      if (!var0.hasNext()) {
         return null;
      }

      n5 var1 = new n5();
      ImageReader var2 = (ImageReader)var0.next();
      var1.n5(var2);
      return var1;
   }

   public static n5 n5(o0 var0) {
      n5 var1 = h0(var0);
      if (var1 == null) {
         try {
            s7 var2 = l6(var0.k5());
            Iterator var3 = ImageIO.getImageWritersByMIMEType(var2.h0());
            var1 = l6(var3);
         } catch (Exception var4) {
         }

         if (var1 == null) {
            x8 var5 = u3(var0.k5());
            String var6 = var5 != null ? var5.toString() : var0.toString();
            throw new NotSupportedException(d1.n5("The '{0}' format encoder is not installed.", new Object[]{var6}));
         }
      }

      return var1;
   }

   private static n5 h0(o0 var0) {
      ImageWriter var1 = t2(var0);
      if (var1 != null) {
         n5 var2 = new n5();
         var2.n5(var1);
         var2.y2 = u3(var0);
         return var2;
      } else {
         return null;
      }
   }

   private static n5 l6(Iterator var0) {
      if (!var0.hasNext()) {
         return null;
      }

      n5 var1 = new n5();
      ImageWriter var2 = (ImageWriter)var0.next();
      var1.n5(var2);
      return var1;
   }

   public static HashMap u3() {
      if (d5 == null) {
         HashMap var0 = new HashMap(10);

         for (KeyValuePair var2 : f2) {
            o0 var3 = (o0)var2.getValue();
            s7 var4 = n5(var3, (String)var2.getKey(), true);
            if (var4 != null && var4.u3() != null) {
               var0.put(var3.k5(), var4);
            }
         }

         HashMap var5 = new n5$u3(null).n5();

         for (Object var7 : var5.keySet()) {
            o0 var8 = (o0)var7;
            if (!var0.containsKey(var8.clone())) {
               var0.put(var8.clone(), var5.get(var8));
            }
         }

         d5 = var0;
      }

      return d5;
   }

   public static HashMap a6() {
      if (s3 == null) {
         HashMap var0 = new HashMap(10);

         for (KeyValuePair var2 : f2) {
            o0 var3 = (o0)var2.getValue();
            s7 var4 = n5(var3, (String)var2.getKey(), false);
            if (var4 != null && var4.u3() != null) {
               var0.put(var3.k5(), var4);
            }
         }

         HashMap var5 = new n5$a6(null).n5();

         for (Object var7 : var5.keySet()) {
            o0 var8 = (o0)var7;
            if (!var0.containsKey(var8.clone())) {
               var0.put(var8.k5(), var5.get(var8));
            }
         }

         s3 = var0;
      }

      return s3;
   }

   private static s7 n5(o0 var0, String var1, boolean var2) {
      s7 var3 = new s7();
      var3.n5(var0.k5());
      x8 var4 = u3(var0.k5());
      var3.l6(var4.n5().k5());
      var3.u3(var1);
      ImageReader var5 = null;
      ImageWriter var6 = null;
      if (var2) {
         var5 = c8(var0.k5());
      } else {
         var6 = t2(var0.k5());
      }

      if (var5 == null && var6 == null) {
         return null;
      }

      n5$k5 var7 = d2.get(var0.k5());
      var3.n5(var2 ? var7.n5[0] : var7.n5[1]);

      for (String var11 : var7.k5) {
         if (var3.u3() != null) {
            var3.l6(var3.u3() + ";*." + var11);
         } else {
            var3.l6("*." + var11);
         }
      }

      var3.n5(65540);
      if (var5 != null) {
         var3.n5(var3.a6() | 2);
      } else {
         var3.n5(var3.a6() | 1);
      }

      a6 var12 = new a6(null);
      a6 var13 = new a6(null);
      n5(u3(var0), var12, var13);
      var3.n5((byte[][])var12.n5);
      var3.l6((byte[][])var13.n5);
      var3.k5(d1.n5(";", var7.u3));
      var3.l6(var7.l6);
      return var3;
   }

   public static s7 l6(o0 var0) {
      s7 var1 = (s7)a6().get(var0.k5());
      if (var1 == null) {
         var1 = (s7)a6().get(h0.k5());
      }

      return var1;
   }

   static s7 k5(o0 var0) {
      s7 var1 = (s7)u3().get(var0.k5());
      if (var1 == null) {
         x8 var2 = u3(var0.k5());
         String var3 = var2 != null ? var2.toString() : var0.toString();
         throw new NotSupportedException(d1.n5("The '{0}' format decoder is not installed.", new Object[]{var3}));
      } else {
         return var1;
      }
   }

   private static x8 n5(String[] var0) {
      for (Object recoveredElement$var2$12532 : u3().values()) {
         s7 var2 = (s7)recoveredElement$var2$12532;
         for (String var6 : var0) {
            if (var2.h0().contains(var6)) {
               return u3(var2.l6());
            }
         }
      }

      return null;
   }

   public static x8 u3(o0 var0) {
      if (var0.equals(n5.k5())) {
         return com.aspose.slides.internal.j9e.x8.k5();
      } else if (var0.equals(l6.k5())) {
         return com.aspose.slides.internal.j9e.x8.c8();
      } else if (var0.equals(k5.k5())) {
         return com.aspose.slides.internal.j9e.x8.u9();
      } else if (var0.equals(u3.k5())) {
         return com.aspose.slides.internal.j9e.x8.u3();
      } else if (var0.equals(a6.k5())) {
         return com.aspose.slides.internal.j9e.x8.n3();
      } else if (var0.equals(u9.k5())) {
         return com.aspose.slides.internal.j9e.x8.x8();
      } else if (var0.equals(h0.k5())) {
         return com.aspose.slides.internal.j9e.x8.s7();
      } else {
         return var0.equals(c8.k5()) ? com.aspose.slides.internal.j9e.x8.h0() : null;
      }
   }

   public static o0 l6(x8 var0) {
      if (var0 == null) {
         return o0.n5;
      } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.k5().n5().k5())) {
         return n5;
      } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.c8().n5().k5())) {
         return l6;
      } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.u9().n5().k5())) {
         return k5;
      } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.u3().n5().k5())) {
         return u3;
      } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.n3().n5().k5())) {
         return a6;
      } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.x8().n5().k5())) {
         return u9;
      } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.s7().n5().k5())) {
         return h0;
      } else {
         return var0.n5().equals(com.aspose.slides.internal.j9e.x8.h0().n5().k5()) ? c8 : o0.n5;
      }
   }

   public static void n5(x8 var0, a6<byte[][]> var1, a6<byte[][]> var2) {
      if (var0 != null) {
         if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.k5().n5().k5())) {
            var1.n5 = s7;
            var2.n5 = t2;
         } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.c8().n5().k5())) {
            var1.n5 = n3;
            var2.n5 = x8;
         } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.u9().n5().k5())) {
            var1.n5 = z1;
            var2.n5 = t9;
         } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.u3().n5().k5())) {
            var1.n5 = j5;
            var2.n5 = z8;
         } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.n3().n5().k5())) {
            var1.n5 = m3;
            var2.n5 = k7;
         } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.x8().n5().k5())) {
            var1.n5 = m1;
            var2.n5 = z3;
         } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.s7().n5().k5())) {
            var1.n5 = e2;
            var2.n5 = y4;
         } else if (var0.n5().equals(com.aspose.slides.internal.j9e.x8.h0().n5().k5())) {
            var1.n5 = q0;
            var2.n5 = t4;
         } else {
            var1.n5 = (new byte[0][]);
            var2.n5 = (new byte[0][]);
         }
      }
   }

   private c8 n3() {
      if (this.s7() == null) {
         return com.aspose.slides.internal.j9e.c8.l6();
      } else if (this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.k5().n5().k5())) {
         return com.aspose.slides.internal.j9e.c8.l6();
      } else if (this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.c8().n5().k5())) {
         return com.aspose.slides.internal.j9e.c8.l6();
      } else if (this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.u9().n5().k5())) {
         return com.aspose.slides.internal.j9e.c8.u3();
      } else if (this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.u3().n5().k5())) {
         return com.aspose.slides.internal.j9e.c8.l6();
      } else if (this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.n3().n5().k5())) {
         return com.aspose.slides.internal.j9e.c8.l6();
      } else if (this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.x8().n5().k5())) {
         return com.aspose.slides.internal.j9e.c8.l6();
      } else if (this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.s7().n5().k5())) {
         return com.aspose.slides.internal.j9e.c8.l6();
      } else {
         return this.s7().n5().equals(com.aspose.slides.internal.j9e.x8.h0().n5().k5())
            ? com.aspose.slides.internal.j9e.c8.k5()
            : com.aspose.slides.internal.j9e.c8.l6();
      }
   }

   public z3 u9() {
      Image var1 = this.n5(this.y1);
      if (var1 == null) {
         return null;
      }

      Object var2 = null;
      IIOMetadata var3 = null;

      try {
         var3 = this.k5(this.y1);
      } catch (RuntimeException var11) {
      }

      float[] var5 = null;
      Object var6 = ((BufferedImage)var1).getProperty("dpiX");
      if (!var6.equals(Image.UndefinedProperty)) {
         float var4 = (Float)var6;
         float var7 = (Float)((BufferedImage)var1).getProperty("dpiY");
         var5 = new float[]{var4, var7};
      } else {
         var5 = com.aspose.slides.internal.t5g.u3.l6((ImageInputStream)this.k5());
         if (var5.length == 0) {
            var5 = this.y4();
         }
      }

      z3 var8 = new z3(var1, (Image[])var2, this.s7(), var5[0], var5[1], this.n3());
      var8.n5(var3);
      Object var9 = ((BufferedImage)var1).getProperty("bitspPixel");
      if (!var9.equals(Image.UndefinedProperty)) {
         int var10 = (Integer)var9;
         if (var10 > 32) {
            var8.n5("pixelFormat", var10 == 48 ? 2498570 : 3424269);
         }
      }

      return var8;
   }

   private float[] y4() {
      n5$l6[] var1 = new n5$l6[]{null};
      i1.tryGetValue(this.s7().toString(), var1);
      n5$l6 var2 = var1[0];
      return var2 == null ? new float[]{0.0F, 0.0F} : new float[]{var2.n5 * var2.k5, var2.l6 * var2.k5};
   }

   public z3 h0() {
      this.y1++;
      return this.u9();
   }

   private Image n5(int var1) {
      if (this.k5() == null) {
         throw new RuntimeException("Input stream not specified");
      }

      if (!this.l6(var1)) {
         return null;
      }

      try {
         return this.n5().read(var1);
      } catch (IOException var3) {
         throw new com.aspose.slides.exceptions.IOException(var3.getMessage(), var3);
      }
   }

   private boolean l6(int var1) {
      try {
         int var2 = this.n5().getNumImages(true);
         return var1 < var2;
      } catch (IOException var3) {
         throw new com.aspose.slides.exceptions.IOException(var3.getMessage(), var3);
      }
   }

   public void n5(m1 var1) {
      if (var1 != null && var1.n5() != 0) {
         if (this.a0) {
            if (this.l6().canWriteSequence()) {
               try {
                  this.l6().prepareWriteSequence(null);
                  IIOImage var2 = this.k5(var1.n5(0));
                  this.l6().writeToSequence(var2, null);
               } catch (IOException var3) {
                  throw new com.aspose.slides.exceptions.IOException(var3.getMessage(), var3);
               }
            } else {
               this.n5(false);
               this.l6(var1.n5(0));
            }
         } else {
            this.l6(var1.n5(var1.u3()));
         }
      }
   }

   public void c8() {
      try {
         this.l6().prepareWriteSequence(null);
      } catch (IOException var2) {
         throw new com.aspose.slides.exceptions.IOException(var2.getMessage(), var2);
      }
   }

   public void n5(z3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("pic");
      }

      if (this.a0) {
         try {
            IIOImage var2 = this.k5(var1);
            this.l6().writeToSequence(var2, null);
         } catch (IOException var3) {
            throw new com.aspose.slides.exceptions.IOException(var3.getMessage(), var3);
         }
      } else {
         throw new InvalidOperationException("Can't write to sequence");
      }
   }

   public void t2() {
      if (!this.a0) {
         throw new InvalidOperationException("Not started");
      }

      try {
         this.l6().endWriteSequence();
      } catch (IOException var5) {
         throw new com.aspose.slides.exceptions.IOException(var5.getMessage(), var5);
      } finally {
         this.a0 = false;
      }
   }

   public void l6(z3 var1) {
      try {
         IIOImage var2 = this.k5(var1);
         this.n5(var2, null);
      } catch (IOException var3) {
         throw new com.aspose.slides.exceptions.IOException(var3.getMessage(), var3);
      }
   }

   private void n5(IIOImage var1, ImageWriteParam var2) throws IOException {
      if (this.k5() == null) {
         throw new RuntimeException("Output stream not specified");
      }

      if (var2 == null) {
         this.l6().write(var1);
      } else {
         this.l6().write(var1.getMetadata(), var1, var2);
      }
   }

   private IIOImage k5(z3 var1) {
      Image[] var2 = var1.a6();
      Image var3 = var1.n5();
      if (var1.c8().size() > 0) {
         var3 = new BufferedImage(
            ((BufferedImage)var3).getColorModel(), ((BufferedImage)var3).getRaster(), ((BufferedImage)var3).isAlphaPremultiplied(), var1.c8()
         );
      }

      IIOMetadata var4 = var1.l6();
      return this.n5(var3, var2, var4);
   }

   private IIOImage n5(Image var1, Image[] var2, IIOMetadata var3) {
      ArrayList var4 = null;
      if (var2 != null) {
         var4 = new ArrayList(var2.length);

         for (int var5 = 0; var5 < var2.length; var5++) {
            var4.add(var2[var5]);
         }
      }

      if (var1 instanceof BufferedImage) {
         return new IIOImage((BufferedImage)var1, var4, var3);
      } else {
         throw new NotSupportedException("Only raster formats are supported");
      }
   }

   private IIOMetadata k5(int var1) {
      if (this.k5() == null) {
         throw new RuntimeException("Input stream not specified");
      }

      try {
         return this.n5().getImageMetadata(var1);
      } catch (IOException var3) {
         throw new com.aspose.slides.exceptions.IOException(var3.getMessage(), var3);
      }
   }

   public x8 s7() {
      return this.y2;
   }

   @Override
   public void dispose() {
      if (this.n5() != null) {
         this.n5().dispose();
         this.n5((ImageReader)null);
      }

      if (this.l6() != null) {
         this.l6().dispose();
         this.n5((ImageWriter)null);
      }
   }

   public void n5(boolean var1) {
      this.a0 = var1;
   }

   private static ImageReader c8(o0 var0) {
      if (n5.equals(var0)) {
         return new com.aspose.slides.internal.c9t.a6(null);
      } else if (h0.equals(var0)) {
         return new com.aspose.slides.internal.h6l.n5(null);
      } else if (l6.equals(var0)) {
         return e5 ? new com.aspose.slides.internal.d2a.l6(null) : new JpegImageReader(null);
      } else if (k5.equals(var0)) {
         return new com.aspose.slides.internal.m4d.k5(null);
      } else if (u9.equals(var0)) {
         return new com.aspose.slides.internal.q4d.k5(null);
      } else {
         return c8.equals(var0) ? new u9(null) : null;
      }
   }

   private static ImageWriter t2(o0 var0) {
      if (n5.equals(var0)) {
         return new t2(null);
      } else if (h0.equals(var0)) {
         return new com.aspose.slides.internal.e4w.n5(null);
      } else if (l6.equals(var0)) {
         return new com.aspose.slides.internal.d2a.k5(null);
      } else if (k5.equals(var0)) {
         return new com.aspose.slides.internal.m4d.u3(null);
      } else if (u9.equals(var0)) {
         return new com.aspose.slides.internal.q4d.a6(null);
      } else {
         return c8.equals(var0) ? new h0(null) : null;
      }
   }

   // $VF: synthetic method
   static Dictionary x8() {
      return f2;
   }

   static {
      d2.put(
         n5,
         new n5$k5(
            new String[]{"Aspose BMP image reader", "Aspose BMP image writer"},
            1,
            new String[]{"bmp"},
            new String[]{"bmp", "BMP"},
            new String[]{"image/bmp"},
            null
         )
      );
      d2.put(
         h0,
         new n5$k5(
            new String[]{"Aspose PNG image reader", "Aspose PNG image writer"},
            1,
            new String[]{"png"},
            new String[]{"png", "PNG"},
            new String[]{"image/png", "image/x-png"},
            null
         )
      );
      d2.put(
         l6,
         new n5$k5(
            new String[]{"Aspose JPEG image reader", "Aspose JPEG image writer"},
            1,
            new String[]{"jpg", "jpeg"},
            new String[]{"JPEG", "jpeg", "JPG", "jpg"},
            new String[]{"image/jpeg", "image/jpg"},
            null
         )
      );
      d2.put(
         k5,
         new n5$k5(
            new String[]{"Aspose GIF image reader", "Aspose GIF image writer"},
            1,
            new String[]{"gif"},
            new String[]{"gif", "GIF"},
            new String[]{"image/gif"},
            null
         )
      );
      d2.put(
         u9,
         new n5$k5(
            new String[]{"Aspose TIFF image reader", "Aspose TIFF image writer"},
            1,
            new String[]{"tif", "tiff"},
            new String[]{"tif", "TIF", "tiff", "TIFF"},
            new String[]{"image/tiff"},
            null
         )
      );
      d2.put(
         c8,
         new n5$k5(
            new String[]{"Aspose ICON image reader", "Aspose ICON image writer"},
            1,
            new String[]{"ico"},
            new String[]{"ico", "ICO"},
            new String[]{"image/vnd.microsoft.icon, image/x-icon"},
            null
         )
      );
   }
}
