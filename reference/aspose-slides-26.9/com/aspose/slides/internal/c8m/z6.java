package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class z6 extends s7 implements IDisposable {
   protected SortedList<String, j8> l6;
   private a2 k5;
   private List<j8> u3;
   private List<String> a6;
   private IGenericList<com.aspose.slides.internal.z0k.t4> u9;
   private Dictionary<String, com.aspose.slides.internal.e5a.y2> h0;

   public final a2 c8() {
      return this.k5;
   }

   public final j8[] t2() {
      j8[] var1 = new j8[this.l6.getValues().size()];
      this.l6.getValues().copyToTArray(var1, 0);
      return var1;
   }

   public final j8[] s7() {
      return this.u3.toArray(new j8[0]);
   }

   protected final void x8() {
      this.a6();
      if (this.l6 == null) {
         this.l6 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
      }

      if (this.u3 == null) {
         this.u3 = new List<>();
      }

      if (this.u9 == null) {
         this.u9 = new List<>();
      }

      String var1 = a6("/");
      j8 var2 = new j8(this, var1, new h1(), null);
      var2.n5(new a2(this));
      this.l6.addItem(var2.l6(), var2);
      this.k5 = var2.e2();
      this.a6 = new List<>();
   }

   protected final void n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.b8.s7 var2) {
      this.n5(var1, true, var2);
   }

   protected final void l6(com.aspose.slides.internal.z0k.t4 var1, boolean var2, com.aspose.slides.internal.b8.s7 var3) {
      this.n5(var1, var2, var3);
   }

   protected final void n5(com.aspose.slides.internal.l2.k5 var1, com.aspose.slides.internal.b8.s7 var2) {
      if (this.l6 == null) {
         this.l6 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
      }

      if (this.u3 == null) {
         this.u3 = new List<>();
      }

      if (this.u9 == null) {
         this.u9 = new List<>();
      }

      IGenericEnumerator var3 = var1.l6().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.l2.u9 var4 = (com.aspose.slides.internal.l2.u9)var3.next();
            this.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.y4();
   }

   @Override
   protected void u3() {
      if (this.l6 == null) {
         this.l6 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
      }

      if (this.u3 == null) {
         this.u3 = new List<>();
      }

      if (this.u9 == null) {
         this.u9 = new List<>();
      }

      this.h0 = new Dictionary<>();
      IGenericEnumerator var1 = this.k5().iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.e5a.y2 var2 = (com.aspose.slides.internal.e5a.y2)var1.next();
            if (!var2.n3()) {
               var2.n5(com.aspose.slides.ms.System.d1.n5(var2.u3(), '\\', '/'));
               this.n5(var2);
            }

            this.h0.set_Item(var2.u3(), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      y2.n5(this.l6);
      this.h0 = null;
      this.y4();
   }

   private void y4() {
      IGenericEnumerator var1 = this.l6.getValues().iterator();

      try {
         while (var1.hasNext()) {
            j8 var2 = (j8)var1.next();
            this.u9();
            if (com.aspose.slides.internal.v6g.k5.l6(var2.y4(), h1.class)) {
               var2.n5(this.k5(var2.l6()));
               var2.n5(true);
               this.u3.addItem(var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      IGenericEnumerator var11 = this.l6.getValues().iterator();

      try {
         while (var11.hasNext()) {
            j8 var3 = (j8)var11.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3.y4(), r4.class)) {
               var3.n5(this.l6(var3.l6()));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      this.k5 = this.l6("/");
      if (this.k5 == null) {
         throw new t5(com.aspose.slides.ms.System.d1.n5("Error reading pptx presentation: can't find \"{0}\" entry.", new Object[]{a6("/")}));
      }

      this.n5(this.l6.getValues());
   }

   public abstract void n5(IGenericList<j8> var1);

   public abstract void n5(j8 var1);

   protected final a2 l6(String var1) {
      String var2 = a6(var1);
      j8 var3 = this.u9(var2);
      return var3 == null ? new a2(this) : var3.e2();
   }

   protected final a2 k5(String var1) {
      com.aspose.slides.internal.z0k.t4 var2 = this.u3(var1);
      int var3 = com.aspose.slides.ms.System.d1.k5(var1, '/');
      String var4 = "";
      if (var3 >= 0) {
         var4 = com.aspose.slides.ms.System.d1.l6(var1, 0, var3 - 6);
      }

      if (var2 == null) {
         return null;
      }

      try {
         h1 var5 = (h1)q3.n5("application/vnd.openxmlformats-package.relationships+xml");
         com.aspose.slides.ms.System.Xml.c7 var6 = com.aspose.slides.internal.n8e.s9.n5(
            new com.aspose.slides.internal.z0k.m3(var2, true), var5.u3(), var5.a6(), var5.n5(), var5.u9(), false
         );
         a2 var7 = new a2(this);
         var7.n5(var6, var4);
         return var7;
      } catch (RuntimeException var8) {
         throw new t5(com.aspose.slides.ms.System.d1.n5(new String[]{"Error reading \"", var1, "\" relationships part"}), var8);
      }
   }

   protected final com.aspose.slides.internal.z0k.t4 u3(String var1) {
      j8 var2 = null;
      j8[] var3 = new j8[]{var2};
      boolean var4 = this.l6.tryGetValue(var1, var3) && var3[0] != null;
      var2 = var3[0];
      return var4 ? var2.c8() : null;
   }

   public static String a6(String var0) {
      int var1 = com.aspose.slides.ms.System.d1.k5(var0, '/');
      String var2 = "";
      String var3 = var0;
      if (var1 >= 0) {
         var2 = com.aspose.slides.ms.System.d1.l6(var0, 0, var1 + 1);
         var3 = com.aspose.slides.ms.System.d1.k5(var0, var1 + 1);
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var2, "_rels/", var3, ".rels"});
   }

   public final j8 u9(String var1) {
      Object var2 = null;
      j8[] var3 = new j8[]{(j8)var2};
      this.l6.tryGetValue(var1, var3);
      return var3[0];
   }

   public final j8 n5(String var1, s7$n5 var2, i4 var3) {
      return this.n5(var1, var2, var3, null);
   }

   public final j8 n5(String var1, s7$n5 var2, i4 var3, byte[] var4) {
      String var5;
      if (var2 == null) {
         var5 = var1;
      } else {
         var5 = com.aspose.slides.ms.System.d1.n5(var1, new Object[]{var2.n5()});

         while (this.a6.containsItem(var5)) {
            var5 = com.aspose.slides.ms.System.d1.n5(var1, new Object[]{var2.n5()});
         }
      }

      j8 var6 = new j8(this, var5, var3, var4);
      if (com.aspose.slides.internal.v6g.k5.l6(var3, h1.class)) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "You can't directly add part of RelationshipsPartType content type. ", "RelationshipsPartType-part is added automatically."
            })
         );
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var3, r4.class)) {
         var6.z1();
      }

      this.l6(var6);
      return var6;
   }

   public final void n5(com.aspose.slides.internal.l2.u9 var1) {
      j8 var2 = new j8(this, var1.n5(), q3.n5(var1.k5()), var1.a6().toArray());
      this.l6.addItem(var2.l6(), var2);
   }

   public final void l6(j8 var1) {
      var1.n5(this);
      this.l6.addItem(var1.l6(), var1);
      this.n5(var1);
   }

   public final void h0(String var1) {
      this.a6.addItem(var1);
   }

   protected final void n5(com.aspose.slides.internal.e5a.y2 var1) {
      j8 var2 = new j8(this, var1);
      this.l6.addItem(var2.l6(), var2);
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.l2.k5 var2 = new com.aspose.slides.internal.l2.k5();
      IGenericEnumerator var3 = this.l6.getValues().iterator();

      try {
         while (var3.hasNext()) {
            j8 var4 = (j8)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4.y4(), h1.class)) {
               if (var4.e2().n5() == 0) {
                  continue;
               }

               this.k5(var4);
            }

            com.aspose.slides.internal.z0k.t4 var5 = var4.c8();
            this.u9.addItem(var5);
            com.aspose.slides.internal.l2.u9 var6 = new com.aspose.slides.internal.l2.u9(var4.l6(), var4.y4().n5());
            var6.n5(var5);
            var2.l6().n5(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.n5(var1);
      var1.flush();
   }

   public final void n5(com.aspose.slides.internal.e5a.d2 var1) {
      this.n3();
      IGenericEnumerator var2 = this.l6.getValues().iterator();

      try {
         while (var2.hasNext()) {
            j8 var3 = (j8)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3.y4(), h1.class)) {
               if (var3.e2().n5() == 0) {
                  continue;
               }

               this.k5(var3);
            }

            var1.n5(!var3.y4().k5());
            com.aspose.slides.internal.z0k.t4 var4 = var3.c8();
            this.u9.addItem(var4);
            var1.n5(var3.k5(), null, var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void k5(j8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("relationshipsEntry");
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1.y4(), h1.class)) {
         throw new InvalidDataException("The part content has not relationships content type.");
      }

      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         var1.e2().n5(var2, var1.l6());
         var1.n5(var2.toArray());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final void n3() {
      if (this.u9("/[Content_Types].xml") != null) {
         this.l6.removeItemByKey("/[Content_Types].xml");
      }

      y2.n5(this);
   }

   @Override
   public final void dispose() {
      com.aspose.slides.internal.z0k.t4[] var1 = new com.aspose.slides.internal.z0k.t4[this.u9.size()];
      this.u9.copyToTArray(var1, 0);
      this.u9.clear();

      for (com.aspose.slides.internal.z0k.t4 var5 : var1) {
         var5.dispose();
      }
   }
}
