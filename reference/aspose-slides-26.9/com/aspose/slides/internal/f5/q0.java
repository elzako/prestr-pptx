package com.aspose.slides.internal.f5;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class q0 extends r4 implements com.aspose.slides.internal.j3.q0 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private y1<r4> a6;
   private y1<r4> u9;

   public q0(String var1, String var2, String var3, String var4, z1 var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final String n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.j3.m3 l6() {
      if (this.a6 == null) {
         this.a6 = new y1<>(this);
      }

      return this.a6;
   }

   public final com.aspose.slides.internal.j3.m3 k5() {
      if (this.u9 == null) {
         this.u9 = new y1<>(this);
      }

      return this.u9;
   }

   @Override
   public final String u3() {
      return this.l6;
   }

   @Override
   public final String a6() {
      return this.k5;
   }

   public final String u9() {
      return this.u3;
   }

   @Override
   public String h0() {
      return this.n5();
   }

   @Override
   public byte n3() {
      return 10;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      return this.y4().n5(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("<!DOCTYPE {0}",new Object[]{ this.n5});
      if (!d1.n5(this.l6)) {
         var1.n5(" PUBLIC \"{0}\"",new Object[]{ this.l6});
      }

      if (!d1.n5(this.k5)) {
         var1.n5(" SYSTEM \"{0}\"",new Object[]{ this.k5});
      }

      var1.n5(">");
      return var1.toString();
   }
}
