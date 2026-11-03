package com.aspose.slides.internal.m5l;

import com.aspose.slides.internal.k4o.c8;
import com.aspose.slides.internal.k4o.u9;
import com.aspose.slides.internal.o6t.q0;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.y5s.j5;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;
import java.util.Iterator;

class u3$n5 implements u3$k5 {
   // $VF: synthetic field
   final u3 n5;

   private u3$n5(u3 var1) {
      this.n5 = var1;
   }

   @Override
   public float n5() {
      return com.aspose.slides.internal.t9p.k5.c3 && this.n5.u3() ? 72.0F : this.n5.z3();
   }

   @Override
   public float l6() {
      return com.aspose.slides.internal.t9p.k5.c3 && this.n5.u3() ? 72.0F : this.n5.z3();
   }

   @Override
   public int k5() {
      return (int)u3.n5(this.n5).getWidth();
   }

   @Override
   public int u3() {
      return (int)u3.n5(this.n5).getHeight();
   }

   @Override
   public float a6() {
      return (int)u3.n5(this.n5).getMinX();
   }

   @Override
   public float u9() {
      return (int)u3.n5(this.n5).getMinY();
   }

   @Override
   public j5 h0() {
      try {
         if (u3.l6(this.n5) == null) {
            com.aspose.slides.internal.g1p.n5 var1 = new com.aspose.slides.internal.g1p.n5();
            this.n5(z1.n5(var1), (AffineTransform)null);
            Rectangle2D var2 = var1.n5();
            if (var2 == null) {
               var2 = new Float(0.0F, 0.0F, 1.0F, 1.0F);
            }

            u3.n5(this.n5, new Rectangle((int)(var2.getX() + 0.5), (int)(var2.getY() + 0.5), (int)(var2.getWidth() + 0.5), (int)(var2.getHeight() + 0.5)));
         }

         return new j5(u3.l6(this.n5).x, u3.l6(this.n5).y, u3.l6(this.n5).width, u3.l6(this.n5).height);
      } catch (com.aspose.slides.internal.p7x.l6 var3) {
         return null;
      }
   }

   @Override
   public Float c8() {
      return u3.k5(this.n5);
   }

   @Override
   public Iterator<l6> n5(z1 var1) {
      u3.n5(this.n5, this.n5(var1, (m1)null));
      u3.n5(this.n5, (c8)u3.u3(this.n5).h0());
      return u3.a6(this.n5);
   }

   @Override
   public void l6(z1 var1) {
      u3.u9(this.n5).u3();
      u3.n5(this.n5, (q0)null);
      u3.n5(this.n5, (c8)null);
      if (u3.h0(this.n5) != null) {
         var1.k5(m1.n5(u3.h0(this.n5)));
      }
   }

   @Override
   public void n5(int var1, l6 var2, z1 var3) {
      this.n5.n5(var2, u3.u9(this.n5), u3.a6(this.n5), 0);
   }

   @Override
   public void n5(z1 var1, AffineTransform var2) throws com.aspose.slides.internal.p7x.l6 {
      q0 var3 = this.n5(var1, m1.n5(var2));
      u9 var4 = u3.u3(this.n5).h0();
      var3.n5(u3.u3(this.n5).a6());
      int var5 = 0;

      try {
         while (var4.hasNext()) {
            l6 var6 = var4.next();
            this.n5.n5(var6, var3, var4, var5++);
         }
      } catch (com.aspose.slides.internal.p7x.l6 var10) {
         throw new com.aspose.slides.internal.p7x.l6(
            "Error playing metafile", new com.aspose.slides.internal.p7x.l6("Error rendering record number " + var5, var10)
         );
      } finally {
         var3.u3();
      }
   }

   private q0 n5(z1 var1, m1 var2) {
      q0 var3 = new q0(var1, var2);
      if (!(var1.z8() instanceof com.aspose.slides.internal.g1p.n5)) {
         u3.c8(this.n5);
      }

      var3.q0().u9 = 8;
      var3.q0().m1 = (Rectangle)u3.t2(this.n5).clone();
      var3.q0().z3 = (Rectangle)u3.t2(this.n5).clone();
      var3.n5(true);
      var3.k5(u3.t2(this.n5).getSize());
      var3.u3(
         new Dimension((int)Math.round(u3.t2(this.n5).getWidth() * 25.0 / u3.s7(this.n5)), (int)Math.round(u3.t2(this.n5).getHeight() * 25.0 / u3.x8(this.n5)))
      );
      var3.n5(var3.z3().getWidth() / var3.m1().getWidth());
      var3.l6(var3.z3().getHeight() / var3.m1().getHeight());
      var3.l6(u3.n3(this.n5) / u3.s7(this.n5));
      return var3;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/m5l/u3;Lcom/aspose/slides/internal/m5l/a6;)V -> (Lcom/aspose/slides/internal/m5l/u3;)V
   u3$n5(com.aspose.slides.internal.m5l.u3 recoveredArg0, com.aspose.slides.internal.m5l.a6 recoveredArg1) {
      this(recoveredArg0);
   }
}
