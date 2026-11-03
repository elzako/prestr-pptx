package com.aspose.slides.internal.u3r;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public final class t2 extends h0 {
   private u3 u9;
   private k5 h0;
   private u9 c8;
   private n5 t2;
   private a6 s7;

   public t2(String var1) {
      this(var1, true);
   }

   public t2(String var1, boolean var2) {
      super(var1, var2);
      this.k5();
   }

   private void k5() {
      this.u9 = new n3();
      this.h0 = new x8();
      this.c8 = new t9();
      this.t2 = new c8();
      this.s7 = new y4(this.t2);
   }

   @Override
   protected com.aspose.slides.internal.t6q.s7 l6() {
      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      var1.loadXml(this.n5);
      com.aspose.slides.internal.t6q.a6 var2 = null;

      try {
         var2 = this.h0.n5(var1, this.k5);
      } catch (RuntimeException var15) {
      }

      com.aspose.slides.internal.t6q.n3 var3 = null;

      try {
         var3 = this.c8.n5(var1);
      } catch (RuntimeException var14) {
      }

      com.aspose.slides.internal.t6q.u9 var4 = null;
      if (this.u9.n5(var1)) {
         var4 = this.u9.l6(var1);
      }

      com.aspose.slides.internal.t6q.x8 var5 = this.t2.n5(var1);
      if (var5 == null) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Invalid XMP structure. Rdf root not found. XMP: {0}", new Object[]{this.n5}));
      }

      com.aspose.slides.internal.t6q.c8 var6 = this.s7.n5(var1);
      com.aspose.slides.internal.t6q.s7 var7 = new com.aspose.slides.internal.t6q.s7();
      var7.n5(var2);
      var7.n5(var4);
      var7.n5(var3);
      var7.n5(var5);
      IGenericEnumerator var8 = var6.iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.t6q.h0 var9 = (com.aspose.slides.internal.t6q.h0)var8.next();
            var7.n5(var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      return var7;
   }
}
