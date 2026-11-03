package com.aspose.slides.internal.f8y;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Specialized.StringDictionary;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.x9;

public class h0 {
   private String n5 = "";
   private x9 l6 = x9.n5;
   private String k5 = "";
   private String u3 = "";
   private String a6 = "";
   private c8 u9;
   private boolean h0 = false;
   private boolean c8 = false;
   private boolean t2 = false;
   private boolean s7 = false;
   private boolean x8 = false;
   private boolean n3 = true;
   private t2 y4 = com.aspose.slides.internal.f8y.t2.u3;
   private j5 e2;
   private j5 t9;
   private String z1;
   private boolean t4 = false;
   private static final String[] q0 = new String[0];

   public String n5() {
      return this.n5;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   public void n5(boolean var1) {
      this.h0 = var1;
   }

   public StringDictionary l6() {
      if (this.u9 == null) {
         this.u9 = new c8();

         for (Object var3 : p8.c8()) {
            DictionaryEntry var4 = (DictionaryEntry)var3;
            this.u9.add((String)var4.getKey(), (String)var4.getValue());
         }
      }

      return this.u9;
   }

   public boolean k5() {
      return this.u9 != null;
   }

   public String u3() {
      return this.k5;
   }

   public void l6(String var1) {
      this.k5 = var1;
   }

   public boolean a6() {
      return this.t2;
   }

   public void l6(boolean var1) {
      this.t2 = var1;
   }

   public boolean u9() {
      return this.x8;
   }

   public void k5(boolean var1) {
      this.x8 = var1;
   }

   public j5 h0() {
      return this.e2;
   }

   public j5 c8() {
      return this.t9;
   }

   public boolean t2() {
      return this.n3;
   }

   public void u3(boolean var1) {
      this.n3 = var1;
   }

   public void n5(t2 var1) {
      this.y4 = var1;
   }

   public String s7() {
      return this.a6;
   }

   public void k5(String var1) {
      this.a6 = var1 == null ? "" : var1;
   }

   public String x8() {
      return this.z1;
   }
}
