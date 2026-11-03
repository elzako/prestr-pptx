package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public class a9 extends x4 {
   private int n5 = 0;
   private int l6 = 0;
   private int k5 = 256;
   private int u3 = 256;
   private String a6;
   private String u9;
   private z4 h0 = new z4();
   private z4 c8 = new z4();
   private String t2;
   private com.aspose.slides.ms.System.Xml.u8[] s7;
   private boolean x8 = false;
   private boolean n3 = false;
   private boolean y4 = false;
   private boolean e2 = false;
   private int t9 = 0;
   private d0 z1;
   private d0 t4 = new d0();
   private d0 q0 = new d0();
   private d0 z3 = new d0();
   private d0 m1 = new d0();
   private d0 k7 = new d0();
   private d0 m3 = new d0();
   private static volatile int z8 = -1;
   private volatile int j5 = -1;
   private ArrayList w1;
   private ArrayList r4;
   private com.aspose.slides.ms.System.r8 c4;
   private boolean y2;
   private Hashtable y1 = new Hashtable();
   private XmlDocument a0;

   public static a9 n5(com.aspose.slides.ms.System.Xml.c7 var0, b4 var1) {
      com.aspose.slides.ms.System.Xml.z9 var2 = var0.y1();
      n7 var3 = new n7(3, var2, new o2(var2), var1);

      try {
         var3.n5(var0, null);
      } catch (XmlSchemaException var5) {
         if (var1 != null) {
            var1.n5(null, new i0(var5));
            return null;
         }

         throw var5;
      }

      return var3.l6();
   }

   public final boolean n5(
      v2 var1, com.aspose.slides.ms.System.Xml.o8 var2, x0 var3, String var4, b4 var5, com.aspose.slides.ms.System.Xml.z9 var6, boolean var7
   ) {
      synchronized (this) {
         a2 var9 = new a2(var6, null, var5);
         var9.n5(var2);
         if (!var9.n5(this, var4, true, var1)) {
            return false;
         }

         n9 var10 = new n9(var6, var5);
         this.x8 = var10.n5(this, var3, var7);
         this.a6(this.x8);
         return this.x8;
      }
   }

   public final void n5(com.aspose.slides.ms.System.Xml.z9 var1, b4 var2, x2 var3) {
      e2 var4 = new e2(var1, var2, null, var3);
      var4.n5(this, true);
      this.n3 = var4.u9();
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void k5(int var1) {
      this.u3 = var1;
   }

   public final int u3() {
      return this.l6;
   }

   public final void u3(int var1) {
      this.l6 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final z4 h0() {
      return this.h0;
   }

   public final z4 c8() {
      return this.c8;
   }

   public final boolean t2() {
      return this.n3;
   }

   public final void n5(boolean var1) {
      this.n3 = var1;
   }

   public final boolean s7() {
      return this.y4;
   }

   public final void l6(boolean var1) {
      this.y4 = var1;
   }

   public final boolean x8() {
      return this.e2;
   }

   public final void k5(boolean var1) {
      this.e2 = var1;
   }

   public final d0 n3() {
      if (this.z1 == null) {
         this.z1 = new d0();
      }

      return this.z1;
   }

   public final d0 y4() {
      if (this.t4 == null) {
         this.t4 = new d0();
      }

      return this.t4;
   }

   public final d0 e2() {
      if (this.z3 == null) {
         this.z3 = new d0();
      }

      return this.z3;
   }

   public final d0 t9() {
      if (this.q0 == null) {
         this.q0 = new d0();
      }

      return this.q0;
   }

   public final String z1() {
      return this.t2;
   }

   public final void k5(String var1) {
      this.t2 = var1;
   }

   public final d0 t4() {
      return this.m1;
   }

   public final d0 q0() {
      return this.k7;
   }

   public final d0 z3() {
      return this.m3;
   }

   public final com.aspose.slides.ms.System.r8 m1() {
      return this.c4;
   }

   public final void n5(com.aspose.slides.ms.System.r8 var1) {
      this.c4 = var1;
   }

   public final int k7() {
      return this.j5 == -1 ? (this.j5 = ++z8) : this.j5;
   }

   public final boolean m3() {
      return this.y2;
   }

   public final void u3(boolean var1) {
      this.y2 = var1;
   }

   public final Hashtable z8() {
      return this.y1;
   }

   public final XmlDocument j5() {
      if (this.a0 == null) {
         this.a0 = new XmlDocument();
      }

      return this.a0;
   }

   public final int w1() {
      return this.t9;
   }

   public final void a6(int var1) {
      this.t9 = var1;
   }

   public final a9 r4() {
      a9 var1 = new a9();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.n5(this.i1());
      var1.c8 = this.c8;
      var1.n5(this.m1());
      n9.n5(var1);
      return var1;
   }

   public final a9 c4() {
      a9 var1 = new a9();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.y4 = this.y4;

      for (int var2 = 0; var2 < this.c8.size(); var2++) {
         l9 var3;
         x4 var4;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(this.c8.n5(var2), l9.class)) != null) {
            var4 = var3.n5(this);
         } else {
            v1 var5;
            if ((var5 = com.aspose.slides.internal.v6g.k5.n5(this.c8.n5(var2), v1.class)) != null) {
               var4 = var5.n5(this);
            } else {
               f3 var6;
               if ((var6 = com.aspose.slides.internal.v6g.k5.n5(this.c8.n5(var2), f3.class)) != null) {
                  var4 = var6.n5(this);
               } else {
                  var4 = this.c8.n5(var2).d2();
               }
            }
         }

         var1.c8().n5(var4);
      }

      for (int var7 = 0; var7 < this.h0.size(); var7++) {
         h7 var8 = (h7)this.h0.n5(var7).d2();
         var1.h0().n5(var8);
      }

      var1.n5(this.i1());
      var1.n5(this.m1());
      return var1;
   }

   @Override
   public String y2() {
      return this.z1();
   }

   @Override
   public void u3(String var1) {
      this.k5(var1);
   }

   public final void a6(boolean var1) {
      this.x8 = var1;
   }

   @Override
   public void n5(com.aspose.slides.ms.System.Xml.u8[] var1) {
      this.s7 = var1;
   }

   @Override
   public void n5(q4 var1) {
      this.c8.n5(var1);
   }

   public final ArrayList y1() {
      if (this.w1 == null) {
         this.w1 = new ArrayList();
      }

      return this.w1;
   }

   public final ArrayList a0() {
      if (this.r4 == null) {
         this.r4 = new ArrayList();
      }

      return this.r4;
   }

   public final void n5(IList var1, a9 var2) {
      if (!var1.contains(var2)) {
         var1.addItem(var2);

         for (int var3 = 0; var3 < var2.h0().size(); var3++) {
            h7 var4 = (h7)var2.h0().n5(var3);
            if (var4.l6() != null) {
               this.n5(var1, var4.l6());
            }
         }
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a9 d2() {
      return this.c4();
   }

}
