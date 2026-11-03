package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public final class t6 extends h1 implements com.aspose.slides.ms.System.Xml.e5, Cloneable {
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, h9> y4 = new Dictionary<>();
   private List<com.aspose.slides.ms.System.Xml.b3> e2;
   private boolean t9;
   private boolean z1 = false;
   private boolean t4 = false;
   private boolean q0 = false;
   private boolean z3 = false;
   private boolean m1;
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, com.aspose.slides.ms.System.Xml.k6> k7 = new Dictionary<>();
   private z1 m3;
   private k9 z8;
   private int j5;
   private y4[] w1;
   private v1 r4;
   public static final t6 n5 = new t6();

   public t6() {
   }

   public t6(v5 var1) {
      this.n5(var1);
      this.m3 = com.aspose.slides.internal.b8c.z1.l6;
   }

   public t6(com.aspose.slides.ms.System.Xml.k6 var1, String var2) {
      super(var1, var2);
   }

   public static t6 u9() {
      t6 var0 = new t6();
      var0.n5(com.aspose.slides.internal.b8c.t4.n5().b3());
      return var0;
   }

   @Override
   public final String n5() {
      return this.j5();
   }

   @Override
   public final String l6() {
      return this.z8().l6();
   }

   @Override
   public final boolean k5() {
      return this.z1;
   }

   @Override
   public final com.aspose.slides.ms.System.Xml.i1 n5(String var1, String var2) {
      com.aspose.slides.ms.System.Xml.k6 var3 = new com.aspose.slides.ms.System.Xml.k6(var2, var1);
      h9 var4 = null;
      h9[] var5 = new h9[]{var4};
      boolean var6 = this.y4.tryGetValue(var3, var5);
      var4 = var5[0];
      return var6 ? var4 : null;
   }

   @Override
   public final IGenericEnumerable<com.aspose.slides.ms.System.Xml.b3> u3() {
      return this.e2;
   }

   @Override
   public final com.aspose.slides.ms.System.Xml.i1 a6() {
      Dictionary$ValueCollection$Enumerator var1 = this.y4.getValues().iterator();

      try {
         while (var1.hasNext()) {
            h9 var2 = (h9)var1.next();
            if (var2.t4() == 1) {
               return var2;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   public final boolean h0() {
      return this.t9;
   }

   public final void l6(boolean var1) {
      this.t9 = var1;
   }

   public final boolean c8() {
      return this.z1;
   }

   public final void k5(boolean var1) {
      this.z1 = var1;
   }

   public final t6 t2() {
      return (t6)this.p8();
   }

   public final boolean s7() {
      return this.t4;
   }

   public final void u3(boolean var1) {
      this.t4 = var1;
   }

   public final boolean x8() {
      return this.q0;
   }

   public final void a6(boolean var1) {
      this.q0 = var1;
   }

   public final int n3() {
      return this.j5;
   }

   public final void n5(int var1) {
      this.j5 = var1;
   }

   public final boolean y4() {
      return this.m1;
   }

   public final void u9(boolean var1) {
      this.m1 = var1;
   }

   public final boolean e2() {
      return this.e2 != null;
   }

   public final boolean t9() {
      return this.z3;
   }

   public final z1 z1() {
      return this.m3;
   }

   public final void n5(z1 var1) {
      this.m3 = var1;
   }

   public final k9 t4() {
      return this.z8;
   }

   public final void n5(k9 var1) {
      this.z8 = var1;
   }

   public final y4[] q0() {
      return this.w1;
   }

   public final void n5(y4[] var1) {
      this.w1 = var1;
   }

   public final v1 z3() {
      return this.r4;
   }

   public final void n5(v1 var1) {
      this.r4 = var1;
   }

   public final void n5(h9 var1) {
      this.y4.addItem(var1.z8(), var1);
      if (var1.r4() == 1 || var1.r4() == 4) {
         this.z3 = true;
      }

      if (var1.r4() == 0 || var1.r4() == 3) {
         if (this.e2 == null) {
            this.e2 = new List<>();
         }

         this.e2.addItem(var1);
      }
   }

   public final h9 l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      h9 var2 = null;
      h9[] var3 = new h9[]{var2};
      boolean var4 = this.y4.tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? var2 : null;
   }

   public final IGenericList<com.aspose.slides.ms.System.Xml.b3> m1() {
      return this.e2;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, h9> k7() {
      return this.y4;
   }

   public final Dictionary<com.aspose.slides.ms.System.Xml.k6, com.aspose.slides.ms.System.Xml.k6> m3() {
      return this.k7;
   }

   public final void n5(Hashtable var1, boolean var2) {
      Dictionary$ValueCollection$Enumerator var3 = this.y4.getValues().iterator();

      try {
         while (var3.hasNext()) {
            h9 var4 = (h9)var3.next();
            if (var1.get_Item(var4.z8()) == null) {
               if (var4.r4() == 1) {
                  throw new XmlSchemaException("The required attribute '{0}' is missing.", var4.z8().toString());
               }

               if (var2 && var4.w1() && (var4.r4() == 0 || var4.r4() == 3)) {
                  throw new XmlSchemaException("The standalone document declaration must have a value of 'no'.", com.aspose.slides.ms.System.d1.n5);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   protected Object p8() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
