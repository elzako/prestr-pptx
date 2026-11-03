package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public class l6 {
   private t9 n5;
   private n5 l6;
   private short k5 = 300;
   private Dictionary<i1, Short> u3 = new Dictionary<>();
   private Dictionary<Short, u9> a6 = new Dictionary<>();
   private Dictionary<o0, Short> u9 = new Dictionary<>();
   private Dictionary<String, String> h0 = new Dictionary<>();
   private List<q0> c8 = new List<>();
   private q0 t2;
   private int s7;
   private z1 x8;
   private i1 n3;

   public l6(com.aspose.slides.internal.z0k.t4 var1, t9 var2) {
      this.l6 = new n5(var1);
      this.n5 = var2;
      this.x8 = new z1(this.n5.u3());
   }

   public final void n5(short var1, f2 var2) {
      this.t2 = new q0(this, var1, var2.a6());
   }

   public final void n5(y2 var1) {
      this.t2.n5(var1);
      this.c8.addItem(this.t2);
      this.s7++;
   }

   public final boolean n5(i1 var1) {
      return this.u3.containsKey(var1);
   }

   public final short l6(i1 var1) {
      short var2 = 0;
      Short[] var3 = new Short[]{var2};
      boolean var4 = !this.u3.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2 = this.l6();
         this.u3.set_Item(var1, var2);
      }

      return var2;
   }

   public final u9 k5(i1 var1) {
      short var2 = this.l6(var1);
      u9 var3 = null;
      u9[] var4 = new u9[]{var3};
      boolean var5 = !this.a6.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         var3 = new u9(var1);
         var3.n5(" ");
         this.a6.set_Item(var2, var3);
      }

      return var3;
   }

   public final boolean n5(byte[] var1) {
      return this.u9.containsKey(com.aspose.slides.internal.h3k.a6.n5(var1).k5());
   }

   public final short l6(byte[] var1) {
      o0 var2 = com.aspose.slides.internal.h3k.a6.n5(var1).k5();
      short var3 = 0;
      Short[] var4 = new Short[]{var3};
      boolean var5 = !this.u9.tryGetValue(var2.k5(), var4);
      var3 = var4[0];
      if (var5) {
         var3 = this.l6();
         this.u9.set_Item(var2.k5(), var3);
      }

      return var3;
   }

   public final void n5(com.aspose.slides.internal.e1.u9 var1) {
      String var2 = this.n5(var1.n5().u3());
      this.h0.set_Item(var1.l6(), var2);
      int var3 = this.n5.a6();
      if (var3 > 0 && !var1.k5()) {
         this.x8.n5(var3, var1.l6(), var2);
      }
   }

   public final void n5(com.aspose.slides.internal.e1.j5 var1) {
      String var2 = this.n5(var1.n5().u3());
      int var3 = this.n5.k5();
      if (var1.l6() < var3) {
         this.x8.n5(var1.l6(), var1.k5(), var2);
      }
   }

   public final void n5() {
      this.n3 = com.aspose.slides.internal.e1x.x8.u3().n5(this.n5.m1(), 0, "Arial");
      u9 var1 = this.k5(this.n3);
      n5(this.n5.k7(), var1);
      n5(this.n5.m3(), var1);
      n5(this.n5.z8(), var1);
   }

   public final short l6() {
      return ++this.k5;
   }

   public final void n5(boolean var1) {
      if (var1) {
         h0 var2 = new h0(this);
         var2.n5(this.n3);
         k5 var3 = new k5(this);
         var3.n5();
         this.u3().n5(1, 0);
      }

      for (int var4 = 0; var4 < this.c8.size(); var4++) {
         q0 var5 = this.c8.get_Item(var4);
         var5.n5(var4, var1);
      }
   }

   private static void n5(Dictionary<String, String> var0, u9 var1) {
      Dictionary$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.n5((String)var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private String n5(com.aspose.slides.internal.o9b.w1 var1) {
      return d1.n5(
         "bookmark://internal?page={0}&x={1}&y={2}", this.s7, com.aspose.slides.internal.n2d.t2.t2(var1.l6()), com.aspose.slides.internal.n2d.t2.t2(var1.k5())
      );
   }

   public final t9 k5() {
      return this.n5;
   }

   public final n5 u3() {
      return this.l6;
   }

   public final IGenericList<q0> a6() {
      return this.c8;
   }

   public final q0 u9() {
      return this.t2;
   }

   public final i1 h0() {
      return this.n3;
   }

   public final Dictionary<String, String> c8() {
      return this.h0;
   }

   public final z1 t2() {
      return this.x8;
   }
}
