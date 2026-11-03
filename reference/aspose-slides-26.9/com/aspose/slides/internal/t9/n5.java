package com.aspose.slides.internal.t9;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import java.util.Iterator;

public class n5 {
   private final String n5;
   private int l6;
   private int k5;
   private final List<String> u3;
   private String a6;
   private String u9;
   private float h0;
   private float c8;
   private final List<n5$n5> t2;
   private String s7;
   private c8 x8;
   private static final com.aspose.slides.internal.r7c.c8 n3 = new com.aspose.slides.internal.r7c.c8("\\\\([\\n\\r\\f0-9a-fA-F]{2,6})", 0);

   public n5(String var1) {
      this.n5 = var1;
      this.k5 = 1;
      this.u3 = new List<>();
      this.h0 = Float.NEGATIVE_INFINITY;
      this.c8 = Float.POSITIVE_INFINITY;
      this.t2 = new List<>();
   }

   public final void n5(c8 var1) {
      this.x8 = var1;
   }

   public final String n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final void n5(String... var1) {
      for (String var5 : var1) {
         this.u3.addItem(this.u3(var5));
      }
   }

   private String u3(String var1) {
      a5 var2 = new a5();
      Iterator var3 = n3.k5(var1).iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.r7c.u3 var4 = (com.aspose.slides.internal.r7c.u3)var3.next();
            var2.n5((char)a3.n5(d1.k5(var4.k5(), 1), 515));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      return var2.toString();
   }

   public final List<String> u3() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final void n5(float var1) {
      this.h0 = var1;
   }

   public final void n5(Object... var1) {
      IEnumerator var2 = com.aspose.slides.ms.System.u3.n5((Object)(var1)).iterator();

      while (var2.hasNext()) {
         int var3 = com.aspose.slides.internal.v6g.k5.u3(var2.next(), int.class);
         var2.hasNext();
         String var4 = this.u3((String)var2.next());
         this.t2.addItem(new n5$n5(var3, var4));
      }
   }

   public final List<n5$n5> a6() {
      return this.t2;
   }

   public final void k5(String var1) {
      this.s7 = var1;
   }

   public final com.aspose.slides.internal.z1.k5 u9() {
      return com.aspose.slides.internal.z1.k5.n5(this);
   }

   public final com.aspose.slides.internal.z1.k5 h0() {
      return d1.n5(this.s7) ? this.x8.n5("decimal").u9() : this.x8.n5(this.s7).u9();
   }
}
