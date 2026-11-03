package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.Xml.m8;

public abstract class y2 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private a0 u9;
   private t4 h0;
   private d5 c8;
   private e5 t2;
   public m8 n5 = null;

   public final boolean a6() {
      return this.n5 != null;
   }

   public String u9() {
      return this.l6;
   }

   public void k5(String var1) {
      this.l6 = var1;
      this.n5 = null;
   }

   public String h0() {
      return this.k5;
   }

   public void u3(String var1) {
      this.k5 = var1;
      this.n5 = null;
   }

   public String c8() {
      return this.u3;
   }

   public void a6(String var1) {
      this.u3 = var1;
      this.n5 = null;
   }

   public String t2() {
      return this.a6;
   }

   public void u9(String var1) {
      this.a6 = var1;
      this.n5 = null;
   }

   public final e5 s7() {
      if (this.t2 == null) {
         this.t2 = new e5();
      }

      return this.t2;
   }

   public final void n5(e5 var1) {
      this.t2 = var1;
   }

   public a0 x8() {
      return this.u9;
   }

   public void n5(a0 var1) {
      this.u9 = var1;
      this.n5 = null;
   }

   public d5 n3() {
      if (this.c8 == null) {
         this.c8 = new d5();
      }

      return this.c8;
   }

   public t4 y4() {
      if (this.h0 == null) {
         this.h0 = new t4();
      }

      return this.h0;
   }

   public void n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.h0 = var1;
      this.n5 = null;
   }
}
