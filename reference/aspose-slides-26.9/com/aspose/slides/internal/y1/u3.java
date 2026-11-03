package com.aspose.slides.internal.y1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z6.x8;
import com.aspose.slides.internal.z6.z8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;

public class u3 {
   private u9 s7;
   private boolean x8 = false;
   private com.aspose.slides.internal.i1.t2 n3 = null;
   private String y4 = null;
   private c8 e2 = null;
   private float t9 = 72.0F;
   private Dictionary<String, Boolean> z1 = new Dictionary<>();
   private t4 t4 = null;
   private com.aspose.slides.internal.o5.l6 q0 = null;
   private x8 z3 = null;
   private com.aspose.slides.internal.e5.c8 m1 = null;
   private boolean k7 = true;
   private boolean m3 = false;
   private com.aspose.slides.internal.i1.u9 z8 = null;
   private com.aspose.slides.internal.c4.l6 j5;
   private String w1;
   private boolean r4 = false;
   protected String n5 = "Aspose";
   protected String l6 = null;
   protected j5 k5 = com.aspose.slides.ms.System.j5.s7().m3();
   protected String u3 = null;
   protected String a6 = null;
   protected String u9 = null;
   protected String h0 = null;
   public List<w1> c8 = null;
   private boolean c4 = false;
   public Dictionary<String, y1> t2 = null;
   private String y2;
   private u3$n5 y1;

   public final boolean n5() {
      return this.x8;
   }

   public final com.aspose.slides.internal.i1.t2 l6() {
      return this.n3;
   }

   public final void n5(com.aspose.slides.internal.i1.t2 var1) {
      this.n3 = var1;
   }

   public final boolean k5() {
      return this.r4;
   }

   public final void n5(boolean var1) {
      this.r4 = var1;
   }

   public final boolean u3() {
      return this.c4;
   }

   public final void l6(boolean var1) {
      this.c4 = var1;
   }

   public final void n5(String var1) {
      this.y2 = var1;
   }

   public u3(u9 var1) {
      this.z8 = new n5(this);
      this.y1 = new u3$n5(this);
      if (var1 == null) {
         throw new NullReferenceException("The factory parameter must not be null");
      }

      this.s7 = var1;
      this.l6(var1.t2());
      this.n5(var1.e2());
      this.k5(var1.k5());
   }

   public final u9 a6() {
      return this.s7;
   }

   public final com.aspose.slides.internal.o5.l6 u9() {
      return this.q0;
   }

   public final void n5(x8 var1) {
      this.z3 = var1;
   }

   public final x8 h0() {
      return this.z3;
   }

   public final com.aspose.slides.internal.e5.c8 c8() {
      return this.m1;
   }

   public final Dictionary<String, Boolean> t2() {
      return this.z1;
   }

   public final void l6(String var1) {
      this.y4 = var1;
   }

   public final String s7() {
      return this.y4;
   }

   public final t4 k5(String var1) {
      return this.n5(var1, this.s7());
   }

   public final t4 n5(String var1, String var2) {
      t4 var3 = null;
      boolean var4 = d1.l6(var1, "data:");
      if (!var4 && this.e2 != null) {
         try {
            var3 = this.e2.n5(var1, var2, null);
         } catch (RuntimeException var6) {
            throw var6;
         }
      }

      if (var3 == null) {
         var3 = this.a6().n5(var1, var2, this.y2);
      }

      return var3;
   }

   public final float x8() {
      return this.t9;
   }

   public final void n5(float var1) {
      this.a6().n5(var1);
      this.t9 = var1;
   }

   public final void n5(int var1) {
      this.n5((float)var1);
   }

   public final com.aspose.slides.internal.r4.x8 n3() {
      return this.y1;
   }

   public final float y4() {
      return this.a6().y4();
   }

   public final void l6(float var1) {
      this.a6().n5(var1);
   }

   public final String e2() {
      return this.a6().t9();
   }

   public final String t9() {
      return this.a6().z1();
   }

   public final boolean z1() {
      return this.a6().x8();
   }

   public final boolean t4() {
      return this.a6().n3();
   }

   public final z8 q0() {
      return this.a6().a6();
   }

   public final boolean z3() {
      return this.k7;
   }

   public final com.aspose.slides.internal.i1.u9 m1() {
      return this.z8;
   }

   public final boolean k7() {
      return this.s7.u3();
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.t2().addItem("accessibility", true);
      }
   }

   public final boolean m3() {
      return this.t2().containsKey("accessibility") ? this.t2().get_Item("accessibility") : false;
   }

   public final com.aspose.slides.internal.c4.l6 z8() {
      return this.j5;
   }

   public final String j5() {
      return this.w1;
   }

   public final void u3(String var1) {
      this.w1 = var1;
   }
}
