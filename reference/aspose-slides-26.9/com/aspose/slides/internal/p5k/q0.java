package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class q0 extends d2 {
   private Dictionary<Short, com.aspose.slides.internal.e1.z1> n5 = new Dictionary<>();
   private Dictionary<Short, com.aspose.slides.internal.e1.r4> l6 = new Dictionary<>();
   private Dictionary<Short, y2> k5 = new Dictionary<>();
   private List<i1> u3 = new List<>();
   private Dictionary<Short, byte[]> a6 = new Dictionary<>();
   private Dictionary<Short, com.aspose.slides.internal.e1.m1> u9 = new Dictionary<>();
   private short h0;
   private int c8;
   private int t2;

   public q0(l6 var1, short var2, f2 var3) {
      super(var1);
      this.h0 = var2;
      this.c8 = com.aspose.slides.internal.n2d.t2.t2(var3.l6());
      this.t2 = com.aspose.slides.internal.n2d.t2.t2(var3.k5());
   }

   public final void n5(int var1, boolean var2) {
      h0 var3 = new h0(this.h0());
      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            i1 var5 = (i1)var4.next();
            var3.n5(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      n3 var45 = new n3(this.h0());
      Dictionary$Enumerator var6 = this.a6.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            var45.n5(com.aspose.slides.internal.v6g.k5.k5(var7.getValue(), byte[].class), (Short)var7.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      a0 var46 = new a0(this.h0());
      Dictionary$Enumerator var8 = this.n5.iterator();

      try {
         while (var8.hasNext()) {
            KeyValuePair var9 = (KeyValuePair)var8.next();
            var46.n5((com.aspose.slides.internal.e1.z1)var9.getValue(), (Short)var9.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      c4 var47 = new c4(this.h0());
      Dictionary$Enumerator var10 = this.l6.iterator();

      try {
         while (var10.hasNext()) {
            KeyValuePair var11 = (KeyValuePair)var10.next();
            var47.n5((com.aspose.slides.internal.e1.r4)var11.getValue(), (Short)var11.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }

      Dictionary$Enumerator var48 = this.k5.iterator();

      try {
         while (var48.hasNext()) {
            KeyValuePair var12 = (KeyValuePair)var48.next();
            y2 var13 = (y2)var12.getValue();
            var13.n5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
            var48.dispose();
         }
      }

      String var49 = d1.n5("page{0:D9}", new Object[]{var1});
      if (var2) {
         this.n5(var49, this.h0);
      } else {
         m3 var50 = new m3(this.h0, null, (short)(var1 + 1), var49);
         z8 var14 = new z8(this.h0());
         var14.n5(var50);
      }

      this.u9().n5(1, 0);
   }

   public final short n5(com.aspose.slides.internal.e1.z1 var1) {
      i1 var2 = var1.l6().n5();
      if (!this.h0().n5(var2)) {
         this.u3.addItem(var2);
      }

      u9 var3 = this.h0().k5(var2);
      var3.n5(var1.x8());
      short var4 = this.h0().l6();
      this.n5.addItem(var4, var1);
      return var4;
   }

   public final short n5(com.aspose.slides.internal.e1.r4 var1) {
      short var2 = this.h0().l6();
      this.l6.addItem(var2, var1);
      if (var1.k5() != null) {
         this.n5(var1.k5());
      }

      if (var1.l6() != null && var1.l6().u9() != null) {
         this.n5(var1.l6().u9());
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.w0.l6 var1) {
      switch (var1.n5()) {
         case 1:
            this.n5(com.aspose.slides.internal.s5.u9.n5((com.aspose.slides.internal.w0.a6)var1));
            break;
         case 2:
            this.n5(((com.aspose.slides.internal.w0.y4)var1).l6());
      }
   }

   public final void n5(byte[] var1) {
      if (!this.h0().n5(var1)) {
         short var2 = this.h0().l6(var1);
         var1 = x8.n5(var1, this.h0().k5().r4());
         this.a6.set_Item(var2, var1);
      }
   }

   public final void n5(y2 var1) {
      this.k5.addItem(var1.l6(), var1);
   }

   public final void n5(short var1, com.aspose.slides.internal.e1.m1 var2) {
      this.u9.set_Item(var1, var2);
   }

   private void n5(String var1, short var2) {
      y1 var3 = new y1(this.h0());
      var3.n5();
      this.u9().k5(1);
      this.u9().n5(var1);
      String var4 = com.aspose.slides.ms.System.z3.n5(w1.l6());
      String var5 = com.aspose.slides.ms.System.z3.n5(com.aspose.slides.internal.l7h.j5.z3().u3("TemplatePages"));
      String var6 = com.aspose.slides.ms.System.z3.n5(com.aspose.slides.internal.l7h.j5.z3().u3(var1));
      var4 = d1.n5(var4, d1.l6(var5, 0, var5.length() - 2), d1.l6(var6, 0, var6.length() - 2));
      this.u9().n5(com.aspose.slides.ms.System.z3.s7(var4));
      var3.n5(82);
      var3.n5();
      this.u9().l6(1);
      this.u9().l6(var2);
      this.u9().n5(var1);
      var3.n5(76);
   }

   public final int n5() {
      return this.c8;
   }

   public final int l6() {
      return this.t2;
   }

   public final Dictionary<Short, com.aspose.slides.internal.e1.m1> k5() {
      return this.u9;
   }
}
