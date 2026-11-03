package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.l7h.u6;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.f4;

public class k5 extends d2 {
   public k5(l6 var1) {
      super(var1);
   }

   public final void n5() {
      short var1 = this.h0().l6();
      y1 var2 = new y1(this.h0());
      var2.n5();
      this.u9().l6(var1);
      this.u9().k5(0);
      this.u9().n5(this.l6());
      var2.n5(87);
      this.n5(var1);
   }

   private byte[] l6() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      byte[] var11;
      try {
         u6 var2 = new u6(false);
         com.aspose.slides.internal.b8.n5 var3 = new com.aspose.slides.internal.b8.n5(var1, var2, false);
         var3.n5("document");
         var3.l6("locales");
         var3.l6("locale");
         var3.k5("name", "en_US");
         var3.k5("font", d1.n5(new String[]{this.h0().h0().u3(), "_AW"}));
         n5(var3, "topPane", this.h0().k5().k7());
         n5(var3, "leftPane", this.h0().k5().m3());
         n5(var3, "bottomPane", this.h0().k5().z8());
         n5(var3, "readModePane", this.h0().k5().j5());
         n5(var3, "dialogs", this.h0().k5().w1());
         var3.k5();
         var3.k5();
         this.n5(var3);
         this.h0().t2().n5(var3);

         for (int var4 = 0; var4 < this.h0().a6().size(); var4++) {
            q0 var5 = this.h0().a6().get_Item(var4);
            var3.l6("page");
            var3.k5("width", f4.n5(var5.n5()));
            var3.k5("height", f4.n5(var5.l6()));
            Dictionary$Enumerator var6 = var5.k5().iterator();

            try {
               while (var6.hasNext()) {
                  KeyValuePair var7 = (KeyValuePair)var6.next();
                  com.aspose.slides.internal.e1.m1 var8 = (com.aspose.slides.internal.e1.m1)var7.getValue();
                  String var9 = var8.l6() && var8.k5() != null ? d1.k5(var8.k5(),new char[]{ '#'}) : d1.n5;
                  if (!var8.l6() || this.h0().c8().containsKey(var9)) {
                     var3.l6("hyperlink");
                     var3.k5("id", f4.n5(((Short)var7.getKey()).shortValue()));
                     var3.k5("islocal", f4.n5(var8.l6()));
                     var3.n5().a6(var8.l6() ? this.h0().c8().get_Item(var9).toString() : var8.k5());
                     var3.k5();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            var3.k5();
         }

         var3.l6();
         var11 = com.aspose.slides.internal.n2d.t4.l6(var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      return var11;
   }

   private void n5(com.aspose.slides.internal.b8.n5 var1) {
      var1.l6("config");
      n5(var1, "showFullScreen", f4.n5(this.h0().k5().h0()), true);
      n5(var1, "showPageStepper", f4.n5(this.h0().k5().c8()), true);
      n5(var1, "showSearch", f4.n5(this.h0().k5().t2()), true);
      n5(var1, "showTopPane", f4.n5(this.h0().k5().s7()), true);
      n5(var1, "showBottomPane", f4.n5(this.h0().k5().x8()), true);
      n5(var1, "showLeftPane", f4.n5(this.h0().k5().n3()), true);
      n5(var1, "startOpenLeftPane", f4.n5(this.h0().k5().y4()), true);
      n5(var1, "allowReadMode", f4.n5(this.h0().k5().e2()), true);
      n5(var1, "enableContextMenu", f4.n5(this.h0().k5().t9()), true);
      n5(var1, "controlFlags", f4.n5(this.h0().k5().z1()), true);
      n5(var1, "leftPaneTabs", f4.n5(this.h0().k5().t4()), true);
      if (this.h0().k5().q0() != null) {
         n5(var1, "logoImage", com.aspose.slides.ms.System.z3.n5(this.h0().k5().q0()), false);
      }

      if (com.aspose.slides.internal.n2d.t4.l6(this.h0().k5().z3())) {
         n5(var1, "logoLink", this.h0().k5().z3(), true);
      }

      var1.k5();
   }

   private static void n5(com.aspose.slides.internal.b8.n5 var0, String var1, String var2, boolean var3) {
      var0.l6("param");
      var0.k5("name", var1);
      var0.k5("allowOverride", f4.n5(var3));
      var0.n5().a6(var2);
      var0.k5();
   }

   private static void n5(com.aspose.slides.internal.b8.n5 var0, String var1, Dictionary<String, String> var2) {
      var0.l6("bundle");
      var0.k5("name", var1);
      Dictionary$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            String var5 = (String)var4.getKey();
            String var6 = (String)var4.getValue();
            if (com.aspose.slides.internal.n2d.t4.l6(var6)) {
               var0.l6("item");
               var0.k5("id", var5);
               var0.k5("tip", var6);
               var0.k5();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var0.k5();
   }

   private void n5(short var1) {
      String var2 = "DocumentDescriptor";
      y1 var3 = new y1(this.h0());
      var3.n5();
      this.u9().k5(1);
      this.u9().n5("DocumentDescriptor");
      this.u9().n5(w1.k5());
      var3.n5(82);
      var3.n5();
      this.u9().l6(1);
      this.u9().l6(var1);
      this.u9().n5("DocumentDescriptor");
      var3.n5(76);
   }
}
