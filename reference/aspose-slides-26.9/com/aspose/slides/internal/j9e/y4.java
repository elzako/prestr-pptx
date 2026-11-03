package com.aspose.slides.internal.j9e;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.o9b.y1;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public final class y4 extends com.aspose.slides.internal.o9b.t4 {
   private com.aspose.slides.internal.m5l.k5 u3;
   boolean n5 = false;
   private z3 a6 = null;

   private y4(com.aspose.slides.internal.m5l.k5 var1) {
      this.u3 = var1;
   }

   public y4(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentException("stream");
      }

      if (var1.getLength() == 0L) {
         throw new ExternalException("stream");
      }

      try {
         this.u3 = com.aspose.slides.internal.m5l.k5.n5(var1.toInputStream());
      } catch (com.aspose.slides.internal.p7x.l6 var3) {
         throw new ArgumentException(var3.getMessage(), var3);
      }
   }

   public y4(String var1) {
      if (var1 == null) {
         throw new ArgumentException("filename");
      }

      try {
         this.u3 = com.aspose.slides.internal.m5l.k5.n5(var1);
      } catch (Throwable var3) {
         throw new ExternalException(var3.getMessage(), var3);
      }
   }

   @Override
   public z3 a6() {
      if (this.a6 == null) {
         c8 var1 = c8.k5();
         x8 var2 = this.u3.a6() ? x8.n3() : x8.u3();
         this.a6 = new z3(
            (Image)this.u3.z1(),
            null,
            var2,
            this.u3.a6() ? ((com.aspose.slides.internal.m5l.u3)this.u3).q0() : this.c8(),
            this.u3.a6() ? ((com.aspose.slides.internal.m5l.u3)this.u3).q0() : this.y4(),
            var1
         );
      }

      return this.a6;
   }

   @Override
   public int h0() {
      return this.u3.e2();
   }

   @Override
   public int e2() {
      return this.u3.y4();
   }

   @Override
   public y1 n5(int[] var1) {
      return new y1(this.u3.x8(), this.u3.n3(), this.e2(), this.h0());
   }

   @Override
   public float c8() {
      return this.u3.h0();
   }

   @Override
   public float y4() {
      return this.u3.c8();
   }

   public e2 n5() {
      return new e2(this.u3);
   }

   public IEnumerator<com.aspose.slides.internal.m5l.l6> n5(com.aspose.slides.internal.o9b.z1 var1) {
      Iterator var2 = this.u3.n5(var1);
      return new y4$n5(var2);
   }

   public void l6(com.aspose.slides.internal.o9b.z1 var1) {
      this.u3.l6(var1);
   }

   public void n5(int var1, com.aspose.slides.internal.m5l.l6 var2, com.aspose.slides.internal.o9b.z1 var3) {
      if (var1 != var2.n5()) {
         throw new ArgumentException("wrong record type");
      }

      this.u3.n5(var1, var2, var3);
   }

   public void n5(com.aspose.slides.internal.o9b.z1 var1, AffineTransform var2) {
      try {
         this.u3.n5(var1, var2);
      } catch (com.aspose.slides.internal.p7x.l6 var4) {
         throw new ArgumentException(var4.getMessage());
      }
   }

   @Override
   public Object deepClone() {
      return new y4((com.aspose.slides.internal.m5l.k5)this.u3.clone());
   }

   @Override
   protected void n5(ImageOutputStream var1, com.aspose.slides.internal.z0k.t4 var2, com.aspose.slides.internal.t5g.n5 var3, h0 var4) {
      x8 var5 = var3.s7();
      if (var5.l6()) {
         throw new NotImplementedException();
      }

      try {
         RenderedImage var6 = this.u3.z1();
         ImageWriter var7 = var3.l6();
         if (!var3.s7().equals(x8.u9()) && !var3.s7().equals(x8.x8()) && !var3.s7().equals(x8.c8()) && !var3.s7().equals(x8.s7())) {
            var7.setOutput(var1);
         } else {
            var7.setOutput(var2);
         }

         var7.write(var6);
      } catch (IOException var8) {
         throw new com.aspose.slides.exceptions.IOException(var8.getMessage(), var8);
      }
   }

   @Override
   public x8 x8() {
      x8 var1 = x8.n3();
      if (this.u3.a6()) {
         if (this.u3 instanceof com.aspose.slides.internal.m5l.u3 && !((com.aspose.slides.internal.m5l.u3)this.u3).l6()) {
            var1 = x8.u3();
         }
      } else {
         var1 = x8.u3();
      }

      return new x8(var1.n5());
   }

   @Override
   protected int l6() {
      return this.u3.t4();
   }

   public void n5(com.aspose.slides.internal.m5l.l6 var1) {
      this.u3.n5(var1);
   }

   public com.aspose.slides.internal.m5l.k5 k5() {
      return this.u3;
   }

   @Override
   public u3 t2() {
      throw new ExternalException();
   }
}
