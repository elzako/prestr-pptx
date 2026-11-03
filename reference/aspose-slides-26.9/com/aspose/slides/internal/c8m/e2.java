package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedDictionary$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.b8c.k0t;
import com.aspose.slides.ms.System.IDisposable;

public abstract class e2 implements IDisposable {
   private x8 n5;
   private n3 l6;
   private boolean k5 = false;
   private y4 u3;
   private com.aspose.slides.ms.System.Xml.c7 a6;
   private com.aspose.slides.internal.n8e.u4 u9;
   private com.aspose.slides.internal.z0k.e2 h0;
   private com.aspose.slides.internal.z0k.t4 c8;

   @Override
   public final void dispose() {
      if (this.c8 != null) {
         this.c8.dispose();
      }
   }

   protected x8 h0() {
      return this.n5;
   }

   protected n3 u9() {
      return this.l6;
   }

   protected final com.aspose.slides.ms.System.Xml.c7 s7() {
      return this.a6;
   }

   protected final com.aspose.slides.internal.n8e.u4 x8() {
      return this.u9;
   }

   protected y4 a6() {
      return this.u3;
   }

   protected e2(y4 var1, x8 var2) {
      this.u3 = var1;
      this.n5 = var2;
   }

   protected e2(y4 var1, n3 var2) {
      this.u3 = var1;
      this.l6 = var2;
   }

   protected abstract void n5(String... var1);

   protected final void n5(k0t var1, SortedList<String, String> var2, String var3, boolean var4, boolean var5) {
      if (this.k5) {
         throw new Exception(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Parsing must be started once time per instance of PartParser. ", "One instance of PartParser corresponds to one part."
            })
         );
      }

      this.k5 = true;
      com.aspose.slides.internal.z0k.y1 var6 = this.n5(var1, var5);
      this.a6 = com.aspose.slides.internal.n8e.s9.n5(var6, var1, var2, var3, var4, false);
   }

   private com.aspose.slides.internal.z0k.y1 n5(k0t var1, boolean var2) {
      boolean var3 = false;
      boolean var4 = var1 == null && var3;
      this.c8 = this.n5(this.a6().c8());
      if (var2) {
         try {
            com.aspose.slides.internal.z0k.t4 var5 = com.aspose.slides.internal.n8e.a0.n5(this.c8);
            this.c8.dispose();
            this.c8 = var5;
         } catch (RuntimeException var10) {
            this.c8.dispose();
            throw var10;
         }
      }

      long var6 = this.c8.getPosition();
      com.aspose.slides.internal.n8e.j4 var8 = com.aspose.slides.internal.n8e.a0.n5(this.c8, var4);
      this.c8.seek(var6, 0);
      return new com.aspose.slides.internal.n8e.g7(this.c8, var8);
   }

   protected void n3() {
      this.u3.n5(true);
   }

   protected void y4() {
      if (this.k5) {
         throw new t5(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Parsing must be started once time per instance of PartParser. ", "One instance of PartParser corresponds to one part."
            })
         );
      }

      this.k5 = true;
      this.h0 = new com.aspose.slides.internal.z0k.e2();
      this.u9 = new com.aspose.slides.internal.n8e.u4(this.h0, com.aspose.slides.internal.l7h.j5.z3(), this.a6().x8().h0());
      this.u9.l6(4);
      this.u9.n5(this.a6().x8().l6() ? 1 : 0);
      this.u9.l6(true);
   }

   protected void e2() {
      this.u9.n5();
      this.u9.u9();
      this.u9.a6();
      this.a6().n5(this.h0.toArray());
   }

   private com.aspose.slides.internal.z0k.t4 n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (!this.u3.x8().n5()) {
         return var1;
      }

      com.aspose.slides.internal.z0k.m3 var2 = new com.aspose.slides.internal.z0k.m3(var1);
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(var2.c8());
      SortedDictionary$Enumerator var4 = s7.n5.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            var3.n5((String)var5.getKey(), (String)var5.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return new com.aspose.slides.internal.z0k.e2(com.aspose.slides.internal.l7h.j5.z3().u3(var3.toString()));
   }
}
