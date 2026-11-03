package com.aspose.slides.internal.m5l;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.c4i.d2;
import com.aspose.slides.internal.c4i.e5;
import com.aspose.slides.internal.c4t.t9;
import com.aspose.slides.internal.k4o.u9;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.y5s.j5;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D.Float;
import java.io.InputStream;
import java.util.Iterator;

public final class n5 extends k5 {
   private com.aspose.slides.internal.k4o.k5 s7;
   private com.aspose.slides.internal.o6t.l6 x8;
   private com.aspose.slides.internal.k4o.u3 n3;
   private static byte[] y4 = null;

   private n5() {
   }

   public n5(InputStream var1) throws com.aspose.slides.internal.p7x.l6 {
      this();
      this.l6(var1);
   }

   private void l6(InputStream var1) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.z1n.l6 var2 = new com.aspose.slides.internal.z1n.l6();
      var2.n5(var1);

      com.aspose.slides.internal.o3i.l6 var3;
      try {
         var3 = (com.aspose.slides.internal.o3i.l6)var2.n5();
         if (var3.u3 > 0) {
            var2.n5(var3.u3);
         } else {
            var2.n5(16777216);
         }
      } catch (Exception var9) {
         throw new com.aspose.slides.internal.p7x.l6("EMF header not found.");
      }

      this.s7 = new com.aspose.slides.internal.k4o.k5(var3);

      com.aspose.slides.internal.n2z.k5 var4;
      do {
         var4 = var2.n5();
         if (var4 == null) {
            break;
         }

         this.s7.n5(var4);
      } while (!(var4 instanceof com.aspose.slides.internal.o3i.n5));

      this.s7.n5();
      double var5 = var3.t2.getWidth() / var3.s7.getWidth();
      double var7 = var3.t2.getHeight() / var3.s7.getHeight();
      this.k5 = new Float(
         (float)(var3.l6.getX() / 100.0 * var5),
         (float)(var3.l6.getY() / 100.0 * var7),
         (float)Math.ceil(Math.abs(var3.l6.getWidth()) / 100.0 * var5 + 0.5),
         (float)Math.ceil(Math.abs(var3.l6.getHeight()) / 100.0 * var7 + 0.5)
      );
   }

   public com.aspose.slides.internal.o3i.l6 n5() {
      return this.s7.l6();
   }

   public int l6() {
      for (l6 var2 : this.s7.a6()) {
         if (var2 instanceof com.aspose.slides.internal.x1f.n5) {
            com.aspose.slides.internal.x1f.n5 var3 = (com.aspose.slides.internal.x1f.n5)var2;
            if (var3.a6() && var3.u3() != null && !var3.u3().isEmpty()) {
               e5 var4 = var3.u3().get(0);
               if (var4 instanceof d2) {
                  d2 var5 = (d2)var4;
                  int var6 = var5.c8().n5();
                  int var7 = var5.c8().l6();
                  return (var6 << 12) + var7;
               }
            }
            break;
         }
      }

      return this.n5().k5;
   }

   public float k5() {
      d2 var1 = this.s7.k5();
      return var1 != null ? var1.u9() : this.h0();
   }

   public float u3() {
      d2 var1 = this.s7.k5();
      return var1 != null ? var1.h0() : this.c8();
   }

   @Override
   public boolean a6() {
      return false;
   }

   @Override
   public int u9() {
      d2 var1 = this.s7.k5();
      if (var1 != null) {
         return var1.u3() ? 5 : 4;
      } else {
         return 3;
      }
   }

   @Override
   public float h0() {
      return (float)(this.n5().t2.getWidth() / this.n5().s7.getWidth() * 25.4F);
   }

   @Override
   public float c8() {
      return (float)(this.n5().t2.getHeight() / this.n5().s7.getHeight() * 25.4F);
   }

   public j5 t2() {
      return new j5(this.n5().n5.x, this.n5().n5.y, this.n5().n5.width, this.n5().n5.height);
   }

   private AffineTransform q0() {
      int var1 = this.u9();
      boolean var2 = var1 == 3 || this.c8() < com.aspose.slides.internal.r5w.n5.u3() && this.h0() < com.aspose.slides.internal.r5w.n5.a6();
      if (var2) {
         com.aspose.slides.internal.o3i.l6 var3 = this.n5();
         double var4 = var3.t2.getWidth() / var3.s7.getWidth();
         double var6 = var3.t2.getHeight() / var3.s7.getHeight();
         float var8 = (float)(var3.l6.getWidth() / 100.0 * var4);
         float var9 = (float)(var3.l6.getHeight() / 100.0 * var6);
         float var10 = this.y4() / var8;
         float var11 = this.e2() / var9;
         return AffineTransform.getScaleInstance(var10, var11);
      } else {
         return new AffineTransform();
      }
   }

   private com.aspose.slides.internal.o6t.l6 l6(z1 var1, AffineTransform var2) {
      AffineTransform var3 = this.q0();
      if (var2 == null) {
         var2 = var3;
      } else {
         var2.preConcatenate(var3);
      }

      return new com.aspose.slides.internal.o6t.l6(var1, m1.n5(var2));
   }

   @Override
   public Iterator<l6> n5(z1 var1) {
      this.x8 = this.l6(var1, null);
      this.n3 = (com.aspose.slides.internal.k4o.u3)this.s7.u3();
      return this.n3;
   }

   @Override
   public void l6(z1 var1) {
      this.x8.u3();
      this.x8 = null;
      this.n3 = null;
   }

   @Override
   public void n5(int var1, l6 var2, z1 var3) {
      this.n5(var2, this.x8, this.n3, 0);
   }

   @Override
   public void n5(z1 var1, AffineTransform var2) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.o6t.l6 var3 = new com.aspose.slides.internal.o6t.l6(var1, m1.n5(var2));
      u9 var4 = this.s7.u3();
      byte var5 = 0;

      try {
         int var6 = 0;

         while (var4.hasNext()) {
            l6 var7 = var4.next();
            this.n5(var7, var3, var4, var6++);
         }
      } catch (com.aspose.slides.internal.p7x.l6 var11) {
         throw new com.aspose.slides.internal.p7x.l6(
            "Error playing metafile", new com.aspose.slides.internal.p7x.l6("Error rendering record number " + var5, var11)
         );
      } finally {
         var3.u3();
      }

      if (var3.z3 != null) {
         int var13 = var3.z3.size();
         this.u3 = new t9[var13];

         for (int var14 = 0; var14 < var13; var14++) {
            this.u3[var14] = var3.z3.get(var14);
         }
      }
   }

   public Iterator<l6> s7() {
      return this.s7.u3();
   }

   @Override
   public void n5(l6 var1) {
      throw new NotImplementedException();
   }
}
