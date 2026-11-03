package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.Hashtable;

public class a0 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private static Hashtable u3 = n5();

   public static a0 n5(boolean var0, boolean var1, boolean var2) {
      a0 var3 = new a0();
      var3.n5 = var0;
      var3.l6 = var1;
      var3.k5 = var2;
      return var3;
   }

   public static a0 n5(String var0) {
      return (a0)u3.get_Item(var0);
   }

   private static Hashtable n5() {
      boolean var0 = false;
      boolean var1 = true;
      Hashtable var2 = new Hashtable(26, com.aspose.slides.ms.System.p6.u3());
      var2.addItem("action", n5(var0, var1, var0));
      var2.addItem("checked", n5(var1, var0, var0));
      var2.addItem("cite", n5(var0, var1, var0));
      var2.addItem("classid", n5(var0, var1, var0));
      var2.addItem("codebase", n5(var0, var1, var0));
      var2.addItem("compact", n5(var1, var0, var0));
      var2.addItem("data", n5(var0, var1, var0));
      var2.addItem("datasrc", n5(var0, var1, var0));
      var2.addItem("declare", n5(var1, var0, var0));
      var2.addItem("defer", n5(var1, var0, var0));
      var2.addItem("disabled", n5(var1, var0, var0));
      var2.addItem("for", n5(var0, var1, var0));
      var2.addItem("href", n5(var0, var1, var0));
      var2.addItem("ismap", n5(var1, var0, var0));
      var2.addItem("longdesc", n5(var0, var1, var0));
      var2.addItem("multiple", n5(var1, var0, var0));
      var2.addItem("name", n5(var0, var0, var1));
      var2.addItem("nohref", n5(var1, var0, var0));
      var2.addItem("noresize", n5(var1, var0, var0));
      var2.addItem("noshade", n5(var1, var0, var0));
      var2.addItem("nowrap", n5(var1, var0, var0));
      var2.addItem("profile", n5(var0, var1, var0));
      var2.addItem("readonly", n5(var1, var0, var0));
      var2.addItem("selected", n5(var1, var0, var0));
      var2.addItem("src", n5(var0, var1, var0));
      var2.addItem("usemap", n5(var0, var1, var0));
      return var2;
   }
}
