package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.f7v.w2;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.FilteredImageSource;
import java.awt.image.IndexColorModel;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;

public final class l6 extends t4 {
   private static final c8 u3 = c8.q1().o8();
   protected int n5 = 0;
   private final com.aspose.slides.internal.g3x.l6 a6 = new com.aspose.slides.internal.g3x.l6(this);

   public l6(t4 var1) {
      this(var1, var1.n3());
   }

   public l6(com.aspose.slides.internal.z0k.t4 var1) {
      this(l6(var1), false, null);
   }

   public l6(String var1) {
      this(k5(var1), false, null);
   }

   public l6(t4 var1, p8 var2) {
      this(var1, var2.l6(), var2.k5());
   }

   public l6(int var1, int var2) {
      this(var1, var2, 2498570);
   }

   public l6(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      this(l6(var1), var2, null);
   }

   public l6(String var1, boolean var2) {
      this(k5(var1), var2, null);
   }

   public l6(t4 var1, int var2, int var3) {
      super(n5(var1, var2, var3), com.aspose.slides.internal.j9e.x8.t2());
   }

   public l6(int var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   l6(com.aspose.slides.internal.j9e.z3 var1) {
      super.n5(var1, false);
   }

   public l6(Image var1, com.aspose.slides.internal.j9e.x8 var2) {
      super(var1, var2);
   }

   l6(int var1, int var2, boolean var3) {
      this(var1, var2, 2498570, var3);
   }

   private l6(int var1, int var2, int var3, boolean var4, com.aspose.slides.internal.j9e.x8 var5) {
      super(n5(var1, var2, var3, var4), var5);
      this.n5 = var3;
   }

   private l6(int var1, int var2, int var3, boolean var4) {
      this(var1, var2, var3, var4, com.aspose.slides.internal.j9e.x8.t2());
   }

   l6(com.aspose.slides.internal.z0k.t4 var1, boolean var2, com.aspose.slides.internal.j9e.x8 var3) {
      this.n5(new MemoryCacheImageInputStream(com.aspose.slides.internal.t5g.u3.l6(var1)), var3);
   }

   l6(String var1, boolean var2, com.aspose.slides.internal.j9e.x8 var3) {
      com.aspose.slides.internal.z0k.n3 var4 = null;

      try {
         var4 = new com.aspose.slides.internal.z0k.n3(var1, 3, 1);
      } catch (FileNotFoundException var9) {
         throw new ArgumentException("Parameter value is not valid <" + var1 + ">");
      }

      try {
         this.n5(new MemoryCacheImageInputStream(com.aspose.slides.internal.t5g.u3.l6(var4)), var3);
      } finally {
         if (var4 != null) {
            var4.close();
         }
      }
   }

   private static String k5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("Value of 'filename' cannot be null");
      } else {
         return var0;
      }
   }

   private static com.aspose.slides.internal.z0k.t4 l6(com.aspose.slides.internal.z0k.t4 var0) {
      if (var0 == null) {
         throw new ArgumentException("Value of null is not valid for 'stream'");
      }

      var0.setPosition(0L);
      return var0;
   }

   private static BufferedImage n5(int var0, int var1, int var2, boolean var3) {
      long var4 = (long)var0 * var1;
      if (var4 >= 2147483647L) {
         throw new ArgumentException("Parameter is not valid.");
      } else {
         return com.aspose.slides.internal.v4y.l6.n5(var0, var1, var2, var3);
      }
   }

   private void n5(MemoryCacheImageInputStream var1, com.aspose.slides.internal.j9e.x8 var2) {
      boolean var3 = false;
      com.aspose.slides.internal.t5g.n5 var4 = null;
      if (var2 == null) {
         var4 = com.aspose.slides.internal.t5g.n5.n5(var1);
      } else {
         var4 = com.aspose.slides.internal.t5g.n5.n5(var2);
      }

      if (var4 == null && var2 == null) {
         if (!this.n5(var1)) {
            throw new ArgumentException("Error loading file: Unsupported file format", "input");
         }
      } else {
         if (var4 == null) {
            throw new ArgumentNullException("ImageCodec was not found for format: " + var2.toString());
         }

         try {
            // Bind the codec input; n5(ImageInputStream) is a static codec factory.
            var4.n5((Object)var1);
            if (var4.s7().equals(com.aspose.slides.internal.j9e.x8.h0()) && var2 == null) {
               com.aspose.slides.internal.j9e.z3 var14 = var4.u9();
               com.aspose.slides.internal.j9e.z3 var6 = var14;

               while (var14 != null) {
                  var6 = var14;
                  var14 = var4.h0();
               }

               this.n5(var6);
               super.n5(var6, false);
            } else {
               com.aspose.slides.internal.j9e.z3 var5 = var4.u9();
               this.n5(var5);
               super.n5(var5, false);

               for (com.aspose.slides.internal.j9e.z3 var13 = var4.h0(); var13 != null; var13 = var4.h0()) {
                  super.n5(var13, true);
               }
            }

            this.l6 |= 73728;
            var3 = true;
         } catch (IOException var10) {
            throw var10;
         } finally {
            if (var4 != null) {
               var4.dispose();
            }

            if (!var3) {
               this.dispose();
            }
         }
      }
   }

   private boolean n5(MemoryCacheImageInputStream var1) {
      try {
         com.aspose.slides.internal.j9e.y4 var2 = new com.aspose.slides.internal.j9e.y4(
            com.aspose.slides.internal.z0k.t4.fromJava(com.aspose.slides.internal.t5g.u3.a6(var1))
         );
         int var3 = var2.e2();
         int var4 = var2.h0();
         BufferedImage var5 = com.aspose.slides.internal.v4y.l6.n5(var3, var4, 2498570);
         com.aspose.slides.internal.j9e.z3 var6 = new com.aspose.slides.internal.j9e.z3(
            var5,
            null,
            com.aspose.slides.internal.j9e.x8.t2(),
            com.aspose.slides.internal.r5w.n5.u3(),
            com.aspose.slides.internal.r5w.n5.a6(),
            com.aspose.slides.internal.j9e.c8.l6()
         );
         this.n5(var6, false);
         z1 var7 = z1.n5(this);
         var7.n5(var2, 0, 0, var3, var4);
         return true;
      } catch (Exception var8) {
         return false;
      }
   }

   private void n5(com.aspose.slides.internal.j9e.z3 var1) {
      if (var1 != null && var1.n5("pixelFormat") != null) {
         this.n5 = (Integer)var1.n5("pixelFormat");
      }
   }

   private boolean u3(int var1, int var2) {
      return this.n5(var1, var2, this.e2(), this.h0());
   }

   private boolean n5(int var1, int var2, int var3, int var4) {
      return var1 >= 0 && var1 < var3 && var2 >= 0 && var2 < var4;
   }

   @Override
   protected void n5(
      ImageOutputStream var1, com.aspose.slides.internal.z0k.t4 var2, com.aspose.slides.internal.t5g.n5 var3, com.aspose.slides.internal.j9e.h0 var4
   ) {
      com.aspose.slides.internal.j9e.z3 var5 = this.a6();
      var5.n5().flush();
      this.n5(var4, var5);
      if (!var3.s7().equals(com.aspose.slides.internal.j9e.x8.u9())
         && !var3.s7().equals(com.aspose.slides.internal.j9e.x8.x8())
         && !var3.s7().equals(com.aspose.slides.internal.j9e.x8.c8())
         && !var3.s7().equals(com.aspose.slides.internal.j9e.x8.s7())) {
         var3.n5(var1);
      } else {
         var3.n5(var2);
      }

      if (var3.s7().equals(com.aspose.slides.internal.j9e.x8.x8())) {
         if (this.k5) {
            var3.c8();
            var3.n5(var5);
         } else {
            var3.l6(var5);
         }
      } else if (var3.s7().equals(com.aspose.slides.internal.j9e.x8.u9())) {
         if (this.k5) {
            var3.c8();
            var3.n5(var5);
         } else {
            var3.n5(this.u3());
         }
      } else {
         var3.n5(this.u3());
      }
   }

   private static Image n5(t4 var0, int var1, int var2) {
      long var3 = (long)var1 * var2;
      if (var3 >= 2147483647L) {
         throw new ArgumentException("Parameter is not valid.");
      } else if (var0 == null) {
         throw new ArgumentNullException("original");
      } else {
         boolean var5 = var0.e2() != var1 || var0.h0() != var2;
         if (var5) {
            BufferedImage var8 = com.aspose.slides.internal.v4y.l6.n5(var1, var2, 2498570);
            com.aspose.slides.internal.q2c.l6 var9 = new com.aspose.slides.internal.q2c.l6();
            var9.n5((BufferedImage)var0.a6().n5(), var8);
            return var8;
         } else {
            BufferedImage var6 = com.aspose.slides.internal.v4y.l6.n5(var1, var2, 2498570);
            Graphics2D var7 = var6.createGraphics();
            var7.drawImage(var0.a6().n5(), 0, 0, null);
            var7.dispose();
            return var6;
         }
      }
   }

   protected c8 n5(int var1, int var2) {
      int var3 = this.k5().getRGB(var1, var2);
      return c8.n5(var3);
   }

   public c8 l6(int var1, int var2) {
      if (!this.u3(var1, var2)) {
         throw new ArgumentOutOfRangeException(
            "x/y (" + var1 + ", " + var2 + ") must be non-negative and less than width/height(" + this.e2() + "," + this.h0() + ")"
         );
      } else if (this.s7() == 1052676) {
         throw new ArgumentException("Parameter is not valid");
      } else if (this.t9()) {
         throw new InvalidOperationException("Bitmap region is already locked");
      } else {
         int var3 = this.s7();
         if (var3 == 397319) {
            int var12 = ((short[])this.k5().getRaster().getDataElements(var1, var2, null))[0] & '\uffff';
            return c8.n5(com.aspose.slides.internal.r5w.s7.l6(var12));
         } else if (var3 == 135173) {
            int var11 = ((short[])this.k5().getRaster().getDataElements(var1, var2, null))[0] & '\uffff';
            return c8.n5(com.aspose.slides.internal.r5w.s7.u3(var11));
         } else if (var3 == 135174) {
            int var10 = ((short[])this.k5().getRaster().getDataElements(var1, var2, null))[0] & '\uffff';
            return c8.n5(com.aspose.slides.internal.r5w.s7.u9(var10));
         } else if (var3 == 925707) {
            com.aspose.slides.internal.j9e.n5 var9 = this.n5(var1, var2, this.s7());
            byte[] var5 = (byte[])var9.u3().k5().n5();
            int var6 = var5[3] & 255;
            float var7 = 255.0F / var6;
            return c8.n5(var6 << 24 | (int)(var7 * (var5[2] & 0xFF)) << 16 | (int)(var7 * (var5[1] & 0xFF)) << 8 | (int)(var7 * (var5[0] & 0xFF)));
         } else if (var3 == 139273) {
            c8 var8 = this.n5(var1, var2);
            return c8.n5((int)(-16777216L | var8.u9()));
         } else if (var3 == 198659) {
            return this.n5(var1, var2);
         } else if (var3 == 197634) {
            c8 var4 = this.n5(var1, var2);
            return c8.n5((int)(-16777216L | var4.u9()));
         } else {
            return this.n5(var1, var2);
         }
      }
   }

   public void n5(int var1, int var2, c8 var3) {
      if (t4.l6(this.s7())) {
         throw new InvalidOperationException("SetPixel is not supported for images with indexed pixel formats.");
      }

      if (!this.u3(var1, var2)) {
         throw new ArgumentOutOfRangeException("x/y must be non-negative and less than width/height");
      }

      if (this.t9()) {
         throw new InvalidOperationException("Bitmap region is already locked");
      }

      int var4 = this.s7();
      BufferedImage var5 = this.k5();
      int var6 = var3.h0();
      if (var5.getType() == 1) {
         var5.getRaster().setDataElements(var1, var2, new int[]{var6});
      } else if (var4 == 397319) {
         var5.getRaster().setDataElements(var1, var2, new short[]{(short)com.aspose.slides.internal.r5w.s7.n5(var6)});
      } else if (var4 == 135173) {
         var5.getRaster().setDataElements(var1, var2, new short[]{(short)com.aspose.slides.internal.r5w.s7.k5(var6)});
      } else if (var4 == 135174) {
         var5.getRaster().setDataElements(var1, var2, new short[]{(short)com.aspose.slides.internal.r5w.s7.a6(var6)});
      } else {
         var5.setRGB(var1, var2, var6);
      }
   }

   @Override
   public Object deepClone() {
      return this.n5(new y2(0, 0, this.e2(), this.h0()));
   }

   public l6 n5(y2 var1) {
      return this.n5(var1, this.s7());
   }

   public l6 n5(y2 var1, int var2) {
      return this.n5(new y1(var1.s7(), var1.x8(), var1.t2(), var1.l6()), var2);
   }

   public l6 n5(y1 var1, int var2) {
      boolean var3 = var1.x8() == 0.0F && var1.n3() == 0.0F && var1.s7() == this.e2() && var1.k5() == this.h0();
      return var3 ? this.l6(var1, var2) : this.k5(var1, var2);
   }

   private l6 l6(y1 var1, int var2) {
      l6 var3 = null;

      for (com.aspose.slides.internal.j9e.z3 var5 : this.u3()) {
         Image var6 = var5.n5();
         com.aspose.slides.internal.j9e.z3 var8;
         if (var6 instanceof com.aspose.slides.internal.t2h.l6) {
            com.aspose.slides.internal.t2h.l6 var7 = (com.aspose.slides.internal.t2h.l6)var6;
            var8 = var5.n5(false);
            var8.n5(var7.n5(var2));
         } else {
            var8 = this.n5(var1, var2, var5);
         }

         if (var3 == null) {
            var3 = new l6(var8);
         } else {
            var3.n5(var8, true);
         }
      }

      boolean var9 = this.s7() == var2;
      if (var3 != null && var9) {
         var3.u3().l6(this.u3().u3());
      }

      return var3;
   }

   private l6 k5(y1 var1, int var2) {
      com.aspose.slides.internal.j9e.z3 var3 = this.n5(var1, var2, this.a6());
      return new l6(var3);
   }

   private com.aspose.slides.internal.j9e.z3 n5(y1 var1, int var2, com.aspose.slides.internal.j9e.z3 var3) {
      boolean var4 = this.s7() == var2;
      return var4 ? this.n5(var1, var3) : com.aspose.slides.internal.r5w.h0.n5(new l6(var3), var2, y2.k5(var1)).a6();
   }

   private com.aspose.slides.internal.j9e.z3 n5(y1 var1, com.aspose.slides.internal.j9e.z3 var2) {
      BufferedImage var3 = (BufferedImage)var2.n5();
      BufferedImage var4 = com.aspose.slides.internal.t5g.u3.n5(var3, (int)var1.x8(), (int)var1.n3(), (int)var1.s7(), (int)var1.k5());
      com.aspose.slides.internal.j9e.z3 var5 = var2.n5(false);
      var5.n5(var4);
      return var5;
   }

   public synchronized com.aspose.slides.internal.j9e.n5 n5(y2 var1, int var2, int var3) {
      return this.n5(var1, var2, var3, false);
   }

   public synchronized com.aspose.slides.internal.j9e.n5 n5(y2 var1, int var2, int var3, boolean var4) {
      return this.a6.n5(var1, var2, var3, var4);
   }

   private com.aspose.slides.internal.j9e.n5 n5(int var1, int var2, int var3) {
      com.aspose.slides.internal.j9e.n5 var4 = this.n5(new y2(var1, var2, 1, 1), 1, var3);
      this.n5(var4);
      return var4;
   }

   private boolean t9() {
      return this.a6.n5();
   }

   public synchronized void n5(com.aspose.slides.internal.j9e.n5 var1) {
      this.a6.n5(var1);
   }

   public void n5() {
      c8 var1 = u3;
      if (this.e2() > 0 && this.h0() > 0) {
         var1 = this.l6(0, this.h0() - 1);
      }

      if ((var1.s7() & 255) >= 255) {
         this.n5(var1);
      }
   }

   public void n5(c8 var1) {
      if (com.aspose.slides.internal.j9e.x8.h0().n5().equals(this.x8().n5())) {
         throw new InvalidOperationException("The image format of the Bitmap is an icon format");
      }

      Color var2 = var1.n5();
      k5 var3 = new k5(this, var2);
      BufferedImage var4 = n5(this);
      int var5 = var4.getWidth();
      int var6 = var4.getHeight();
      BufferedImage var7;
      if (this.s7() == 2498570 && var4.getType() == 6) {
         var7 = this.n5(var4, var5, var6, var2);
      } else {
         FilteredImageSource var8 = new FilteredImageSource(var4.getSource(), var3);
         Image var9 = Toolkit.getDefaultToolkit().createImage(var8);
         var7 = new BufferedImage(var5, var6, 2);
         Graphics2D var10 = var7.createGraphics();
         var10.drawImage(var9, 0, 0, null);
         var10.dispose();
      }

      l6 var11 = n5(var7);
      this.n5(var11.a6(), false);
      this.n5 = 2498570;
   }

   private BufferedImage n5(BufferedImage var1, int var2, int var3, Color var4) {
      byte[] var5 = ((DataBufferByte)var1.getRaster().getDataBuffer()).getData();
      int[] var6 = new int[var2 * var3];
      int var7 = 0;
      int var8 = 0;

      while (var7 < var6.length) {
         int var9 = var5[var8++] & 255;
         int var10 = var5[var8++] & 255;
         int var11 = var5[var8++] & 255;
         int var12 = var5[var8++] & 255;
         if (var10 == var4.getBlue() && var11 == var4.getGreen() && var12 == var4.getRed()) {
            var9 = 0;
            var10 = 0;
            var11 = 0;
            var12 = 0;
         }

         var6[var7] = var9 << 24 | var12 << 16 | var11 << 8 | var10;
         var7++;
      }

      var1 = new BufferedImage(var2, var3, 2);
      var1.setRGB(0, 0, var2, var3, var6, 0, var2);
      return var1;
   }

   @Override
   protected int l6() {
      BufferedImage var1 = (BufferedImage)this.a6().n5();
      ColorModel var2 = var1.getColorModel();
      int var3 = var2.getPixelSize();
      if (var2 instanceof IndexColorModel) {
         if (this.x8().equals(com.aspose.slides.internal.j9e.x8.u9()) && var3 < 8) {
            var3 = 8;
         } else if (this.x8().equals(com.aspose.slides.internal.j9e.x8.s7())) {
            com.aspose.slides.internal.j9e.z3 var4 = this.a6();
            if (var4.l6() instanceof w2) {
               w2 var5 = (w2)var4.l6();
               int var6 = var5.a6().u3();
               if (var6 == 1) {
                  return 196865;
               }

               if (var6 == 4) {
                  return 197634;
               }

               if (var6 == 8) {
                  return 198659;
               }
            }
         } else if (var3 == 8) {
            return 198659;
         }
      }

      if (var2.getColorSpace() instanceof com.aspose.slides.internal.p0s.n5) {
         return 8207;
      }

      int var7 = t4.k5(this.k5().getType(), var3);
      if (t4.n5(this.n5) > 32) {
         return this.n5;
      }

      if (this.n5 == 397319) {
         return this.n5;
      }

      if (this.n5 == 139273) {
         return this.n5;
      }

      if (var7 == 0) {
         if (this.x8().equals(com.aspose.slides.internal.j9e.x8.s7())) {
            return 2498570;
         }

         int[] var8 = var2.getComponentSize();
         if (var2.getNumComponents() == 3) {
            return var8[0] == 16 ? 1060876 : 137224;
         }

         if (var2.getNumComponents() == 4) {
            if (var8[0] == 16) {
               return var2.isAlphaPremultiplied() ? 1851406 : 3424269;
            } else {
               return var2.isAlphaPremultiplied() ? 925707 : 2498570;
            }
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   public BufferedImage k5() {
      return (BufferedImage)this.a6().n5();
   }

   public static BufferedImage n5(l6 var0) {
      return var0 == null ? null : var0.k5();
   }

   public static l6 n5(BufferedImage var0) {
      return n5(var0, com.aspose.slides.internal.j9e.x8.t2());
   }

   public static l6 n5(BufferedImage var0, com.aspose.slides.internal.j9e.x8 var1) {
      return var0 == null ? null : new l6(var0, var1);
   }
}
