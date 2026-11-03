package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.io.IOException;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.stream.MemoryCacheImageOutputStream;

public abstract class t4 implements IDisposable, com.aspose.slides.ms.System.v4 {
   private final com.aspose.slides.internal.j9e.m1 n5 = new com.aspose.slides.internal.j9e.m1();
   protected int l6 = 0;
   protected boolean k5 = false;
   private com.aspose.slides.internal.t5g.n5 u3 = null;
   private ImageOutputStream a6 = null;
   private com.aspose.slides.internal.z0k.t4 u9 = null;

   @Override
   public void dispose() {
      this.n5.l6();
   }

   protected t4() {
   }

   protected t4(Image var1, com.aspose.slides.internal.j9e.x8 var2) {
      com.aspose.slides.internal.j9e.z3 var3 = new com.aspose.slides.internal.j9e.z3(
         var1, null, var2, this.n5(var1, "dpiX"), this.n5(var1, "dpiY"), com.aspose.slides.internal.j9e.c8.l6()
      );
      this.n5(var3, false);
   }

   private float n5(Image var1, String var2) {
      Object var3 = var1.getProperty(var2, null);
      return var3 != null && !Image.UndefinedProperty.equals(var3) && var3 instanceof Float ? (Float)var3 : com.aspose.slides.internal.r5w.n5.n5();
   }

   protected void n5(com.aspose.slides.internal.j9e.z3 var1, boolean var2) {
      if (!var2) {
         this.u3().l6();
      }

      this.u3().n5(var1);
   }

   public com.aspose.slides.internal.j9e.m1 u3() {
      return this.n5;
   }

   public com.aspose.slides.internal.j9e.z3 a6() {
      return this.u3().k5();
   }

   public static t4 n5(String var0) {
      return n5(var0, false);
   }

   public static t4 n5(String var0, boolean var1) {
      if (var0 == null) {
         throw new ArgumentNullException();
      } else if (var0.length() == 0) {
         throw new ArgumentException();
      } else if (!com.aspose.slides.internal.z0k.u9.k5(var0)) {
         throw new FileNotFoundException(var0);
      } else {
         return k5(var0) ? new com.aspose.slides.internal.j9e.y4(var0) : new l6(var0, var1);
      }
   }

   public static t4 n5(com.aspose.slides.internal.z0k.t4 var0) {
      return n5(var0, false);
   }

   public static t4 n5(com.aspose.slides.internal.z0k.t4 var0, boolean var1) {
      return n5(var0, var1, true);
   }

   public static t4 n5(com.aspose.slides.internal.z0k.t4 var0, boolean var1, boolean var2) {
      return com.aspose.slides.internal.t5g.u3.n5(var0) ? new com.aspose.slides.internal.j9e.y4(var0) : new l6(var0, var1);
   }

   private static boolean k5(String var0) {
      com.aspose.slides.internal.z0k.n3 var1 = null;

      try {
         var1 = new com.aspose.slides.internal.z0k.n3(var0, 3, 1);
         return com.aspose.slides.internal.t5g.u3.n5(var1);
      } catch (FileNotFoundException var7) {
         return false;
      } finally {
         if (var1 != null) {
            var1.close();
         }
      }
   }

   @Override
   public abstract Object deepClone();

   public static int n5(int var0) {
      return (var0 & 0xFF00) > 0 ? var0 >> 8 & 0xFF : 0;
   }

   public static boolean l6(int var0) {
      return (var0 & 65536) != 0;
   }

   public static boolean k5(int var0) {
      return (var0 & 262144) != 0;
   }

   public y1 n5(int[] var1) {
      var1[0] = 2;
      return new y1(0.0F, 0.0F, this.e2(), this.h0());
   }

   public int n5(com.aspose.slides.internal.j9e.c8 var1) {
      this.l6(var1);
      return this.u3().n5();
   }

