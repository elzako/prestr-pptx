package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class g3g extends o5r {
   private Stack<Dictionary<String, String>> n5 = new Stack<>();
   private final com.aspose.slides.ms.System.Xml.l1 l6;
   private final c8r k5;
   private static final com.aspose.slides.internal.r7c.c8 u3 = new com.aspose.slides.internal.r7c.c8("\\d+([.|,]\\d+)?");
   private static final d8b a6 = d8b.n5();

   public g3g(com.aspose.slides.ms.System.Xml.l1 var1, c8r var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public void n5(MathAccent var1) {
      this.k5.n5(true);

      try {
         this.l6.y4("mover");
         this.n5(var1.getBase());
         this.n5("mo", com.aspose.slides.ms.System.d1.n5(var1.getCharacter(), 1), new KeyValuePair<>("accent", "true"));
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathArray var1) {
      this.k5.n5(false);

      try {
         this.l6.y4("mtable");
         String var2 = null;
         switch (var1.getBaseJustification()) {
            case 1:
               var2 = "top";
               break;
            case 2:
               var2 = "center";
               break;
            case 3:
               var2 = "bottom";
         }

         if (var2 != null) {
            this.l6.u3("align", var2);
         }

         IGenericEnumerator var3 = var1.getArguments().iterator();

         try {
            while (var3.hasNext()) {
               IMathElement var4 = (IMathElement)var3.next();
               this.l6.y4("mtr");
               this.l6.y4("mtd");
               this.n5(var4);
               this.l6.s7();
               this.l6.s7();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathBar var1) {
      boolean var2 = var1.getPosition() == 2;
      this.k5.n5(true);

      try {
         this.l6.y4(var2 ? "munder" : "mover");
         this.l6.u3(var2 ? "accentunder" : "accent", "true");
         this.n5(var1.getBase());
         this.n5("mo", var2 ? "_" : "¯", new KeyValuePair<>("stretchy", "true"));
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathBorderBox var1) {
      this.k5.n5(false);

      try {
         com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
         if (!var1.getHideBottom() && !var1.getHideTop() && !var1.getHideLeft() && !var1.getHideRight()) {
            var2.n5(" box");
         } else {
            if (!var1.getHideBottom()) {
               var2.n5(" bottom");
            }

            if (!var1.getHideTop()) {
               var2.n5(" top");
            }

            if (!var1.getHideLeft()) {
               var2.n5(" left");
            }

            if (!var1.getHideRight()) {
               var2.n5(" right");
            }
         }

         if (var1.getStrikethroughHorizontal()) {
            var2.n5(" horizontalstrike");
         }

         if (var1.getStrikethroughVertical()) {
            var2.n5(" verticalstrike");
         }

         if (var1.getStrikethroughTopLeftToBottomRight()) {
            var2.n5(" downdiagonalstrike");
         }

         if (var1.getStrikethroughBottomLeftToTopRight()) {
            var2.n5(" updiagonalstrike");
         }

         this.l6.y4("menclose");
         this.l6.u3("notation", var2.toString());
         this.n5(var1.getBase());
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathDelimiter var1) {
      this.k5.n5(true);

      try {
         this.l6.y4("mfenced");
         this.l6.u3("open", com.aspose.slides.ms.System.d1.n5(var1.getBeginningCharacter(), 1));
         this.l6.u3("close", com.aspose.slides.ms.System.d1.n5(var1.getEndingCharacter(), 1));
         this.l6.u3("separators", com.aspose.slides.ms.System.d1.n5(var1.getSeparatorCharacter(), 1));
         IGenericEnumerator var2 = var1.getArguments().iterator();

         try {
            while (var2.hasNext()) {
               IMathElement var3 = (IMathElement)var2.next();
               this.n5(var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathFraction var1) {
      this.k5.n5(true);

      try {
         if (var1.getFractionType() == 3) {
            this.n5(var1.getNumerator());
            this.n5("mo", "/");
            this.n5(var1.getDenominator());
         } else {
            this.l6.y4("mfrac");
            switch (var1.getFractionType()) {
               case 1:
                  break;
               case 2:
                  this.l6.u3("bevelled", "true");
                  break;
               case 3:
               default:
                  throw new NotImplementedException();
               case 4:
                  this.l6.u3("linethickness", "0");
            }

            this.n5(var1.getNumerator());
            this.n5(var1.getDenominator());
            this.l6.s7();
         }
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathFunction var1) {
      boolean var2 = this.k5.l6();
      this.k5.n5(true);

      try {
         if (var2) {
            this.l6.y4("mrow");
         }

         this.n5(var1.getName());
         this.n5("mo", "\u2061");
         this.n5(var1.getBase());
         if (var2) {
            this.l6.s7();
         }
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathBox var1) {
      this.k5.n5(true);
      if (var1.getNoBreak()) {
         this.k5.l6(true);
      }

      try {
         MathematicalText var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getBase(), MathematicalText.class);
         this.n5(var1.getBase());
      } finally {
         this.k5.k5();
         this.k5.l6(false);
      }
   }

   @Override
   public void n5(MathGroupingCharacter var1) {
      this.k5.n5(true);

      try {
         this.l6.y4(var1.getPosition() == 1 ? "mover" : "munder");
         this.n5(var1.getBase());
         this.n5("mo", com.aspose.slides.ms.System.d1.n5(var1.getCharacter(), 1), new KeyValuePair<>("stretchy", "true"));
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathLeftSubSuperscriptElement var1) {
      this.k5.n5(true);

      try {
         this.l6.y4("mmultiscripts");
         this.n5(var1.getBase());
         this.l6.y4("mprescripts");
         this.l6.s7();
         this.n5(var1.getSubscript());
         this.n5(var1.getSuperscript());
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathLimit var1) {
      this.k5.n5(true);

      try {
         this.l6.y4(var1.getUpperLimit() ? "mover" : "munder");
         this.n5(var1.getBase());
         this.n5(var1.getLimit());
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathBlock var1) {
      boolean var2 = this.k5.l6();
      if (var2) {
         this.l6.y4("mrow");
      }

      this.k5.n5(false);

      try {
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               IMathElement var4 = (IMathElement)var3.next();
               this.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      } finally {
         this.k5.k5();
      }

      if (var2) {
         this.l6.s7();
      }
   }

   @Override
   public void n5(MathematicalText var1) {
      boolean var2 = this.k5.l6();
      String var3 = var1.getValue();
      List var4 = new List();

      for (int var5 = 0; var5 < var3.length(); var5++) {
         int var6 = n5(var3, var5);
         if (var6 > 0) {
            var4.addItem(new z4q("mo", com.aspose.slides.ms.System.d1.l6(var3, var5, var6)));
            var5 += var6 - 1;
         } else if (com.aspose.slides.ms.System.t9.a6(var3.charAt(var5))) {
            var4.addItem(new z4q("mi", com.aspose.slides.ms.System.d1.l6(var3, var5, 2)));
            var5++;
         } else if (com.aspose.slides.ms.System.t9.u3(var3.charAt(var5))) {
            com.aspose.slides.internal.r7c.u3 var7 = u3.l6(var3, var5);
            var4.addItem(new z4q("mn", var7.k5()));
            var5 += var7.l6() - 1;
         } else {
            int var14 = l6(var3, var5);
            if (var14 > 0) {
               z4q var8 = new z4q("mspace", null, 1);
               var8.n5("linebreak", "newline");
               var4.addItem(var8);
               var5 += var14 - 1;
            } else {
               var4.addItem(new z4q("mi", com.aspose.slides.ms.System.d1.n5(var3.charAt(var5), 1)));
            }
         }
      }

      if (var2 && var4.size() != 1) {
         this.l6.y4("mrow");
      }

      List$Enumerator var12 = var4.iterator();

      try {
         while (var12.hasNext()) {
            z4q var13 = (z4q)var12.next();
            this.n5(var13);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      if (var2 && var4.size() != 1) {
         this.l6.s7();
      }
   }

   @Override
   public void n5(MathMatrix var1) {
      this.k5.n5(false);

      try {
         this.l6.y4("mtable");
         String var2 = null;
         switch (var1.getBaseJustification()) {
            case 1:
               var2 = "top";
               break;
            case 2:
               var2 = "center";
               break;
            case 3:
               var2 = "bottom";
         }

         if (var2 != null) {
            this.l6.u3("align", var2);
         }

         for (int var3 = 0; var3 < var1.getRowCount(); var3++) {
            this.l6.y4("mtr");

            for (int var4 = 0; var4 < var1.getColumnCount(); var4++) {
               this.l6.y4("mtd");
               this.n5(var1.get_Item(var3, var4));
               this.l6.s7();
            }

            this.l6.s7();
         }

         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathNaryOperator var1) {
      this.k5.n5(true);

      try {
         boolean var2 = var1.getLimitLocation() == 1 || var1.getLimitLocation() == 0;
         this.l6.y4("mrow");
         this.l6.y4(var2 ? "munderover" : "msubsup");
         this.n5("mo", com.aspose.slides.ms.System.d1.n5(var1.getOperator(), 1));
         this.n5(var1.getSubscript());
         this.n5(var1.getSuperscript());
         this.l6.s7();
         this.k5.n5(false);

         try {
            this.n5(var1.getBase());
         } finally {
            this.k5.k5();
         }

         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathRadical var1) {
      boolean var2 = var1.getDegree() == null && var1.getHideDegree();
      this.k5.n5(!var2);

      try {
         if (var2) {
            this.l6.y4("msqrt");
            this.n5(var1.getBase());
            this.l6.s7();
         } else {
            this.l6.y4("mroot");
            this.n5(var1.getBase());
            this.n5(var1.getDegree());
            this.l6.s7();
         }
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathRightSubSuperscriptElement var1) {
      this.k5.n5(true);

      try {
         this.l6.y4("msubsup");
         this.n5(var1.getBase());
         this.n5(var1.getSubscript());
         this.n5(var1.getSuperscript());
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathSubscriptElement var1) {
      this.k5.n5(true);

      try {
         this.l6.y4("msub");
         this.n5(var1.getBase());
         this.n5(var1.getSubscript());
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(MathSuperscriptElement var1) {
      this.k5.n5(true);

      try {
         this.l6.y4("msup");
         this.n5(var1.getBase());
         this.n5(var1.getSuperscript());
         this.l6.s7();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public void n5(k3k var1) {
   }

   public void n5(IMathElement var1) {
      MathElementBase var2 = (MathElementBase)var1;
      if (var2 == null) {
         this.n5();
      } else {
         boolean var3 = this.n5(this.l6, var1);
         var2.n5(this);
         if (var3) {
            this.n5(this.l6);
         }
      }
   }

   private void n5() {
      this.l6.y4("mrow");
      this.l6.s7();
   }

   private void n5(z4q var1) {
      this.l6.y4(var1.n5());
      if (this.k5.u3() && (com.aspose.slides.ms.System.d1.a6(var1.n5(), "mo") || com.aspose.slides.ms.System.d1.a6(var1.n5(), "mspace"))) {
         this.l6.u3("linebreak", "nobreak");
      }

      if (var1.k5() != null) {
         List$Enumerator var2 = var1.k5().iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               this.l6.u3((String)var3.getKey(), (String)var3.getValue());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      this.l6.l6(var1.l6());
      this.l6.s7();
   }

   private void n5(String var1, String var2) {
      this.n5(new z4q(var1, var2));
   }

   private void n5(String var1, String var2, KeyValuePair<String, String>... var3) {
      this.n5(new z4q(var1, var2, com.aspose.slides.ms.System.u3.n5(var3)));
   }

   private static int n5(String var0, int var1) {
      return a6.n5(var0, var1);
   }

   private static int l6(String var0, int var1) {
      Pattern var2 = Pattern.compile("\r\n|\n|\r");
      Matcher var3 = var2.matcher(var0);
      int var4 = 0;
      if (var3.find(var1)) {
         String var5 = var3.group();
         if (var5.length() > var4) {
            var4 = var5.length();
         }
      }

      return var4;
   }

   private boolean n5(com.aspose.slides.ms.System.Xml.l1 var1, IMathElement var2) {
      IPortionFormat var3 = this.l6(var2);
      if (var3 == null) {
         return false;
      }

      String var4 = "mathcolor";
      String var5 = "mathvariant";
      Dictionary var6 = this.n5.size() > 0 ? this.n5.peek() : new Dictionary();
      Dictionary var7 = new Dictionary(var6);
      String var8 = null;
      String var9 = null;
      String[] var10 = new String[]{var8};
      boolean var11 = this.n5(var3, var7, "mathcolor", var10);
      var8 = var10[0];
      String[] var12 = new String[]{var9};
      boolean var13 = this.l6(var3, var7, "mathvariant", var12);
      var9 = var12[0];
      if (!var11 && !var13) {
         return false;
      }

      var1.y4("mstyle");
      if (var11) {
         var7.set_Item("mathcolor", var8);
         var1.u3("mathcolor", var8);
      }

      if (var13) {
         var7.set_Item("mathvariant", var9);
         var1.u3("mathvariant", var9);
      }

      this.n5.push(var7);
      return true;
   }

   private void n5(com.aspose.slides.ms.System.Xml.l1 var1) {
      var1.s7();
      this.n5.pop();
   }

   private IPortionFormat l6(IMathElement var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, MathBlock.class)) {
         MathBlock var2 = (MathBlock)var1;
         IPortionFormat var3 = null;

         for (IMathElement var7 : var2.getChildren()) {
            IPortionFormat var8 = this.l6(var7);
            if (var8 == null) {
               return null;
            }

            if (var3 == null) {
               var3 = var8;
            } else if (!this.n5(var3, var8)) {
               return null;
            }
         }

         return var3;
      } else {
         return this.k5(var1);
      }
   }

   private boolean n5(IPortionFormat var1, IPortionFormat var2) {
      if (var1.getFillFormat().getFillType() != var2.getFillFormat().getFillType()) {
         return false;
      } else {
         return var1.getFillFormat().getFillType() == 1
               && ((ColorFormat)var1.getFillFormat().getSolidFillColor()).u3().h0() != ((ColorFormat)var2.getFillFormat().getSolidFillColor()).u3().h0()
            ? false
            : var1.getFontBold() == var2.getFontBold() && var1.getFontItalic() == var2.getFontItalic();
      }
   }

   private IPortionFormat k5(IMathElement var1) {
      MathematicalText var2 = com.aspose.slides.internal.v6g.k5.n5(var1, MathematicalText.class);
      if (var2 != null) {
         return var2.getFormat();
      }

      q8r var3 = com.aspose.slides.internal.v6g.k5.n5(var1, q8r.class);
      if (var3 != null) {
         s7u var4 = var3.getControlCharacterProperties();
         if (var4 != null) {
            return var4.l6();
         }
      }

      return null;
   }

   private boolean n5(IPortionFormat var1, Dictionary<String, String> var2, String var3, String[] var4) {
      var4[0] = null;
      if (var1.getFillFormat().getFillType() != 1) {
         return false;
      }

      var4[0] = this.n5(((ColorFormat)var1.getFillFormat().getSolidFillColor()).u3().o8());
      return !var2.containsKey(var3) || !com.aspose.slides.ms.System.d1.a6((String)var2.get_Item(var3), var4[0]);
   }

   private boolean l6(IPortionFormat var1, Dictionary<String, String> var2, String var3, String[] var4) {
      var4[0] = this.n5(var1);
      return var4[0] == null ? false : !var2.containsKey(var3) || !com.aspose.slides.ms.System.d1.a6((String)var2.get_Item(var3), var4[0]);
   }

   private String n5(IPortionFormat var1) {
      if (var1.getFontItalic() == 1 && var1.getFontBold() == 1) {
         return "bold-italic";
      } else if (var1.getFontBold() == 1) {
         return "bold";
      } else {
         return var1.getFontItalic() == 1 ? "italic" : null;
      }
   }

   private String n5(com.aspose.slides.internal.o9b.c8 var1) {
      if (com.aspose.slides.internal.o9b.c8.n5(var1, com.aspose.slides.internal.o9b.c8.u3)) {
         return "transparent";
      }

      String var2 = com.aspose.slides.ms.System.e2.n5(var1.x8(), "X2");
      String var3 = com.aspose.slides.ms.System.e2.n5(var1.n3(), "X2");
      String var4 = com.aspose.slides.ms.System.e2.n5(var1.y4(), "X2");
      return com.aspose.slides.ms.System.d1.n5("#", var2, var3, var4);
   }

   @Override
   public void n5(MathPhantom var1) {
   }
}
