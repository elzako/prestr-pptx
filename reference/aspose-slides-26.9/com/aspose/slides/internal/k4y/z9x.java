package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z9x extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private List<s4z> u3;
   private List<i3p> a6;
   private List<l5u> u9;
   private List<z9x> h0;
   private List<o3x> c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "xml:id", "contextRef", "brushRef", "annotationXML", "annotation", "traceView", "traceGroup", "trace"
   );

   public z9x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      z9x$1 var2 = new z9x$1(this);
      n5(var1, var2);
      n5(var1, new z9x$2(this, var1));
   }

   public z9x() {
      this.s7();
   }

   private void s7() {
      this.u3 = new List<>();
      this.a6 = new List<>();
      this.u9 = new List<>();
      this.h0 = new List<>();
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("contextRef", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("brushRef", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            s4z var5 = (s4z)var4.next();
            var5.n5("inkml", var2, "annotationXML");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var41 = this.a6.iterator();

      try {
         while (var41.hasNext()) {
            i3p var6 = (i3p)var41.next();
            var6.n5("inkml", var2, "annotation");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
            var41.dispose();
         }
      }

      List$Enumerator var42 = this.u9.iterator();

      try {
         while (var42.hasNext()) {
            l5u var7 = (l5u)var42.next();
            var7.n5("inkml", var2, "traceView");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
            var42.dispose();
         }
      }

      List$Enumerator var43 = this.h0.iterator();

      try {
         while (var43.hasNext()) {
            z9x var8 = (z9x)var43.next();
            var8.n5("inkml", var2, "traceGroup");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }

      List$Enumerator var44 = this.c8.iterator();

      try {
         while (var44.hasNext()) {
            o3x var9 = (o3x)var44.next();
            var9.n5("inkml", var2, "trace");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var44, IDisposable.class)) {
            var44.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(s4z var1) {
      this.u3.addItem(var1);
   }

   public final void n5(i3p var1) {
      this.a6.addItem(var1);
   }

   public final void n5(l5u var1) {
      this.u9.addItem(var1);
   }

   public final void n5(z9x var1) {
      this.h0.addItem(var1);
   }

   public final void n5(o3x var1) {
      this.c8.addItem(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final s4z[] u3() {
      return this.u3.toArray(new s4z[0]);
   }

   public final i3p[] a6() {
      return this.a6.toArray(new i3p[0]);
   }

   public final l5u[] u9() {
      return this.u9.toArray(new l5u[0]);
   }

   public final z9x[] h0() {
      return this.h0.toArray(new z9x[0]);
   }

   public final o3x[] c8() {
      return this.c8.toArray(new o3x[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(z9x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(z9x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(z9x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List l6(z9x var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static List k5(z9x var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static List u3(z9x var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static List a6(z9x var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static List u9(z9x var0) {
      return var0.c8;
   }
}
