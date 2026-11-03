package com.aspose.slides.internal.d8v;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class h0 extends com.aspose.slides.internal.d0e.a6 {
   public h0() {
      this.u9 = "use";
   }

   public final com.aspose.slides.internal.b3z.a6 a0() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("x"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("x", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 d2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("y", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("width"), com.aspose.slides.internal.b3z.a6.l6(100.0F));
   }

   public final void u3(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("width", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("height"), com.aspose.slides.internal.b3z.a6.l6(100.0F));
   }

   public final void a6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("height", var1.toString());
   }

   public final String p8() {
      String var1 = null;
      IGenericEnumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (d1.k5((String)var3.getKey(), ":href")) {
               var1 = (String)var3.getValue();
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final void s7(String var1) {
      this.l6.l6("xlink:href", var1);
   }

   public final String f2() {
      return this.l6.k5("href");
   }

   public final void x8(String var1) {
      this.l6.l6("href", var1);
   }

   public final void n5(com.aspose.slides.internal.b3z.k5 var1) {
      this.l6.l6("preserveAspectRatio", var1.toString());
   }

   public final void n3(String var1) {
      this.x8(var1);
      this.s7(var1);
   }

   public final t2 n5(x8 var1) {
      t2 var2 = com.aspose.slides.internal.d0e.u9.n5("g");
      t2 var3 = com.aspose.slides.internal.d0e.u9.n5("g");
      String var4 = this.f2();
      if (var4 == null) {
         var4 = this.p8();
      }

      String var5 = var4;
      if (var5 == null) {
         return var3;
      }

      t2 var6 = var1.n5(var5);
      if (var6 == null) {
         return var3;
      }

      List var7 = new List();
      var7.addItem("id");
      var7.addItem("x");
      var7.addItem("y");
      var7.addItem("width");
      var7.addItem("height");
      IGenericEnumerator var8 = this.l6.iterator();

      try {
         while (var8.hasNext()) {
            KeyValuePair var9 = (KeyValuePair)var8.next();
            if (!d1.k5((String)var9.getKey(), "href") && !var7.containsItem(var9.getKey())) {
               var3.l6.n5((String)var9.getKey(), (String)var9.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var6, u9.class)) {
         t2 var19 = com.aspose.slides.internal.d0e.u9.n5("svg");
         var19.l6 = var6.l6;
         var19.l6.l6("x", this.a0().toString());
         var19.l6.l6("y", this.d2().toString());
         var19.l6.l6("width", this.d5().toString());
         var19.l6.l6("height", this.s3().toString());
         IGenericEnumerator var10 = var6.j5().iterator();

         try {
            while (var10.hasNext()) {
               KeyValuePair var11 = (KeyValuePair)var10.next();
               var19.j5().n5((Integer)var11.getKey(), (t2)var11.getValue());
               ((t2)var11.getValue()).n5 = var19;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         var3.j5().l6(0, var19);
         var19.n5 = var3;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var6, a6.class)) {
         var6.l6.l6("x", this.a0().toString());
         var6.l6.l6("y", this.d2().toString());
         var6.l6.l6("width", this.d5().toString());
         var6.l6.l6("height", this.s3().toString());
         var3.j5().l6(0, var6);
         var6.n5 = var3;
      } else {
         String var20 = d1.n5("translate({0}, {1})",new Object[]{ this.a0(), this.d2()});
         if (d1.n5(var3.l6.k5("transform"))) {
            var3.l6.n5("transform", var20);
         } else {
            var3.l6.l6("transform", d1.n5(new String[]{var3.l6.k5("transform"), " ", var20}));
         }

         var3.j5().l6(0, var6);
         var6.n5 = var3;
      }

      var3.n5 = var2;
      var2.n5 = this.n5;
      var2.j5().l6(0, var3);
      if (!d1.n5(this.k7()) && var1.l6().containsKey(this.k7())) {
         var1.l6().set_Item(this.k7(), var3);
      }

      return var2;
   }
}
