package com.aspose.slides.internal.d0e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class t2 {
   public t2 n5 = null;
   public k5 l6 = new k5();
   public Dictionary<String, String> k5 = new Dictionary<>();
   public Dictionary<String, String> u3 = new Dictionary<>();
   public Dictionary<String, String> a6 = new Dictionary<>();
   private u3 c8;
   public String u9 = d1.n5;
   public int h0 = -1;

   public t2(String var1, k5 var2, t2 var3) {
      this.u9 = var1;
      this.n5 = var3;
      this.l6 = var2;
      this.n5();
      this.c8 = new u3(this);
   }

   public t2() {
      this.n5();
      this.c8 = new u3(this);
   }

   private void n5() {
      this.k5.addItem("stroke-width", "0");
      this.k5.addItem("fill", "black");
   }

   public final void z3() {
      boolean var1 = false;
      Dictionary var2 = l6(this);
      if ((this.l6.n5("stroke") || var2.containsKey("stroke")) && !this.l6.n5("stroke-width") && !var2.containsKey("stroke-width")) {
         this.l6.n5("stroke-width", "1");
      }

      Dictionary$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            var1 = false;
            if (this.l6.n5((String)var4.getKey())) {
               var1 = true;
            } else if (this.l6.n5("style") && var2.containsKey(var4.getKey())) {
               var1 = true;
            }

            if (!var1) {
               this.l6.n5((String)var4.getKey(), (String)var4.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static Dictionary<String, String> l6(t2 var0) {
      Dictionary var1 = new Dictionary();
      if (!var0.l6.n5("style")) {
         return var1;
      }

      String[] var2 = d1.n5(var0.l6.k5("style").toString(), new String[]{";"}, 1);

      for (String var6 : var2) {
         String[] var7 = d1.n5(var6, new String[]{":"}, 1);
         if (var7.length >= 2) {
            var1.addItem(d1.l6(var7[0]), d1.l6(var7[1]));
         }
      }

      return var1;
   }

   public boolean m1() {
      return this.c8.n5() > 0;
   }

   public final String k7() {
      return this.l6.k5("id");
   }

   public final void h0(String var1) {
      this.l6.l6("id", var1);
   }

   public final boolean m3() {
      return com.aspose.slides.internal.v6g.k5.l6(this, com.aspose.slides.internal.d8v.n5.class) ? true : this.n5 != null && this.n5.m3();
   }

   public t2 z8() {
      return this.n5;
   }

   public final u3 j5() {
      return this.c8;
   }

   public final void n5(t2 var1) {
      this.c8.n5(var1);
   }

   public int w1() {
      return com.aspose.slides.internal.a3s.l6.n5(this.l6.k5("clip-rule", "nonzero"));
   }

   public void a6(int var1) {
      this.l6.l6("clip-rule", com.aspose.slides.internal.a3s.l6.n5(var1));
   }

   public int r4() {
      return com.aspose.slides.internal.a3s.l6.n5(this.l6.k5("fill-rule", "nonzero"));
   }

   public void u9(int var1) {
      this.l6.l6("fill-rule", com.aspose.slides.internal.a3s.l6.n5(var1));
   }

   public final void c8(String var1) {
      this.l6.l6("clip-path", var1);
   }

   public final String c4() {
      return this.l6.k5("transform");
   }

   public final void t2(String var1) {
      this.l6.l6("transform", var1);
   }

   public final boolean y2() {
      return this.l6.n5("transform");
   }

   public t2 y1() {
      t2 var1 = com.aspose.slides.internal.d0e.u9.n5(this.u9);
      IGenericEnumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!var1.l6.n5((String)var3.getKey())) {
               var1.l6.n5((String)var3.getKey(), (String)var3.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      Dictionary$Enumerator var40 = this.k5.iterator();

      try {
         while (var40.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var40.next();
            if (!var1.k5.containsKey((String)var4.getKey())) {
               var1.k5.addItem((String)var4.getKey(), (String)var4.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
            var40.dispose();
         }
      }

      Dictionary$Enumerator var41 = this.u3.iterator();

      try {
         while (var41.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var41.next();
            if (!var1.u3.containsKey((String)var5.getKey())) {
               var1.u3.addItem((String)var5.getKey(), (String)var5.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
            var41.dispose();
         }
      }

      Dictionary$Enumerator var42 = this.a6.iterator();

      try {
         while (var42.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var42.next();
            if (!var1.a6.containsKey((String)var6.getKey())) {
               var1.a6.addItem((String)var6.getKey(), (String)var6.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
            var42.dispose();
         }
      }

      var1.n5 = this.n5;
      IGenericEnumerator var43 = this.c8.iterator();

      try {
         while (var43.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var43.next();
            t2 var8 = ((t2)var7.getValue()).y1();
            var8.n5 = var1;
            var1.j5().n5((Integer)var7.getKey(), var8);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }

      return var1;
   }
}
