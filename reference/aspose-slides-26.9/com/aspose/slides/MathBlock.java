package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import java.io.OutputStream;

public final class MathBlock extends MathElementBase implements IMathBlock, r0g {
   private final o3q n5;
   private MathParagraph u3;

   @Override
   public final int getCount() {
      return this.n5.getCount();
   }

   @Override
   public final IMathElement get_Item(int index) {
      return this.n5.get_Item(index);
   }

   public final void set_Item(int index, IMathElement value) {
      if (((MathElementBase)value).Y_()) {
         throw new InvalidOperationException("Only simple elements that are not containers are allowed as child elements");
      }

      if (!com.aspose.slides.ms.System.j8.l6(this.n5.get_Item(index), value)) {
         ((MathElementBase)value).n5(this);
         ((MathElementBase)this.n5.get_Item(index)).u3();
         this.n5.n5(index, value);
         this.k5();
      }
   }

   public final boolean isReadOnly() {
      return false;
   }

   @Override
   public final IMathElement[] getChildren() {
      if (this.n5.getCount() == 0) {
         return k5;
      }

      IMathElement[] var1 = new IMathElement[this.n5.getCount()];
      this.n5.copyTo(var1, 0);
      return var1;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }

   public MathBlock() {
      this.n5 = new o3q();
   }

   MathBlock(int capacity) {
      this.n5 = new o3q(capacity);
   }

   public MathBlock(IMathElement mathElement) {
      if (mathElement == null) {
         throw new ArgumentNullException("mathElement");
      }

      ((MathElementBase)mathElement).n5(this);
      this.n5 = new o3q();
      this.n5.add(mathElement);
   }

   MathBlock(IMathElement mathElement, boolean dummy) {
      if (mathElement == null) {
         throw new ArgumentNullException("mathElement");
      }

      ((MathElementBase)mathElement).u3();
      ((MathElementBase)mathElement).n5(this);
      this.n5 = new o3q();
      this.n5.add(mathElement);
   }

   public MathBlock(IGenericEnumerable<IMathElement> mathElements) {
      if (mathElements == null) {
         throw new ArgumentNullException("mathElements");
      }

      IGenericEnumerator var2 = mathElements.iterator();

      try {
         while (var2.hasNext()) {
            IMathElement var3 = (IMathElement)var2.next();
            ((MathElementBase)var3).n5(this);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.n5 = new o3q(mathElements);
   }

   @Override
   public final void add(IMathElement item) {
      if (((MathElementBase)item).Y_()) {
         throw new InvalidOperationException("Only simple elements that are not containers are allowed as child elements");
      }

      ((MathElementBase)item).n5(this);
      this.n5.add(item);
      this.k5();
   }

   @Override
   public final void clear() {
      IGenericEnumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            IMathElement var2 = (IMathElement)var1.next();
            ((MathElementBase)var2).u3();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.n5.clear();
      this.k5();
   }

   @Override
   public final boolean contains(IMathElement item) {
      return this.n5.contains(item);
   }

   @Override
   public final void copyTo(IMathElement[] array, int arrayIndex) {
      this.n5.copyTo(array, arrayIndex);
   }

   @Override
   public final boolean remove(IMathElement item) {
      boolean var2 = this.n5.remove(item);
      if (var2) {
         ((MathElementBase)item).u3();
         this.k5();
      }

      return var2;
   }

   @Override
   public final IGenericEnumerator<IMathElement> iterator() {
      return this.n5.iterator();
   }

   public final IEnumerator iteratorJava() {
      return this.n5.n5();
   }

   @Override
   public final int indexOf(IMathElement item) {
      return this.n5.indexOf(item);
   }

   @Override
   public final void insert(int index, IMathElement item) {
      if (((MathElementBase)item).Y_()) {
         throw new InvalidOperationException("Only simple elements that are not containers are allowed as child elements");
      }

      this.n5.insert(index, item);

      try {
         ((MathElementBase)item).n5(this);
         this.k5();
      } catch (RuntimeException var4) {
         this.n5.removeAt(index);
         throw var4;
      }
   }

   @Override
   public final void removeAt(int index) {
      IMathElement var2 = this.n5.get_Item(index);
      this.n5.removeAt(index);
      ((MathElementBase)var2).u3();
      this.k5();
   }

   @Override
   public IMathBlock join(IMathElement mathElement) {
      if (com.aspose.slides.internal.v6g.k5.l6(mathElement, IMathBlock.class)) {
         return this.joinBlock((IMathBlock)mathElement);
      }

      this.add(mathElement);
      return this;
   }

   @Override
   public IMathBlock join(String mathText) {
      return this.join(new MathematicalText(mathText));
   }

   @Override
   public final IMathBlock joinBlock(IMathBlock other) {
      IMathElement[] var2 = new IMathElement[other.getCount()];
      other.copyTo(var2, 0);
      other.clear();

      for (IMathElement var6 : var2) {
         this.n5.add(var6);
         ((MathElementBase)var6).n5(this);
      }

      this.k5();
      return this;
   }

   @Override
   public final IMathDelimiter delimit(char separatorCharacter) {
      MathDelimiter var2 = new MathDelimiter(this.n5, null);
      var2.setSeparatorCharacter(separatorCharacter);
      var2.setBeginningCharacter('\u0000');
      var2.setEndingCharacter('\u0000');
      return var2;
   }

   @Override
   public IMathDelimiter enclose(char beginningCharacter, char endingCharacter) {
      return this.enclose(beginningCharacter, endingCharacter, '\u0000');
   }

   @Override
   public final IMathDelimiter enclose(char beginningCharacter, char endingCharacter, char separatorCharacter) {
      MathDelimiter var4 = new MathDelimiter(this.n5, null);
      var4.setBeginningCharacter(beginningCharacter);
      var4.setSeparatorCharacter(separatorCharacter);
      var4.setEndingCharacter(endingCharacter);
      return var4;
   }

   @Override
   public IMathArray toMathArray() {
      return new MathArray(this.n5);
   }

   @Override
   public final void writeAsMathMl(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new MathBlock$1(this, stream));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      s3w var2 = new s3w();
      var2.n5(this, var1);
   }

   @Override
   boolean Y_() {
      return true;
   }

   final void n5(MathParagraph var1) {
      if (this.u3 != null) {
         throw new PptxEditException("It is not possible to set a new math block parent without removing the old one.");
      }

      if (var1 == null) {
         throw new ArgumentNullException("parentImmediate", "To set the value to null you need to call the method ResetParent");
      }

      this.u3 = var1;
   }

   final void l6() {
      this.u3 = null;
   }

   final void k5() {
      MathParagraph var1 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), MathParagraph.class);
      if (var1 != null) {
         var1.k5();
      }
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