   public void u3(int var1) {
      if (!(this.a6().n5() instanceof BufferedImage)) {
         throw new NotImplementedException("Only raster formats are supported");
      }

      AffineTransform var2;
      switch (var1) {
         case 0:
            return;
         case 1:
            var2 = AffineTransform.getRotateInstance(Math.PI / 2);
            var2.translate(0.0, -this.h0());
            break;
         case 2:
            var2 = AffineTransform.getScaleInstance(-1.0, -1.0);
            var2.translate(-this.e2(), -this.h0());
            break;
         case 3:
            var2 = AffineTransform.getRotateInstance(-Math.PI / 2);
            var2.translate(-this.e2(), 0.0);
            break;
         case 4:
            var2 = AffineTransform.getScaleInstance(-1.0, 1.0);
            var2.translate(-this.e2(), 0.0);
            break;
         case 5:
            var2 = AffineTransform.getRotateInstance(Math.PI / 2);
            var2.scale(1.0, -1.0);
            break;
         case 6:
            var2 = AffineTransform.getScaleInstance(1.0, -1.0);
            var2.translate(0.0, -this.h0());
            break;
         case 7:
            var2 = AffineTransform.getRotateInstance(Math.PI / 2);
            var2.scale(-1.0, 1.0);
            var2.translate(-this.e2(), -this.h0());
            break;
         default:
            throw new ArgumentException();
      }

      com.aspose.slides.internal.q2c.n5 var3 = new com.aspose.slides.internal.q2c.n5(var2, 2);
      this.a6().n5(var3.n5((BufferedImage)this.a6().n5(), null));
   }

   protected abstract void n5(
      ImageOutputStream var1, com.aspose.slides.internal.z0k.t4 var2, com.aspose.slides.internal.t5g.n5 var3, com.aspose.slides.internal.j9e.h0 var4
   );

