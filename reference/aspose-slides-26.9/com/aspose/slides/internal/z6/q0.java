package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public abstract class q0 extends a6 {
   protected com.aspose.slides.internal.v0.h0 x8;
   protected com.aspose.slides.internal.v0.z1 n3 = null;
   protected List<Object> y4 = null;

   public q0(com.aspose.slides.internal.y1.u3 var1) {
      super(var1);
   }

   public final void l6(List<Object> var1) {
      if (this.y4 == null) {
         this.k5(var1);
      } else {
         this.y4.addRange(var1);
      }
   }

   public final void k5(List<Object> var1) {
      this.y4 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.v0.h0 var1) {
      this.x8 = var1;
      com.aspose.slides.internal.v0.c8 var2 = this.l6.a6().z3();
      com.aspose.slides.internal.v0.n3[] var3 = new com.aspose.slides.internal.v0.n3[]{new com.aspose.slides.internal.f0.l6(var2.n5())};
      var2.n5(this.t9(), var3);
   }

   protected final com.aspose.slides.internal.v0.u3 n5(com.aspose.slides.internal.a0.l6 var1) {
      com.aspose.slides.internal.v0.s7 var2 = (com.aspose.slides.internal.v0.s7)var1.a6(3);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1.a6(4), int.class);
      return this.x8.n5(var2, var3, var2.a6());
   }

   protected final k7 y4() {
      return new k7(this, this.c8());
   }

   protected k7 n5(int var1, int var2, int var3, int var4, Dictionary<com.aspose.slides.internal.o0.l6, String> var5) {
      k7 var6 = this.y4();
      var6.n5(this.l6);
      var6.n5("width", var3);
      var6.n5("height", var4);
      var6.n5("xpos", var1);
      var6.n5("ypos", var2);
      var6.n5("pageViewport", this.x8());
      if (var5 != null) {
         var6.n5("foreign-attributes", var5);
      }

      return var6;
   }

   public final void n5(XmlDocument var1, String var2, y1 var3, Dictionary<com.aspose.slides.internal.o0.l6, String> var4) {
      int var5 = this.u3 + com.aspose.slides.internal.v6g.k5.u3(var3.x8(), 13);
      int var6 = this.k5.n5() + com.aspose.slides.internal.v6g.k5.u3(var3.n3(), 13);
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var3.s7(), 13);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13);
      k7 var9 = this.n5(var5, var6, var7, var8, var4);
      this.n5(var9, var1, var2);
   }

   public final com.aspose.slides.internal.v0.z1 e2() {
      if (this.n3 == null) {
         this.n3 = new c8(super.l6);
      }

      return this.n3;
   }

   public final com.aspose.slides.internal.v0.h0 t9() {
      return this.x8;
   }
}
