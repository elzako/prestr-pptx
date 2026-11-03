package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

public final class VbaProject implements IVbaProject {
   private com.aspose.slides.internal.l6z.h6 n5;
   private VbaModuleCollection l6;
   private VbaReferenceCollection k5;

   public VbaProject() {
      this.n5(new com.aspose.slides.internal.l6z.h6(1252, "VBAProject"));
   }

   public VbaProject(byte[] data) {
      this.n5(new com.aspose.slides.internal.l6z.h6(data));
   }

   VbaProject(com.aspose.slides.internal.l6z.h6 vbaContainer) {
      this.n5(vbaContainer);
   }

   private void n5(com.aspose.slides.internal.l6z.h6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.l6 = new VbaModuleCollection(this);
      this.k5 = new VbaReferenceCollection(this);
      this.n5 = var1;
      this.k5();
      this.u3();
   }

   @Override
   public final String getName() {
      return this.n5.l6().n5().n5().l6().l6();
   }

   @Override
   public final IVbaModuleCollection getModules() {
      return this.l6;
   }

   @Override
   public final IVbaReferenceCollection getReferences() {
      return this.k5;
   }

   @Override
   public final byte[] toBinary() {
      return this.n5.n5();
   }

   @Override
   public final boolean isPasswordProtected() {
      return this.n5.k5();
   }

   final VbaModule n5(String var1) {
      com.aspose.slides.internal.l6z.w1 var2 = this.n5.n5(var1);
      return new VbaModule(var1, var2);
   }

   final void n5(IVbaReference var1) {
      VbaReferenceOleTypeLib var2 = com.aspose.slides.internal.v6g.k5.n5(var1, VbaReferenceOleTypeLib.class);
      if (var2 == null) {
         throw new NotSupportedException("Only OLE TypeLib references allowed");
      }

      this.n5.n5(var2.getName(), var2.getLibid());
   }

   final void l6(String var1) {
      this.n5.l6(var1);
   }

   final boolean n5(VbaProject var1) {
      if (var1 == null) {
         return false;
      }

      if (!com.aspose.slides.ms.System.d1.a6(var1.getName(), this.getName())) {
         return false;
      }

      if (var1.getModules().size() != this.getModules().size()) {
         return false;
      }

      for (int var2 = 0; var2 < this.getModules().size(); var2++) {
         if (!((VbaModule)this.getModules().get_Item(var2)).n5((VbaModule)var1.getModules().get_Item(var2))) {
            return false;
         }
      }

      return true;
   }

   final VbaProject n5() {
      VbaProject var1 = new VbaProject();
      var1.n5.l6().n5().n5().l6().n5(this.getName());
      IGenericEnumerator var2 = this.getModules().iterator();

      try {
         while (var2.hasNext()) {
            VbaModule var3 = (VbaModule)var2.next();
            var1.l6.n5(var3.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private void k5() {
      Dictionary$Enumerator var1 = this.n5.l6().l6().iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            com.aspose.slides.internal.l6z.w1 var3 = (com.aspose.slides.internal.l6z.w1)var2.getValue();
            if (var3.l6().k5().l6()) {
               VbaModule var4 = new VbaModule((String)var2.getKey(), var3);
               this.l6.n5(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void u3() {
      if (this.n5.l6().n5().l6() == null) {
         throw new InvalidOperationException();
      }

      List$Enumerator var1 = this.n5.l6().n5().l6().n5().iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.l6z.o5 var2 = (com.aspose.slides.internal.l6z.o5)var1.next();
            String var3 = "";
            if (var2.n5() != null && var2.n5().l6() != null) {
               var3 = var2.n5().l6();
            }

            com.aspose.slides.internal.l6z.j8 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.l6z.j8.class);
            if (var4 != null) {
               v5z var5 = new v5z(var3);
               this.k5.n5().addItem(var5);
            } else {
               com.aspose.slides.internal.l6z.v3 var11 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.l6z.v3.class);
               if (var11 != null) {
                  VbaReferenceOleTypeLib var6 = new VbaReferenceOleTypeLib(var3, var11.l6());
                  this.k5.n5().addItem(var6);
               } else {
                  com.aspose.slides.internal.l6z.v8 var12 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.l6z.v8.class);
                  if (var12 == null) {
                     throw new InvalidOperationException("Unknown VBA Project reference type");
                  }

                  i7i var7 = new i7i(var3);
                  this.k5.n5().addItem(var7);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final com.aspose.slides.internal.l6z.h6 l6() {
      return this.n5;
   }
}
