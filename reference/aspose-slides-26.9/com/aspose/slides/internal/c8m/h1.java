package com.aspose.slides.internal.c8m;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.b8c.k0t;

public class h1 extends v7 {
   public static final String[] n5 = new String[]{"opc-relationships.xsd"};
   public static final k0t l6 = n5(n5);

   @Override
   public String n5() {
      return "application/vnd.openxmlformats-package.relationships+xml";
   }

   @Override
   public w4 l6() {
      throw new InvalidOperationException("not applicable");
   }

   @Override
   public k0t u3() {
      return l6;
   }
}
