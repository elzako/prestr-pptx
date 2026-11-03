package com.aspose.slides.internal.m5l;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.c4t.t9;
import com.aspose.slides.internal.k4o.u9;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D.Float;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public abstract class k5 implements Cloneable {
   public static Key n5 = new com.aspose.slides.internal.k3h.n5(3, "");
   protected RenderingHints l6 = null;
   protected Float k5;
   protected t9[] u3 = null;
   protected int a6;
   protected int u9;
   protected Color h0;
   protected com.aspose.slides.internal.c4t.l6[] c8 = null;
   protected int t2 = 139273;

   protected k5() {
      this.a6 = 0;
      this.u9 = 10000000;
   }

   public static k5 n5(String var0) throws com.aspose.slides.internal.p7x.l6, FileNotFoundException {
      FileInputStream var1 = null;

      try {
         var1 = new FileInputStream(var0);
         return n5(var1);
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (IOException var9) {
            }
         }
      }
   }

   public static k5 n5(InputStream var0) throws com.aspose.slides.internal.p7x.l6 {
      var0 = new BufferedInputStream(var0, 68);
      var0.mark(64);
      byte[] var1 = new byte[64];

      try {
         n5(var0, var1);
         var0.reset();
      } catch (Exception var6) {
         throw new com.aspose.slides.internal.p7x.l6("Internal error.", var6);
      }

      if (com.aspose.slides.internal.l1b.k5.u3(var1, 0) == 1 && com.aspose.slides.internal.l1b.k5.u3(var1, 40) == 1179469088) {
         try {
            return new n5(var0);
         } catch (Exception var4) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading EMF metafile.", var4);
         }
      } else {
         short var2 = com.aspose.slides.internal.l1b.k5.l6(var1, 0);
         if ((var2 <= 0 || var2 > 8) && var2 != -12841) {
            throw new com.aspose.slides.internal.p7x.l6("Unknown format.");
         }

         try {
            return new u3(var0);
         } catch (Exception var5) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMF metafile.", var5);
         }
      }
   }

   private static int n5(InputStream var0, byte[] var1) throws IOException {
      return n5(var0, var1, 0, var1.length);
   }

   private static int n5(InputStream var0, byte[] var1, int var2, int var3) throws IOException {
      int var4 = 0;
      int var5 = 1;

      while (var3 > 0 && var5 > 0) {
         var5 = var0.read(var1, var2, var3);
         if (var5 < 0) {
            var5 = 0;
         }

         var4 += var5;
         var2 += var5;
         var3 -= var5;
      }

      return var4;
   }

   public abstract boolean a6();

   public abstract int u9();

   public abstract float h0();

   public abstract float c8();

   public float x8() {
      return this.k5.x;
   }

   public float n3() {
      return this.k5.y;
   }

   public int y4() {
      return (int)this.k5.width;
   }

   public int e2() {
      return (int)this.k5.height;
   }

   public Float t9() {
      return this.k5;
   }

   public abstract Iterator<l6> n5(z1 var1);

   public abstract void l6(z1 var1);

   public abstract void n5(int var1, l6 var2, z1 var3);

   public abstract void n5(z1 var1, AffineTransform var2) throws com.aspose.slides.internal.p7x.l6;

   public abstract void n5(l6 var1);

   protected void n5(l6 var1, com.aspose.slides.internal.o6t.k5 var2, u9 var3, int var4) {
      try {
         var1.n5(var2, this, var4);
      } catch (com.aspose.slides.internal.p7x.l6 var6) {
         var2.u3();
         throw new InvalidOperationException(
            "Error playing metafile", new com.aspose.slides.internal.p7x.l6("Error rendering record number " + var1.n5(), var6)
         );
      } catch (Exception var7) {
         var3.n5(var7);
      }
   }

   public RenderedImage z1() {
      Float var1 = this.t9();
      y1 var2 = new y1(this.x8(), this.n3(), this.y4(), this.e2());
      w1[] var3 = new w1[]{new w1(0.0F, 0.0F), new w1((float)var1.getWidth(), 0.0F), new w1(0.0F, (float)var1.getHeight())};
      m1 var4 = new m1(var2, var3);
      return this.n5(Math.round(var1.width), Math.round(var1.height), null, var4.t2());
   }

   private RenderedImage n5(int var1, int var2, RenderingHints var3, AffineTransform var4) {
      RenderingHints var5 = new RenderingHints(new HashMap<>());
      if (this.l6 != null) {
         var5.add(this.l6);
      }

      if (var3 != null) {
         var5.add(var3);
      }

      Color var6 = this.h0;
      boolean var7 = var6 == null || var6.getAlpha() < 255;
      int var8 = var7 ? 2498570 : 139273;
      com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(var1, var2, var8);
      int var10 = this.u9();
      if (var10 == 4 || var10 == 5) {
         n5 var11 = (n5)this;
         var9.n5(var11.k5(), var11.u3());
      }

      BufferedImage var16 = var9.k5();
      z1 var12 = z1.n5(var9);
      Graphics2D var13 = var12.z8();
      var13.addRenderingHints(var5);
      var13.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      var13.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);

      try {
         Composite var14 = var13.getComposite();
         var13.setComposite(AlphaComposite.Clear);
         var13.fillRect(-1, -1, var1 + 2, var2 + 2);
         if (var6 != null && var6.getAlpha() > 0) {
            var13.setComposite(AlphaComposite.SrcOver);
            var13.setPaint(var6);
            var13.fillRect(-1, -1, var1 + 2, var2 + 2);
         }

         var13.setComposite(var14);
         this.n5(var12, var4);
      } catch (com.aspose.slides.internal.p7x.l6 var15) {
         return null;
      }

      return this.n5(var16, var8);
   }

   private BufferedImage n5(BufferedImage var1, int var2) {
      Hashtable var3 = new Hashtable();
      var3.put("pixelFormat", var2);
      var3.put("bitspPixel", var1.getColorModel().getPixelSize());
      var3.put("dpiX", this.h0());
      var3.put("dpiY", this.c8());
      return new BufferedImage(var1.getColorModel(), var1.getRaster(), var1.isAlphaPremultiplied(), var3);
   }

   public void n5(int var1) {
      this.t2 = var1;
   }

   public int t4() {
      return this.t2;
   }

   @Override
   public Object clone() {
      k5 var1 = null;

      try {
         var1 = (k5)super.clone();
      } catch (CloneNotSupportedException var3) {
      }

      if (this.l6 != null) {
         var1.l6 = (RenderingHints)var1.l6.clone();
      }

      return var1;
   }
}