   public void n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.j9e.s7 var2, com.aspose.slides.internal.j9e.h0 var3) {
      if (var2 == null) {
         throw new ArgumentNullException("encoder", "Value cannot be null.");
      }

      this.k5 = this.l6(var3);
      com.aspose.slides.internal.t5g.n5 var4 = com.aspose.slides.internal.t5g.n5.n5(var2.l6().k5());
      var4.n5(this.k5);

      try {
         MemoryCacheImageOutputStream var5 = new MemoryCacheImageOutputStream(var1.toOutputStream());
         this.n5(var5, var1, var4, var3);
         var5.flush();
         var1.flush();
         if (this.k5) {
            this.a6 = var5;
            this.u9 = var1;
            this.u3 = var4;
         }
      } catch (IOException var9) {
         throw new com.aspose.slides.exceptions.IOException(var9.getMessage(), var9);
      } finally {
         if (!this.k5) {
            var4.dispose();
         }
      }
   }

   public void n5(String var1, com.aspose.slides.internal.j9e.s7 var2, com.aspose.slides.internal.j9e.h0 var3) {
      com.aspose.slides.internal.z0k.n3 var4 = new com.aspose.slides.internal.z0k.n3(var1, 2);
      this.n5(var4, var2, var3);
      if (!this.k5) {
         var4.close();
      }
   }

   public void l6(String var1) {
      this.n5(var1, this.x8());
   }

   public void n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.j9e.x8 var2) {
      this.n5(var1, var2, true);
   }

   private void l6(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.j9e.x8 var2) {
      this.n5(var1, var2, false);
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.j9e.x8 var2, boolean var3) {
      if (!this.x8().n5().equals(com.aspose.slides.internal.j9e.x8.h0().n5()) && com.aspose.slides.internal.j9e.x8.h0().n5().equals(var2.n5())) {
         var2 = com.aspose.slides.internal.j9e.x8.s7();
      }

      com.aspose.slides.internal.j9e.s7 var4 = com.aspose.slides.internal.t5g.n5.l6(com.aspose.slides.internal.t5g.n5.l6(var2).k5());
      if (var3 && var4 != null && !var4.l6().equals(com.aspose.slides.internal.t5g.n5.l6(var2).k5())) {
         throw new ArgumentNullException("codec not found (" + var2.n5().toString() + ") codec=" + var4.k5() + ":" + var4.u9());
      }

      this.n5(var1, var4, null);
   }

   public void n5(float var1, float var2) {
      if (!(var1 <= 0.0F) && !(var2 <= 0.0F) && !Float.valueOf(var1).isNaN() && !Float.valueOf(var2).isNaN()) {
         this.a6().n5(var1);
         this.a6().l6(var2);
         this.l6 |= 4096;
      } else {
         throw new ArgumentException("Parameter is not valid");
      }
   }

   public void n5(String var1, com.aspose.slides.internal.j9e.x8 var2) {
      com.aspose.slides.internal.z0k.n3 var3 = null;

      try {
         var3 = new com.aspose.slides.internal.z0k.n3(var1, 2);
         this.l6(var3, var2);
      } finally {
         if (var3 != null) {
            var3.close();
         }
      }
   }

   public void n5(com.aspose.slides.internal.j9e.h0 var1) {
      if (var1 == null) {
         throw new ArgumentException("Parameter is not valid.", "encoderParams");
      }

      if (this.k5) {
         boolean var2 = this.k5(var1);

         try {
            if (var2) {
               this.u3.t2();
            } else {
               if (!this.n5(this.u3, var1)) {
                  throw new ArgumentException("Parameter is not valid.", "encoderParams");
               }

               com.aspose.slides.internal.j9e.z3 var3 = this.a6();
               this.n5(var1, var3);
               this.u3.n5(var3);
            }
         } finally {
            if (var2) {
               this.u3.n5(false);
               this.u3.dispose();
               this.u3 = null;
               if (this.a6 != null) {
                  try {
                     this.a6.flush();
                     this.a6.close();
                     this.a6 = null;
                  } catch (IOException var12) {
                  }

                  try {
                     this.u9.flush();
                     this.u9 = null;
                  } catch (com.aspose.slides.exceptions.IOException var11) {
                  }
               }
            }
         }
      } else {
         throw new InvalidOperationException("Save method should be called before");
      }
   }

   public void n5(t4 var1, com.aspose.slides.internal.j9e.h0 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      }

      if (var2 == null) {
         throw new ArgumentException("Parameter is not valid.", "encoderParams");
      }

      if (this.k5) {
         if (this.n5(this.u3, var2)) {
            com.aspose.slides.internal.j9e.m1 var3 = var1.u3();
            if (var3 != null && var3.n5() > 0) {
               com.aspose.slides.internal.j9e.z3 var4 = var3.k5();
               this.n5(var2, var4);
               this.u3.n5(var4);
            }
         } else {
            throw new ArgumentException("Parameter is not valid.", "encoderParams");
         }
      } else {
         throw new InvalidOperationException("Save method should be called before");
      }
   }

   private boolean l6(com.aspose.slides.internal.j9e.h0 var1) {
      return this.n5(var1, 18);
   }

   private boolean n5(com.aspose.slides.internal.t5g.n5 var1, com.aspose.slides.internal.j9e.h0 var2) {
      if (var1.s7().equals(com.aspose.slides.internal.j9e.x8.x8())) {
         return this.u3(var2);
      } else if (var1.s7().equals(com.aspose.slides.internal.j9e.x8.u9())) {
         return this.a6(var2);
      } else {
         return var1.s7().equals(com.aspose.slides.internal.j9e.x8.h0()) ? this.u9(var2) : false;
      }
   }

   private boolean k5(com.aspose.slides.internal.j9e.h0 var1) {
      return this.n5(var1, 20);
   }

   private boolean u3(com.aspose.slides.internal.j9e.h0 var1) {
      return this.n5(var1, 23);
   }

   private boolean a6(com.aspose.slides.internal.j9e.h0 var1) {
      return this.n5(var1, 21);
   }

   private boolean u9(com.aspose.slides.internal.j9e.h0 var1) {
      return this.n5(var1, 22);
   }

   private boolean n5(com.aspose.slides.internal.j9e.h0 var1, int var2) {
      boolean var3 = false;
      if (var1 != null && var1.n5() != null) {
         com.aspose.slides.internal.j9e.u9[] var4 = var1.n5();

         for (com.aspose.slides.internal.j9e.u9 var8 : var4) {
            if (var8 == null) {
               throw new ArgumentNullException("param can't be null");
            }

            if (var8.n5().equals(com.aspose.slides.internal.j9e.a6.h0) && var8.l6() == var2) {
               var3 = true;
            }
         }
      }

      return var3;
   }

   protected void n5(com.aspose.slides.internal.j9e.h0 var1, com.aspose.slides.internal.j9e.z3 var2) {
      int var3 = this.s7();
      var2.n5("pixelFormat", var3);
      var2.n5("bitspPixel", n5(var3));
      var2.n5("dpiX", this.c8());
      var2.n5("dpiY", this.y4());
      if (var1 != null) {
         com.aspose.slides.internal.j9e.u9[] var4 = var1.n5();
         Object[] var5 = new Object[var4.length];
         int var6 = 0;

         for (com.aspose.slides.internal.j9e.u9 var10 : var4) {
            Object[] var11 = new Object[]{var10.n5().n5(), var10.l6(), var10.u3(), var10.k5()};
            var5[var6++] = var11;
         }

         var2.n5("encoderParameters", var5);
      }
   }

   public int n5(com.aspose.slides.internal.j9e.c8 var1, int var2) {
      this.l6(var1);
      if (var2 >= 0 && var2 < this.u3().n5()) {
         this.u3().l6(var2);
         return 0;
      } else {
         throw new ExternalException("A generic error occurred in GDI+.");
      }
   }

   public com.aspose.slides.ms.System.o0[] u9() {
      return new com.aspose.slides.ms.System.o0[]{this.a6().u3().n5()};
   }

   public int h0() {
      return this.a6().n5().getHeight(null);
   }

   public float c8() {
      return this.a6().u9() <= 1.0F ? com.aspose.slides.internal.r5w.n5.n5() : this.a6().u9();
   }

   public com.aspose.slides.internal.j9e.u3 t2() {
      if (!(this.a6().n5() instanceof BufferedImage)) {
         throw new NotImplementedException("Only raster formats are supported");
      } else {
         ColorModel var1 = ((BufferedImage)this.a6().n5()).getColorModel();
         if (var1 instanceof IndexColorModel) {
            return this.n5((IndexColorModel)var1);
         } else {
            return this.s7() == 198659 ? com.aspose.slides.internal.j9e.u3.n5(256) : com.aspose.slides.internal.j9e.u3.k5();
         }
      }
   }

   private com.aspose.slides.internal.j9e.u3 n5(IndexColorModel var1) {
      int var2 = this.s7();
      return var2 == 196865 && com.aspose.slides.internal.j9e.x8.s7().equals(this.a6().k5())
         ? com.aspose.slides.internal.j9e.u3.n5(0, this.l6(var1))
         : com.aspose.slides.internal.j9e.u3.n5(
            (var1.hasAlpha() && com.aspose.slides.internal.j9e.t4.n5(var2, 262144) ? 1 : 0)
               | (var2 == 196865 ? 2 : 0)
               | (var2 != 196865 && var2 != 197634 ? 4 : 0),
            this.l6(var1)
         );
   }

   private c8[] l6(IndexColorModel var1) {
      c8[] var2 = (c8[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(c8.class), var1.getMapSize()));

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = c8.n5(var1.getRGB(var3));
      }

      return var2;
   }

   public void n5(com.aspose.slides.internal.j9e.u3 var1) {
      if (!(this.a6().n5() instanceof BufferedImage)) {
         throw new NotImplementedException("Only raster formats are supported");
      }

      BufferedImage var2 = (BufferedImage)this.a6().n5();
      ColorModel var3 = var2.getColorModel();
      if (var3 instanceof IndexColorModel) {
         this.n5(var1, var2, (IndexColorModel)var3);
      }
   }

   private void n5(com.aspose.slides.internal.j9e.u3 var1, BufferedImage var2, IndexColorModel var3) {
      boolean var4 = this.l6(var1);
      int var5 = var3.getNumComponents();
      if (var5 < 4 && var4) {
         var5++;
      }

      int var6 = var3.getMapSize();
      byte[] var7 = new byte[var6 * var5];

      for (int var8 = 0; var8 < var6; var8++) {
         c8 var9 = var1.n5()[var8 % var1.n5().length];
         var7[var8 * var5] = var9.x8();
         var7[var8 * var5 + 1] = var9.n3();
         var7[var8 * var5 + 2] = var9.y4();
         if (var5 > 3) {
            var7[var8 * var5 + 3] = var9.s7();
         }
      }

      IndexColorModel var10 = new IndexColorModel(var3.getPixelSize(), var1.n5().length, var7, 0, var4 || var3.hasAlpha());
      this.n5(var2, var10);
   }

   private void n5(BufferedImage var1, IndexColorModel var2) {
      BufferedImage var3 = new BufferedImage(var1.getWidth(null), var1.getHeight(null), a6(this.s7()), var2);
      Graphics2D var4 = var3.createGraphics();
      var4.drawImage(var1, 0, 0, null);
      var4.dispose();
      this.a6().n5(var3);
   }

   private boolean l6(com.aspose.slides.internal.j9e.u3 var1) {
      c8[] var2 = var1.n5();

      for (c8 var6 : var2) {
         if (var6.s7() == 0) {
            return true;
         }
      }

      return false;
   }

   protected abstract int l6();

   public int s7() {
      return this.l6();
   }

   public com.aspose.slides.internal.j9e.x8 x8() {
      return this.a6().k5();
   }

   public p8 n3() {
      return new p8(this.e2(), this.h0());
   }

   public float y4() {
      return this.a6().h0() <= 1.0F ? com.aspose.slides.internal.r5w.n5.n5() : this.a6().h0();
   }

   public int e2() {
      return this.a6().n5().getWidth(null);
   }

   private void l6(com.aspose.slides.internal.j9e.c8 var1) {
      com.aspose.slides.internal.j9e.c8[] var2 = this.n5();

      for (com.aspose.slides.internal.j9e.c8 var6 : var2) {
         if (com.aspose.slides.ms.System.o0.n5(var1.n5(), var6.n5())) {
            return;
         }
      }

      throw new ExternalException("A generic error occurred in GDI+.");
   }

   private com.aspose.slides.internal.j9e.c8[] n5() {
      com.aspose.slides.internal.j9e.x8 var1 = this.x8();
      if (var1.equals(com.aspose.slides.internal.j9e.x8.x8())) {
         return new com.aspose.slides.internal.j9e.c8[]{com.aspose.slides.internal.j9e.c8.l6()};
      } else if (var1.equals(com.aspose.slides.internal.j9e.x8.u9())) {
         return new com.aspose.slides.internal.j9e.c8[]{com.aspose.slides.internal.j9e.c8.u3()};
      } else {
         return var1.equals(com.aspose.slides.internal.j9e.x8.h0())
            ? new com.aspose.slides.internal.j9e.c8[]{
               com.aspose.slides.internal.j9e.c8.l6(), com.aspose.slides.internal.j9e.c8.u3(), com.aspose.slides.internal.j9e.c8.k5()
            }
            : new com.aspose.slides.internal.j9e.c8[]{com.aspose.slides.internal.j9e.c8.l6()};
      }
   }

   protected static int k5(int var0, int var1) {
      switch (var0) {
         case 0:
         case 4:
         default:
            return 0;
         case 1:
            return 139273;
         case 2:
         case 6:
            return 2498570;
         case 3:
         case 7:
            return 925707;
         case 5:
            return 137224;
         case 8:
            return 135174;
         case 9:
            return 135173;
         case 10:
         case 13:
            return 198659;
         case 11:
            return 1052676;
         case 12:
            if (var1 == 1) {
               return 196865;
            } else {
               return var1 == 8 ? 198659 : 197634;
            }
      }
   }

   public static int a6(int var0) {
      switch (var0) {
         case 135173:
            return 9;
         case 135174:
            return 8;
         case 137224:
            return 5;
         case 139273:
            return 1;
         case 196865:
         case 197634:
            return 12;
         case 198659:
            return 13;
         case 397319:
         case 1060876:
         case 1851406:
         case 3424269:
         default:
            return 2;
         case 925707:
            return 7;
         case 1052676:
            return 11;
         case 2498570:
            return 6;
      }
   }
}
