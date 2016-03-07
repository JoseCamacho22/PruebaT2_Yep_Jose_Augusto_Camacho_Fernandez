package josecamacho.yep;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/*
 *
 * Jose Augusto Camacho Fernandez
 *
 */

    public class  Mytestcase extends ActivityInstrumentationTestCase2<LoginActivity> {

        private Button login;
        private EditText username;
        private EditText password;
        private static final String Login = "prueba";
        private static final String Password = "prueba";


        private LoginActivity actividad;

        public Mytestcase() {
            super(LoginActivity.class);
        }


        @Override
        protected void setUp() throws Exception {
            super.setUp();

// Obtengo la activity actual
            actividad = getActivity();

// Instancio lo necesario (edittext y button)

            login = (Button) actividad.findViewById(R.id.button);

        }

        @Override
        protected void tearDown() throws Exception {
            super.tearDown();
        }


        public void testAddValues() {

            Boolean UsuarioLogeado = false;


// Clikeo el boton de LogIn
            TouchUtils.clickView(this, login);

//Test a sido pasado con exitooooooo!!!!!!
        }
    }

