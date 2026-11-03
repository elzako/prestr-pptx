package com.aspose.slides.internal.z4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class y1 {
   private final c8 n5;
   private final SortedList<String, com.aspose.slides.internal.c0.l6> l6 = new com.aspose.slides.internal.n2d.m3<>();
   private final SortedList<String, com.aspose.slides.internal.f1s.s7> k5 = new com.aspose.slides.internal.n2d.m3<>();
   private final SortedList<String, com.aspose.slides.internal.f1s.k5> u3 = new com.aspose.slides.internal.n2d.m3<>();
   private final SortedList<Integer, com.aspose.slides.internal.k0t.l6> a6 = new SortedList<>();
   private final com.aspose.slides.internal.f1s.x8 u9 = new com.aspose.slides.internal.f1s.x8();
   private final List<String> h0 = new List<>();
   private static final Dictionary<Integer, y2> c8 = new Dictionary<>();

   public y1(c8 var1) {
      this.n5 = var1;
   }

   public final int n5(int var1) {
      return this.u3(var1).size();
   }

   public final com.aspose.slides.internal.c0.l6 n5(com.aspose.slides.internal.p1s.l6 var1, boolean var2, int var3) {
      byte var4;
      if (var1.n5().c4()) {
         if (var1.n5().y2()) {
            var4 = 0;
         } else {
            var4 = 1;
         }
      } else if (var2) {
         var4 = 2;
      } else {
         var4 = 3;
      }

      String var5 = n5(var1.h0(), var1.l6(), var4);
      com.aspose.slides.internal.c0.l6 var6 = null;
      com.aspose.slides.internal.c0.l6[] var7 = new com.aspose.slides.internal.c0.l6[]{var6};
      boolean var8 = !this.l6.tryGetValue(var5, var7);
      var6 = var7[0];
      if (var8) {
         var6 = com.aspose.slides.internal.c0.l6.n5(this.n5, var1.l6(), var1.n5(), var4, var3);
         this.l6.set_Item(var5, var6);
      }

      return var6;
   }

   private static String n5(String var0, int var1, int var2) {
      return d1.n5("{0}-{1}-{2}",new Object[]{ var0, var1, var2});
   }

   public final com.aspose.slides.internal.f1s.s7 n5(com.aspose.slides.internal.w0.l6 var1, com.aspose.slides.internal.w0.c8 var2) {
      com.aspose.slides.internal.f1s.s7 var3;
      if (com.aspose.slides.internal.f1s.x8.n5(var1)) {
         if (!this.u9.n5(var1, var2)) {
            var3 = com.aspose.slides.internal.f1s.s7.n5(var1, this.n5);
            this.k5.set_Item(var3.x8(), var3);
            this.u9.n5(var1, var3, var2);
         } else {
            var3 = this.u9.l6(var1, var2);
         }
      } else {
         var3 = com.aspose.slides.internal.f1s.s7.n5(var1, this.n5);
         this.k5.set_Item(var3.x8(), var3);
      }

      if (!this.h0.containsItem(var3.x8())) {
         this.h0.addItem(var3.x8());
      }

      return var3;
   }

   public final void n5() {
      this.u9.n5();
   }

   public final com.aspose.slides.internal.f1s.k5 n5(float var1, float var2, boolean var3) {
      if (this.n5.e2() && !var3) {
         var1 = 1.0F;
         var2 = 1.0F;
      }

      com.aspose.slides.internal.f1s.k5 var4 = null;
      IGenericEnumerator var5 = this.u3.getValues().iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.f1s.k5 var6 = (com.aspose.slides.internal.f1s.k5)var5.next();
            if (var6.n5() == var1 && var6.l6() == var2) {
               var4 = var6;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var4 == null) {
         var4 = new com.aspose.slides.internal.f1s.k5(this.n5);
         var4.n5(var1);
         var4.l6(var2);
         this.u3.set_Item(var4.x8(), var4);
      }

      return var4;
   }

   public final com.aspose.slides.internal.k0t.l6 n5(byte[] var1, com.aspose.slides.internal.s5.c8 var2, com.aspose.slides.internal.s5.a6 var3) {
      int var4 = com.aspose.slides.internal.s5.c8.n5(var1, var2, var3);
      com.aspose.slides.internal.k0t.l6 var5 = null;
      com.aspose.slides.internal.k0t.l6[] var6 = new com.aspose.slides.internal.k0t.l6[]{var5};
      boolean var7 = !this.n5.k5().a6.tryGetValue(var4, var6);
      var5 = var6[0];
      if (var7) {
         var5 = new com.aspose.slides.internal.k0t.l6(this.n5, var1, var2, var3);
         this.n5.k5().a6.set_Item(var4, var5);
      }

      this.a6.set_Item(var4, var5);
      return var5;
   }

   public final void n5(t4 var1) {
      this.n5(1, var1);
      this.n5(2, this.l6(), var1);
      this.h0.clear();
      this.n5(3, var1);
      this.n5(4, var1);
   }

   public final void l6(t4 var1) {
      this.n5(1, var1);
      this.n5(2, var1);
      this.n5(3, var1);
      this.n5(4, var1);
   }

   public final void k5(t4 var1) {
      this.n5(this.l6.getValues(), var1);
      this.l6.clear();
      this.n5(this.k5.getValues(), var1);
      this.k5.clear();
      this.n5(this.u3.getValues(), var1);
      this.u3.clear();
      this.n5(this.a6.getValues(), var1);
      this.a6.clear();
   }

   private void n5(int var1, t4 var2) {
      IGenericList var3 = this.u3(var1);
      this.n5(var1, var3, var2);
   }

   private void n5(int var1, IGenericList<z1> var2, t4 var3) {
      if (var2.size() != 0) {
         var3.n5("/{0}", l6(var1));
         var3.c8();
         IGenericEnumerator var4 = var2.iterator();

         try {
            while (var4.hasNext()) {
               z1 var5 = (z1)var4.next();
               var3.k5(d1.n5("/{0}", new Object[]{var5.x8()}), var5.t2());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var3.t2();
      }
   }

   private <TValue extends z1> void n5(IGenericList<TValue> var1, t4 var2) {
      if (var1.size() != 0) {
         for (int var3 = 0; var3 < var1.size(); var3++) {
            z1 var4 = (z1)var1.get_Item(var3);
            if (this.n5.l6().w1() && var4 instanceof com.aspose.slides.internal.k0t.l6) {
               com.aspose.slides.internal.k9.h0 var5 = ((com.aspose.slides.internal.k0t.l6)var4).l6();
               var4.n5(var2);
               this.n5(var1, var5, (com.aspose.slides.internal.k0t.l6)var4, var3);
            } else {
               var4.n5(var2);
            }
         }
      }
   }

   private <TValue extends z1> void n5(IGenericList<TValue> var1, com.aspose.slides.internal.k9.h0 var2, com.aspose.slides.internal.k0t.l6 var3, int var4) {
      int var5 = 0;

      for (int var6 = var4; var6 < var1.size(); var6++) {
         com.aspose.slides.internal.k0t.l6 var7 = (com.aspose.slides.internal.k0t.l6)var1.get_Item(var6);
         if (var2.equals(var7.l6())) {
            var5++;
         }
      }

      if (var5 < 2) {
         var3.n5();
      }
   }

   public static String l6(int var0) {
      return c8.get_Item(var0).n5;
   }

   public static String k5(int var0) {
      return c8.get_Item(var0).l6;
   }

   private <TValue extends z1> IGenericList<z1> n5(IGenericList<TValue> var1) {
      List var2 = new List(var1.size());
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            z1 var4 = (z1)var3.next();
            var2.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private IGenericList<z1> u3(int var1) {
      switch (var1) {
         case 1:
            return this.n5(this.l6.getValues());
         case 2:
            return this.n5(this.k5.getValues());
         case 3:
            return this.n5(this.u3.getValues());
         case 4:
            return this.n5(this.a6.getValues());
         default:
            throw new InvalidOperationException("Unknown resource type.");
      }
   }

   private IGenericList<z1> l6() {
      List var1 = new List();
      List$Enumerator var2 = this.h0.iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.addItem(this.k5.get_Item(var3));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   static {
      c8.addItem(1, new y2("Font", "F"));
      c8.addItem(2, new y2("Pattern", "P"));
      c8.addItem(3, new y2("ExtGState", "GS"));
      c8.addItem(4, new y2("XObject", "X"));
   }
}
