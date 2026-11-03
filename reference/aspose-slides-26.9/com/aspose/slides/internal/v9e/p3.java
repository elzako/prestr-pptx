package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.v7y.i6;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.Xml.b0;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.k6;
import com.aspose.slides.ms.System.Xml.l1;
import com.aspose.slides.ms.System.Xml.m4;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.z9;

public final class p3 {
   private int n5;
   private j8 l6;
   private j9 k5;
   private f2[] u3;
   private List<j3> a6;
   private com.aspose.slides.internal.x6s.a6 u9;
   private com.aspose.slides.ms.System.Xml.a0 h0;
   private com.aspose.slides.internal.l7h.a5 c8;
   private int t2;
   private o5 s7;
   private x9 x8;
   private c3 n3;
   private z9 y4 = new com.aspose.slides.ms.System.Xml.j9();
   private o8 e2;
   private com.aspose.slides.internal.k4s.u3 t9;
   private Hashtable z1;
   private ArrayList t4;
   private v8 q0 = new v8();
   private com.aspose.slides.internal.v7y.j9[] z3;
   private ArrayList m1;
   private Hashtable k7;
   private y8 m3;
   private y8 z8;

   public final com.aspose.slides.internal.x6s.a6 n5() {
      l6 var1 = (l6)this.h0.k5();
      return var1 != null ? var1.a6() : null;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final j8 l6() {
      return this.l6;
   }

   public final o8 k5() {
      return this.e2;
   }

   public final ArrayList u3() {
      return this.m1;
   }

   public final f2[] a6() {
      return this.u3;
   }

   public final com.aspose.slides.internal.x6s.a6 n5(r8 var1) {
      com.aspose.slides.internal.x6s.a6 var2 = null;
      if (this.k7 != null) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(this.k7.get_Item(var1), com.aspose.slides.internal.x6s.a6.class);
         if (var2 != null) {
            return var2.n5();
         }
      } else {
         this.k7 = new Hashtable();
      }

      Object var3 = this.e2.n5(var1, null, null);
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.z0k.t4.class)) {
         b0 var4 = new b0(var1.toString(), (com.aspose.slides.internal.z0k.t4)var3);
         var4.n5(this.e2);
         var2 = com.aspose.slides.internal.v9e.z1.n5(var4).createNavigator();
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.x6s.a6.class)) {
            throw XsltException.create("Cannot resolve the referenced document '{0}'.", var1.toString());
         }

         var2 = (com.aspose.slides.internal.x6s.a6)var3;
      }

      this.k7.set_Item(var1, var2.n5());
      return var2;
   }

   public final void n5(z6 var1) {
      this.m1.addItem(var1);
   }

   public final void u9() {
      if (this.m1 == null) {
         this.m1 = new ArrayList();
      } else {
         this.m1.clear();
      }
   }

   public final Object n5(k6 var1) {
      Object var2 = this.t9.n5(var1.l6(), var1.n5());
      if (var2 == null) {
         return null;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.x6s.h0.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.x6s.a6.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, Boolean.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, Double.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, String.class)) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var2, Short.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, Integer.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, Integer.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, Long.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, Long.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, Long.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, Float.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.ms.System.c4.class)) {
            var2 = var2.toString();
         } else {
            var2 = f4.n5(var2);
         }
      }

      return var2;
   }

   public final Object n5(String var1) {
      return this.t9.n5(var1);
   }

   public final Object l6(String var1) {
      return this.z1.get_Item(var1);
   }

   public final j9 h0() {
      return this.k5;
   }

   public final com.aspose.slides.internal.x6s.a6 c8() {
      return this.u9;
   }

   public final com.aspose.slides.internal.l7h.a5 t2() {
      if (this.c8 == null) {
         this.c8 = new com.aspose.slides.internal.l7h.a5();
      } else {
         this.c8.n5(0);
      }

      return this.c8;
   }

   public final void s7() {
   }

   public final ArrayList x8() {
      if (this.t4 == null) {
         this.t4 = new ArrayList();
      }

      return this.t4;
   }

   public p3(com.aspose.slides.internal.x6s.a6 var1, com.aspose.slides.internal.k4s.u3 var2, o8 var3, j8 var4, List<j3> var5, j9 var6) {
      this.l6 = var4;
      this.a6 = var5;
      this.k5 = var6;
      this.z3 = new com.aspose.slides.internal.v7y.j9[var5.size()];

      for (int var7 = 0; var7 < var5.size(); var7++) {
         this.z3[var7] = com.aspose.slides.internal.v7y.j9.n5(((j3)var5.get_Item(var7)).n5().l6());
      }

      this.s7 = new o5();
      this.u9 = var1;
      this.x8 = null;
      this.h0 = new com.aspose.slides.ms.System.Xml.a0(10);
      this.n3 = this.k5.n5();
      o8 var15 = var3;
      if (var15 == null) {
         var15 = m4.n5;
      }

      this.e2 = var15;
      com.aspose.slides.internal.k4s.u3 var8 = var2;
      if (var8 == null) {
         var8 = new com.aspose.slides.internal.k4s.u3();
      }

      this.t9 = var8;
      if (this.k5.l6() != null) {
         this.u3 = new f2[this.k5.l6().size()];

         for (int var9 = 0; var9 < this.u3.length; var9++) {
            this.u3[var9] = this.k5.l6().get_Item(var9).u3();
         }
      }

      this.z1 = new Hashtable(this.l6.u9().size());
      IDictionaryEnumerator var16 = this.l6.u9().iterator();

      try {
         while (var16.hasNext()) {
            DictionaryEntry var10 = (DictionaryEntry)var16.next();
            String var11 = (String)var10.getKey();
            if (this.n5(var11) != null) {
               throw XsltException.create("Namespace '{0}' has a duplicate implementation.", var11);
            }

            this.z1.addItem(var11, com.aspose.slides.ms.System.k5.n5((com.aspose.slides.ms.System.y8)var10.getValue(), 564, null, null, null));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            ((IDisposable)var16).dispose();
         }
      }

      this.n5(this.k5, null);
   }

   public final void n5(l1 var1) {
      this.x8 = new x9(new h6(this, var1), this.y4);
      this.n3();
   }

   public final void n3() {
      while (this.n5 == 0) {
         l6 var1 = (l6)this.h0.k5();
         if (var1 == null) {
            this.x8.c8();
            this.n5(2);
            break;
         }

         if (var1.n5(this)) {
            this.h0.l6();
         }
      }

      if (this.n5 == 1) {
         this.n5 = 0;
      }
   }

   public final l6 y4() {
      l6 var1 = (l6)this.h0.k5();
      l6 var2 = (l6)this.h0.n5();
      if (var2 == null) {
         var2 = new l6();
         this.h0.n5(var2);
      }

      if (var1 != null) {
         var2.n5(var1);
      }

      return var2;
   }

   public final void n5(n5 var1, com.aspose.slides.internal.x6s.h0 var2) {
      l6 var3 = this.y4();
      var3.n5(var1, var2);
   }

   public final void n5(l6 var1) {
      this.n5(var1, var1.u9());
   }

   public final void n5(l6 var1, com.aspose.slides.internal.x6s.h0 var2) {
      l6 var3 = this.y4();
      var3.n5(var1, var2);
   }

   public final void n5(com.aspose.slides.internal.x6s.h0 var1, k6 var2, j8 var3) {
      this.q0.n5(var2, var3);
      this.n5(this.q0, var1);
   }

   public final String l6(int var1) {
      return this.a6.get_Item(var1).n5().k5();
   }

   public final com.aspose.slides.internal.v7y.j9 k5(int var1) {
      j3 var2 = this.a6.get_Item(var1);
      var2.n5().n5();
      com.aspose.slides.internal.v7y.j9 var3 = com.aspose.slides.internal.v7y.j9.n5(this.z3[var1]);
      var3.n5(new y8(var2.n5, this));
      return var3;
   }

   public final com.aspose.slides.internal.v7y.j9 u3(int var1) {
      return this.n5(var1, null);
   }

   public final com.aspose.slides.internal.v7y.j9 n5(int var1, y8 var2) {
      j3 var3 = this.a6.get_Item(var1);
      var3.n5().n5();
      com.aspose.slides.internal.v7y.j9 var4 = this.z3[var1];
      if (var2 == null) {
         var2 = new y8(var3.n5, this);
      } else {
         var2.n5(var3.n5, this);
      }

      var4.n5(var2);
      return var4;
   }

   private y8 t4() {
      if (this.m3 == null) {
         this.m3 = new y8();
      }

      return this.m3;
   }

   private y8 q0() {
      if (this.z8 == null) {
         this.z8 = new y8();
      }

      return this.z8;
   }

   public final String n5(l6 var1, int var2) {
      com.aspose.slides.internal.v7y.j9 var3 = this.n5(var2, this.t4());
      Object var4 = var3.n5(var1.u9());
      String var6;
      if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.x6s.h0.class)) {
         com.aspose.slides.internal.x6s.a6 var5 = var3.h0();
         var6 = var5 != null ? this.n5(var5) : com.aspose.slides.ms.System.d1.n5;
      } else {
         var6 = f4.l6(var4);
      }

      return var6;
   }

   public final String n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (this.l6.n5() && var1.k5() == 1) {
         com.aspose.slides.internal.l7h.a5 var2 = this.t2();
         this.n5(var1, var2);
         this.s7();
         return var2.toString();
      } else {
         return var1.c8();
      }
   }

   private void n5(com.aspose.slides.internal.x6s.a6 var1, com.aspose.slides.internal.l7h.a5 var2) {
      boolean var3 = this.l6().n5(this, var1);
      if (var1.t4()) {
         do {
            switch (var1.k5()) {
               case 1:
                  this.n5(var1, var2);
               case 2:
               case 3:
               default:
                  break;
               case 4:
               case 5:
                  var2.n5(var1.c8());
                  break;
               case 6:
                  if (var3) {
                     var2.n5(var1.c8());
                  }
            }
         } while (var1.z1());

         var1.q0();
      }
   }

   public final com.aspose.slides.internal.x6s.h0 n5(com.aspose.slides.internal.x6s.h0 var1, int var2) {
      com.aspose.slides.internal.v7y.j9 var3 = this.k5(var2);
      Object var4 = var3.n5(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.x6s.h0.class)) {
         return new i6(var1.k5(), var3);
      } else {
         throw XsltException.create("Expression must evaluate to a node-set.");
      }
   }

   public final Object l6(l6 var1, int var2) {
      return this.u3(var2).n5(var1.u9());
   }

   public final Object k5(l6 var1, int var2) {
      com.aspose.slides.internal.v7y.j9 var3 = this.k5(var2);
      Object var4 = var3.n5(var1.u9());
      com.aspose.slides.internal.x6s.h0 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.x6s.h0.class);
      return var5 != null ? new com.aspose.slides.internal.v7y.f5(var5) : var4;
   }

   public final String u3(l6 var1, int var2) {
      Object var3 = this.l6(var1, var2);
      String var4 = null;
      if (var3 != null) {
         var4 = f4.l6(var3);
      }

      if (var4 == null) {
         var4 = com.aspose.slides.ms.System.d1.n5;
      }

      return var4;
   }

   public final boolean a6(l6 var1, int var2) {
      Object var3 = this.l6(var1, var2);
      if (var3 != null) {
         com.aspose.slides.internal.x6s.a6 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.x6s.a6.class);
         return var4 != null
            ? com.aspose.slides.ms.System.z3.n5(var4.c8(), com.aspose.slides.internal.x7n.l6.k5())
            : com.aspose.slides.ms.System.z3.n5(var3, com.aspose.slides.internal.x7n.l6.k5());
      } else {
         return false;
      }
   }

   public final boolean n5(com.aspose.slides.internal.x6s.a6 var1, int var2) {
      com.aspose.slides.internal.v7y.j9 var3 = this.n5(var2, this.q0());

      try {
         return var3.n5(var1) != null;
      } catch (XPathException var5) {
         throw XsltException.create("'{0}' is an invalid XSLT pattern.", this.l6(var2));
      }
   }

   public final boolean e2() {
      return this.n5 == 0;
   }

   public final boolean n5(int var1, String var2, String var3, String var4, boolean var5) {
      return this.n5(var1, var2, var3, var4, var5, null, true);
   }

   public final boolean n5(int var1, String var2, String var3, String var4, boolean var5, Object var6, boolean var7) {
      int var8 = this.s7.l6(var1);
      if (this.t2 <= 0 && var8 != 16) {
         switch (this.x8.n5(var8, var1, var2, var3, var4, var5, var6, var7)) {
            case 0:
               this.s7.k5(var1);
               return true;
            case 1:
               this.s7.k5(var1);
               this.n5(1);
               return true;
            case 2:
               this.n5(1);
               return false;
            case 3:
               this.t2++;
               return true;
            case 4:
               return true;
            default:
               com.aspose.slides.internal.f8y.n5.n5("Unexpected result of RecordBuilder.BeginEvent()");
               return true;
         }
      } else {
         this.t2++;
         return true;
      }
   }

   public final boolean k5(String var1) {
      return this.n5(var1, false);
   }

   public final boolean n5(String var1, boolean var2) {
      if (this.t2 > 0) {
         return true;
      }

      int var3 = this.s7.l6(4);
      switch (this.x8.n5(var3, var1, var2)) {
         case 0:
            this.s7.k5(4);
            return true;
         case 1:
            this.s7.k5(4);
            this.n5(1);
            return true;
         case 2:
            this.n5(1);
            return false;
         case 3:
         case 4:
            return true;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Unexpected result of RecordBuilder.TextEvent()");
            return true;
      }
   }

   public final boolean a6(int var1) {
      if (this.t2 > 0) {
         this.t2--;
         return true;
      }

      int var2 = this.s7.u3(var1);
      switch (this.x8.n5(var2, var1)) {
         case 0:
            this.s7.a6(var1);
            return true;
         case 1:
            this.s7.a6(var1);
            this.n5(1);
            return true;
         case 2:
            this.n5(1);
            return false;
         case 3:
         case 4:
         default:
            com.aspose.slides.internal.f8y.n5.n5("Unexpected result of RecordBuilder.TextEvent()");
            return true;
      }
   }

   public final boolean n5(com.aspose.slides.internal.x6s.a6 var1, boolean var2) {
      switch (var1.k5()) {
         case 1:
         case 2:
         case 7:
         case 8:
            return this.n5(var1.k5(), var1.h0(), var1.u3(), var1.a6(), var2);
         case 3:
            return this.n5(3, null, var1.u3(), var1.c8(), false);
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid XPathNodeType in CopyBeginEvent");
         case 0:
         case 4:
         case 5:
         case 6:
         case 9:
            return true;
      }
   }

   public final boolean l6(com.aspose.slides.internal.x6s.a6 var1) {
      switch (var1.k5()) {
         case 2:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            String var2 = var1.c8();
            return this.k5(var2);
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid XPathNodeType in CopyTextEvent");
         case 0:
         case 1:
         case 3:
         case 9:
            return true;
      }
   }

   public final boolean k5(com.aspose.slides.internal.x6s.a6 var1) {
      switch (var1.k5()) {
         case 1:
         case 2:
         case 3:
         case 7:
         case 8:
            return this.a6(var1.k5());
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid XPathNodeType in CopyEndEvent");
         case 0:
         case 4:
         case 5:
         case 6:
         case 9:
            return true;
      }
   }

   public static boolean u3(com.aspose.slides.internal.x6s.a6 var0) {
      if (var0.k5() == 0) {
         return true;
      } else if (var0.k5() == 1) {
         com.aspose.slides.internal.x6s.a6 var1 = var0.n5();
         var1.z3();
         return var1.l6(var0);
      } else {
         return false;
      }
   }

   public final void n5(y0 var1) {
      this.x8.n5(this.s7.n5());
      x9 var2 = this.x8;
      this.x8 = new x9(var1, this.y4);
      this.x8.n5(var2);
      this.s7.l6();
   }

   public final y0 t9() {
      x9 var1 = this.x8;
      this.x8 = var1.l6();
      this.s7.n5(this.x8.n5());
      var1.c8();
      return var1.k5();
   }

   public final Object n5(d1 var1) {
      int var2 = var1.a6();
      if (!var1.u9()) {
         return ((l6)this.h0.k5()).u3(var2);
      }

      l6 var3 = (l6)this.h0.n5(0);
      Object var4 = var3.u3(var2);
      if (var4 == d1.n5) {
         throw XsltException.create("Circular reference in the definition of variable '{0}'.", var1.u3());
      }

      if (var4 != null) {
         return var4;
      }

      int var5 = this.h0.u3();
      l6 var6 = this.y4();
      var6.n5(var3);
      var6.n5(var1, var3.u9());

      do {
         boolean var7 = ((l6)this.h0.k5()).n5(this);
         if (var7) {
            this.h0.l6();
         }
      } while (var5 < this.h0.u3());

      return var3.u3(var2);
   }

   public final void n5(k6 var1, Object var2) {
      l6 var3 = (l6)this.h0.n5(this.h0.u3() - 2);
      var3.n5(var1, var2);
   }

   public final void z1() {
      l6 var1 = (l6)this.h0.n5(this.h0.u3() - 1);
      var1.t2();
   }

   public final Object l6(k6 var1) {
      l6 var2 = (l6)this.h0.n5(this.h0.u3() - 3);
      return var2.n5(var1);
   }
}
