package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public abstract class n3 implements r4 {
   private t9 n5;
   private final Object l6 = new Object();
   private List<byte[]> k5;
   private List<String> u3;
   private boolean a6 = true;

   public final String[] a6() {
      return this.u3 == null ? new String[0] : (String[])this.u3.toArray(new String[0]);
   }

   public final boolean u9() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public abstract z3[] k5();

   public abstract i1 l6(String var1, int var2);

   public abstract i1 n5(int var1);

   public final void h0() {
      if (this.n5 != null) {
         this.n5.k5();
      }
   }

   public final t9 c8() {
      this.x8();
      return this.n5;
   }

   protected n3(String[] var1, byte[][] var2) {
      this.n5 = null;
      this.n5(new List<String>());
      if (var1 != null) {
         this.t2().addRange(com.aspose.slides.ms.System.u3.n5(var1));
      }

      this.l6(new List<byte[]>());
      if (var2 != null) {
         this.s7().addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5(var2, 1, true)));
      }
   }

   protected void u3() {
      this.n5 = null;
   }

   protected void l6(byte[] var1) {
   }

   protected void l6(String var1) {
   }

   protected final List<String> t2() {
      return this.u3;
   }

   protected final void n5(List<String> var1) {
      this.u3 = var1;
   }

   protected final List<byte[]> s7() {
      return this.k5;
   }

   protected final void l6(List<byte[]> var1) {
      this.k5 = var1;
   }

   protected final void x8() {
      if (this.n5 == null) {
         synchronized (this.l6) {
            if (this.n5 == null) {
               List var2 = new List();
               this.n5((IGenericCollection<z1>)var2);
               this.l6((IGenericCollection<z1>)var2);
               this.n5 = new t9((z1[])var2.toArray(new z1[0]));
            }
         }
      }
   }

   private void n5(IGenericCollection<z1> var1) {
      if (this.t2() != null) {
         Dictionary var2 = com.aspose.slides.internal.t6j.l6.n5();
         List$Enumerator var3 = this.t2().iterator();

         try {
            while (var3.hasNext()) {
               String var4 = (String)var3.next();
               if (com.aspose.slides.internal.n2d.t4.l6(var4)) {
                  this.n5(var4, this.u9(), var2);
                  if (com.aspose.slides.internal.n2d.m1.n5) {
                     for (String var8 : com.aspose.slides.internal.e5m.n5.l6().n5()) {
                        if (d1.a6(var8, var4)) {
                           com.aspose.slides.internal.e5m.n5.l6().n5(var2);
                           break;
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (com.aspose.slides.internal.n2d.z3.n5() == 1 && this.a6().length > 0) {
            this.n5((com.aspose.slides.Collections.Generic.IGenericDictionary<String, String>)(var2));
         }

         IGenericEnumerator var17 = var2.iterator();

         try {
            while (var17.hasNext()) {
               KeyValuePair var18 = (KeyValuePair)var17.next();
               var1.addItem(new y4((String)var18.getKey()));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }
      }
   }

   abstract void n5(IGenericDictionary<String, String> var1);

   private void n5(String var1, boolean var2, IGenericDictionary<String, String> var3) {
      try {
         if (!com.aspose.slides.internal.z0k.u3.k5(var1)) {
            return;
         }

         String[] var4 = com.aspose.slides.internal.z0k.u3.a6(var1);

         for (String var8 : var4) {
            var3.set_Item(var8, var8);

            try {
               this.l6(var8);
            } catch (RuntimeException var10) {
            }
         }

         if (var2) {
            String[] var12 = com.aspose.slides.internal.z0k.u3.u3(var1);

            for (String var9 : var12) {
               this.n5(var9, var2, var3);
            }
         }
      } catch (RuntimeException var11) {
      }
   }

   private void l6(IGenericCollection<z1> var1) {
      if (this.s7() != null) {
         List$Enumerator var2 = this.s7().iterator();

         try {
            while (var2.hasNext()) {
               byte[] var3 = (byte[])var2.next();
               if (!"OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var3, 0, 4))) {
                  this.l6(var3);
                  var1.addItem(new a0(var3));
               } else {
                  byte[] var4 = com.aspose.slides.internal.c8e.n5.n5(var3);
                  this.l6(var4);
                  var1.addItem(new a0(var4));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }
}
